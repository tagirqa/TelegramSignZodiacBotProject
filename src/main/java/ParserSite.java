import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import javax.xml.soap.Text;
import java.io.IOException;

public class ParserSite {

    public static String textToTelegram(String url) throws IOException {
        Document doc = Jsoup.connect(url).get();
//        log(doc.title());

        Elements newsHeadlines = doc.select("p");

        return newsHeadlines.get(0).text() + " " + newsHeadlines.get(1).text();
    }

    private static void log(String msg, String... vals) {
        System.out.println(String.format(msg, vals));
    }
}
