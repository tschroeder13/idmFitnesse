package fitnesse.crypto;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import fitnesse.crypto.dbfit.util.crypto.CryptoFactories;
import fitnesse.crypto.dbfit.util.crypto.CryptoService;

public class GuhFitnessePwdCyptUI {
	private static final String _def = "!define ";
	private static String alias;
	private static String name;
	private static String pwd;
	
	private static CryptoService cs = CryptoFactories.getCryptoServiceFactory().getCryptoService(
    		CryptoFactories.getCryptoKeyStoreFactory().newInstance()
    		);;
	private static CryptoService getCs() {
		return cs;
	}
	
	public static String getAlias() {
		return alias;
	}

	public static void setAlias(String alias) {
		GuhFitnessePwdCyptUI.alias = alias;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		GuhFitnessePwdCyptUI.name = name;
	}

	public static String getPwd() {
		return pwd;
	}

	public static void setPwd(String pwd) {
		GuhFitnessePwdCyptUI.pwd = "ENC("+getCs().encrypt(pwd)+")";
	}

	private static void showDialog(){
		JLabel aliasLabel = new JLabel("Please enter a connection alias:");
		JTextField aliasField= new JTextField();
		JLabel nameLabel = new JLabel("Please enter a username:");
		JTextField nameField = new JTextField();
		JLabel pwLabel = new JLabel("Please enter your password:");
    	JPasswordField jpf = new JPasswordField();
    	aliasField.requestFocus();
    	int exitCode = JOptionPane.showConfirmDialog(null,
        	new Object[]{aliasLabel, aliasField, nameLabel, nameField, pwLabel, jpf}, "Fitnesse Test Credentials Utility",
        	JOptionPane.OK_CANCEL_OPTION);
//    	0=OK 2=CANCEL -1=ESC 
    	if (exitCode==0) {
    		setAlias(aliasField.getText());
    		setName(name = nameField.getText());
    		setPwd(new String(jpf.getPassword()));
    		execute();
		}
	}
	
	private static void execute() {
		String result = _def+getAlias().toLowerCase()+"_adm_user {"+getName()+"}\n"+
						_def+getAlias().toLowerCase()+"_adm_pwd {"+getPwd()+"}";
		StringSelection stringSelection = new StringSelection (result);
		Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
		clpbrd.setContents (stringSelection, null);
		JOptionPane.showMessageDialog(null,
			    "The FitNesse variable definition:\n"
				+result+"\n is now in your system clipboard.",
			    "FitNesse Credential Utility",
			    JOptionPane.WARNING_MESSAGE);
	}

	public static void main(String[] args) {
		GuhFitnessePwdCyptUI.showDialog();
	}
	

}
