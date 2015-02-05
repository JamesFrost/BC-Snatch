package me.jamesfrost.BigCartelSniper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Strategy for paring the form on the item page for the product id.
 *
 * Created by James Frost on 05/02/2015.
 */
public class ValueParseStrategy extends FormParseStrategy {

    public ValueParseStrategy(String chosenOption) {
        super(chosenOption);
    }

    @Override
    public String parseForm(Document document) {
        Elements options = document.select("option");

        for (Element option : options) {

            if (option.text().equals(chosenOption))
                return option.attr("value");
        }
        return null;
    }
}
