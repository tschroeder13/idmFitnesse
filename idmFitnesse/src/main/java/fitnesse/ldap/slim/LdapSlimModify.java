package fitnesse.ldap.slim;

import java.util.Map;

public class LdapSlimModify {

	
	public boolean addObject(String connectionAlias,
			String objectDn,
			Map<String, String> attributes,
			String... objectClasses) {
		return false;
	}
	
	public boolean moveObject(String connectionAlias,
			String oldDn, 
			String newRdn) {
		return false;
	}
	
	public boolean addAttributeValue(String connectionAlias,
			String objectDn,
			String attributeName,
			String... values) {
		return false;
	}
}
