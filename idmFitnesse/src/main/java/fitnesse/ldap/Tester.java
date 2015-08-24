package fitnesse.ldap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.unboundid.ldap.sdk.SearchScope;

import fitnesse.crypto.dbfit.util.crypto.CryptoFactories;
import fitnesse.crypto.dbfit.util.crypto.CryptoService;

public class Tester {

	private CryptoService cs;
	public CryptoService getCs() {
		return cs;
	}

	public Tester() {
		this.cs = CryptoFactories.getCryptoServiceFactory().getCryptoService(
        		CryptoFactories.getCryptoKeyStoreFactory().newInstance()
        		);
	}

	public String isItATable(Map<String, String> map){
		
		return map.get("first name")+" heiﬂt mit Nachnamen "+map.get("last name");
	}
	
	public Map parameterTest(Map<String, String> map, List<String> list, String... vararg) {
		Map result = new HashMap<Object, Object>();
		StringBuilder mapStr = new StringBuilder();
		mapStr.append("!{");
		int i = 0;
		for(Map.Entry<String, String> entry : map.entrySet()){
			mapStr.append(entry.getKey() + ": " +entry.getValue());
			if (i<map.size()-1) {
				mapStr.append(",");
			}
		}
		mapStr.append("}");
		result.put("The Map", mapStr.toString());
		result.put("The list", list.toString());
		i=1;
		for (String it : vararg) {
			result.put("The vararg #"+i, it);
			i++;
		}
		return result ;
	}
	
	public String typeOf(Object obj) {
		
		return obj.getClass().getName() + "->"+obj;
		
	}
	
	public String echo(String str){
		
		if (str.startsWith("ENC(")) {
//		if (false) {
			String substring = str.substring(4,str.length()-1);
			System.out.println(substring);
			String decPw = cs.decrypt(substring);
			return str+" -> "+decPw;
		} else {

			return str;
		}
	}
	
	
	public static void main(String[] args) {
//		Tester t = new Tester();
//		String encPw = t.getCs().encrypt("password");
//		System.out.println(t.getCs().decrypt(encPw));
		/*
		 * !define 1234_adm_user {qwer}
!define 1234_adm_pwd {ENC(WtY3Tu3tQ5ZsGd/DxOGApg==)
		 */
//		System.out.println(new Tester().echo("ENC(WtY3Tu3tQ5ZsGd/DxOGApg==)"));
//		System.out.println("BASE: " + SearchScope.BASE_INT_VALUE + 
//				"\n ONE: " + SearchScope.ONE_INT_VALUE +
//				"\n SUB: " +SearchScope.SUB_INT_VALUE + 
//				"\n SUBORDINATE: " + SearchScope.SUBORDINATE_SUBTREE_INT_VALUE);
		String inScope = "BaSe";
		SearchScope scope = null;
		if (inScope.toUpperCase().equals("BASE")) {
			 scope = SearchScope.BASE;
		}else if (inScope.toUpperCase().equals("ONE")) {
			 scope = SearchScope.ONE;
		}else if (inScope.toUpperCase().equals("SUB")) {
			 scope = SearchScope.SUB;
		}else if (inScope.toUpperCase().equals("SUBORDINATE")) {
			 scope = SearchScope.SUBORDINATE_SUBTREE;
		}
		System.out.println(scope.toString());
	}
}
