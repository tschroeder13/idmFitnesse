package fitnesse.ldap.slim;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.unboundid.ldap.sdk.Attribute;
import com.unboundid.ldap.sdk.Entry;
import com.unboundid.ldap.sdk.LDAPException;
import com.unboundid.ldap.sdk.LDAPInterface;
import com.unboundid.ldap.sdk.LDAPSearchException;
import com.unboundid.ldap.sdk.SearchResult;
import com.unboundid.ldap.sdk.SearchResultEntry;
import com.unboundid.ldap.sdk.SearchScope;

import fitnesse.ldap.services.LdapConnectionFactory;

public class LdapSlimSearch {
	private String alias;
	private String baseDn;
	private String scope;
	private String filter;
	private String attributes[];
	private int resultCount;

	public LdapSlimSearch(String alias, String baseDn, String scope, String filter, String... attributes) {
		super();
		this.alias = alias;
		this.baseDn = baseDn;
		this.scope = scope;
		this.filter = filter;
		this.attributes = attributes;
		resultCount = 0;
	}

	public void table(List<List<String>> table) {
		// optional function
	}

	public List<Object> query() throws LDAPException {
		List<Object> dataTable = getDataTable();
		return new ArrayList<Object>(dataTable);
	}
	
	@SuppressWarnings("serial")
	protected List<Object> getDataTable() throws LDAPException {
		List<SearchResultEntry> rowList = search(baseDn, scope, filter, attributes);
		List<Object> table = new ArrayList<Object>(resultCount);
		rowList.forEach(entry -> {
			String dn = ((Entry)entry).getDN();
			System.out.println(dn);
			List<Object> fieldList = new ArrayList<Object>(2);
			Collection<Attribute> entryAttributes = ((Entry)entry).getAttributes();
			List<Object> attributesList = new ArrayList<Object>(entryAttributes.size()+1);
			attributesList.add(new ArrayList<String>(2){{
				add("dn");
				add(((Entry)entry).getDN());
			}});

			entryAttributes.forEach(attr ->{
				attributesList.add(new ArrayList<String>(2){{
					add(attr.getName());
					add(attr.getValue());
				}});
			});
			fieldList.add(attributesList);
			table.addAll(fieldList);
		});
		System.out.println(table);
		return table;
	}
	
	protected List<SearchResultEntry> search(String baseDn, String scope, String filter, String... attributes) throws LDAPException {
		LDAPInterface ldap = LdapConnectionFactory.getLdapConnection(alias);
		SearchScope ss = null;
		if (scope.toUpperCase().equals("BASE")) {
			 ss = SearchScope.BASE;
		}else if (scope.toUpperCase().equals("ONE")) {
			 ss = SearchScope.ONE;
		}else if (scope.toUpperCase().equals("SUB")) {
			 ss = SearchScope.SUB;
		}else if (scope.toUpperCase().equals("SUBORDINATE")) {
			 ss = SearchScope.SUBORDINATE_SUBTREE;
		}
		SearchResult searchResult = ldap.search(baseDn, ss, filter, attributes);
		resultCount=searchResult.getEntryCount();
		return searchResult.getSearchEntries();
	}
}
