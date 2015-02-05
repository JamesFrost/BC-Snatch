package me.jamesfrost.BigCartelSniper;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by James Frost on 04/02/2015.
 */
public class InputParser {

    private RegularLanguage options;
    private RegularLanguage value;

    public InputParser() {

        ArrayList<String> optionsTokens = new ArrayList<String>();
        optionsTokens.add("(-v)?");

        options = new RegularLanguage(optionsTokens);

        ArrayList<String> valueTokens = new ArrayList<String>();
        valueTokens.add("([\\S]+)?");

        value = new RegularLanguage(valueTokens);
    }

    public Map<String, String> parse(String[] args) {

        int pointer = 0;
        Map<String, String> parameters = new HashMap<String, String>();

        boolean isVerbose = options.isInLanuage(args[pointer]);

        if (isVerbose)
            ++pointer;

        parameters.put("verboseMode", String.valueOf(isVerbose));

        System.out.println("isverbose: " + isVerbose);

        try {
            URL tmpUrl = new URL(args[pointer]);
        } catch (MalformedURLException e) {
            System.err.println("URL invalid.");
            System.exit(1);
        }
        parameters.put("itemUrl", args[pointer]);

        System.out.println("url: " + args[pointer]);

        ++pointer;


        if (value.isInLanuage(args[pointer]))
            parameters.put("option", args[pointer]);
        else
            parameters.put("option", "");

        System.out.println(args[pointer]);

        return parameters;

    }

}
