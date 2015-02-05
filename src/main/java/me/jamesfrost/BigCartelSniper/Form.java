package me.jamesfrost.BigCartelSniper;

import org.jsoup.Jsoup;

import java.io.IOException;

/**
 * Created by James Frost on 03/02/2015.
 */
public class Form {

    private String url;
    private FormParseStrategy formParseStrategy;

    public Form(String url, String chosenOption) {
        this.url = url;

        if (chosenOption.equals("")) {
            formParseStrategy = new NoValueParseStrategy(chosenOption);
            System.out.println("URL: " + url);
        } else
            formParseStrategy = new ValueParseStrategy(chosenOption);

    }

    public String getValue() {
        try {
            return formParseStrategy.parseForm(Jsoup.connect(url).get());
        } catch (IOException e) {
            System.err.println("Timed out...");
        }
        return null;
    }

}
