package fitnesse;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class StringPreparator {
	public static String prepareString(String before) {
		Document doc=Jsoup.parse(before);
		Elements pre = doc.select("pre");
		Elements a = doc.select("a");
		if(pre.size()>0) return pre.first().text();
		else if(a.size()>0) return a.first().text();
		else return before;
	}
}
