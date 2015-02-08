package me.jamesfrost.BCSnatch;

import org.jsoup.nodes.Document;

/**
 * Strategy for paring the form on the item page for the product id.
 *
 * Created by James Frost on 05/02/2015.
 */
public abstract class FormParseStrategy {

    protected String chosenOption;

    public FormParseStrategy(String chosenOption) {
        this.chosenOption = chosenOption;
    }

    public abstract String parseForm(Document document);
}
