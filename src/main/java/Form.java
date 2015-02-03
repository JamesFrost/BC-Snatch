import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Created by James Frost on 03/02/2015.
 */
public class Form {

    private Document document;

    public Form(Document document) {
        this.document = document;
    }

    public String getValue(String chosenOption) {
        if (chosenOption.equals("")) {
            Elements options = document.select("#option");
            if (options.size() > 0)
                return options.get(0).attr("value");
        }

        Elements options = document.select("option");

        for (Element option : options) {

            if (option.text().equals(chosenOption))
                return option.attr("value");
        }
        return null;
    }

}
