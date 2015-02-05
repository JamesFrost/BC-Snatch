package me.jamesfrost.BigCartelSniper;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 * Created by James on 05/02/2015.
 */
public class NoValueParseStrategy extends FormParseStrategy {

    public NoValueParseStrategy(String chosenOption) {
        super(chosenOption);
    }

    @Override
    public String parseForm(Document document) {
        Elements options = document.select("#option");
        if (options.size() > 0)
            return options.get(0).attr("value");

        return null;
    }
}
