package me.jamesfrost.BigCartelSniper;

import java.util.ArrayList;

/**
 * Created by James on 04/02/2015.
 */
public class RegularLanguage {

    private ArrayList<String> tokens;

    public RegularLanguage(ArrayList<String> tokens) {
        this.tokens = tokens;
    }

    public void addToken(String token) {
        tokens.add(token);
    }

    public boolean isInLanuage(String haystack) {
        for (String token : tokens) {
            if (haystack.matches(token))
                return true;
        }
        return false;
    }
}
