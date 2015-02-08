package me.jamesfrost.BCSnatch;

import java.util.ArrayList;

/**
 * Models a regular language.
 *
 * Created by James Frost on 04/02/2015.
 */
public class RegularLanguage {

    private ArrayList<String> tokens;

    public RegularLanguage(ArrayList<String> tokens) {
        this.tokens = tokens;
    }

    public boolean isInLanuage(String haystack) {
        for (String token : tokens) {
            if (haystack.matches(token)) {
                tokens.remove(token);
                return true;
            }
        }
        return false;
    }
}
