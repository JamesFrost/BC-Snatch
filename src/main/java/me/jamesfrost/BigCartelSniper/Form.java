package me.jamesfrost.BigCartelSniper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by James Frost on 03/02/2015.
 */
public class Form {

    private String url;
    private String chosenOption;

    public Form(String url, String chosenOption) {
        this.url = url;
        this.chosenOption = chosenOption;
    }

    public String getValue() {
        try {
            Document document = Jsoup.connect(url).get();

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
        } catch (IOException e) {
            System.err.println("Timed out...");
        }
        return null;
    }

}
