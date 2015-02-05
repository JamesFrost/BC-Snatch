package me.jamesfrost.BigCartelSniper;

import org.jsoup.nodes.Document;

/**
 * Created by James on 05/02/2015.
 */
public abstract class FormParseStrategy {

    protected String chosenOption;

    public FormParseStrategy(String chosenOption) {
        this.chosenOption = chosenOption;
    }

    public abstract String parseForm(Document document);
}
