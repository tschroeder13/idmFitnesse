package fitnesse.crypto;

import fitnesse.authentication.Authenticator;
import fitnesse.plugins.PluginException;
import fitnesse.plugins.PluginFeatureFactory;
import fitnesse.reporting.FormatterRegistry;
import fitnesse.responders.ResponderFactory;
import fitnesse.responders.editing.ContentFilter;
import fitnesse.testrunner.TestSystemFactoryRegistry;
import fitnesse.testsystems.slim.CustomComparatorRegistry;
import fitnesse.testsystems.slim.tables.SlimTableFactory;
import fitnesse.wiki.WikiPageFactoryRegistry;
import fitnesse.wikitext.parser.SymbolProvider;

public class GuhCryptoPluginFeatureFactory implements PluginFeatureFactory {

	public Authenticator getAuthenticator() {
		// TODO Auto-generated method stub
		return null;
	}

	public ContentFilter getContentFilter() {
		// TODO Auto-generated method stub
		return null;
	}

	public void registerCustomComparators(CustomComparatorRegistry arg0) throws PluginException {
		// TODO Auto-generated method stub

	}

	public void registerResponders(ResponderFactory arg0) throws PluginException {
		// TODO Auto-generated method stub

	}

	public void registerSlimTables(SlimTableFactory arg0) throws PluginException {
		// TODO Auto-generated method stub

	}

	public void registerSymbolTypes(SymbolProvider arg0) throws PluginException {
		// TODO Auto-generated method stub

	}

	public void registerTestSystemFactories(TestSystemFactoryRegistry arg0) throws PluginException {
		// TODO Auto-generated method stub

	}

	public void registerWikiPageFactories(WikiPageFactoryRegistry arg0) throws PluginException {
		// TODO Auto-generated method stub

	}

	public void registerFormatters(FormatterRegistry arg0) throws PluginException {
		// TODO Auto-generated method stub
		
	}

}
