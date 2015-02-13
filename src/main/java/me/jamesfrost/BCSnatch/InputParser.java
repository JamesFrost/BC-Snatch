package me.jamesfrost.BCSnatch;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Handles parsing of user input.
 * <p/>
 * Created by James Frost on 04/02/2015.
 */
public class InputParser {

    private RegularLanguage options;
    private RegularLanguage value;
    private RegularLanguage[] languages;

    public InputParser() {
        languages = new RegularLanguage[2];

        ArrayList<String> optionsTokens = new ArrayList<String>();
        optionsTokens.add("(-v)");

        options = new RegularLanguage(optionsTokens);
        languages[0] = options;

        ArrayList<String> valueTokens = new ArrayList<String>();
        valueTokens.add("([\\S]+)");

        value = new RegularLanguage(valueTokens);
        languages[1] = value;
    }

    private void showInfo() {
        System.out.println("\n\n               BigCartel Snatch - v1.0.1");
        System.out.println("                           ______\n" +
                "        |\\_______________ (_____\\\\______________\n" +
                "HH======#H###############H#######################\n" +
                "        ' ~\"\"\"\"\"\"\"\"\"\"\"\"\"\"`##(_))#H\\\"\"\"\"\"Y########\n" +
                "                          ))    \\#H\\       `\"Y###\n" +
                " By James Frost           \"      }#H)\n jamesfrost.me\n");

        System.exit(0);
    }

    private void showHelp() {
        System.out.println("\nA 'sniper' for the BigCartel platform.\n" +
                "Will output cookies for sessions that have the items in the basket. " +
                "These can be injected into your browser, where you can checkout.");
        System.out.println("\nOVERVIEW\nbgsnipe [-v] [item-url] [option]\n");
        System.out.println("-v\n    Verbose Mode (optional)\n");
        System.out.println("item-url\n  URL of BigCartel item to snatch\n");
        System.out.println("option\n    E.g. SMALL, MEDIUM, LARGE (optional) (case sensitive - has to be an exact match)\n");
        System.exit(0);
    }

    private void error() {
        System.err.println("Invalid arguments.\nTry help or info.");
        System.exit(1);
    }

    public Map<String, String> parse(String[] args) {

        if (args.length == 0)
            error();

        if (args[0].equals("help"))
            showHelp();

        if (args[0].equals("info"))
            showInfo();

        int pointer = 0;
        Map<String, String> parameters = new HashMap<String, String>();

        boolean isVerbose = options.isInLanuage(args[pointer]);

        if (isVerbose)
            ++pointer;

        parameters.put("verboseMode", Boolean.toString(isVerbose));

        if (pointer < args.length) {
            try {
                URL tmpUrl = new URL(args[pointer]);
            } catch (MalformedURLException e) {
                error();
            }
        } else {
            error();
        }

        parameters.put("itemUrl", args[pointer]);

        ++pointer;

        if (pointer < args.length && value.isInLanuage(args[pointer]))
            parameters.put("option", args[pointer]);
        else
            parameters.put("option", "");

        return parameters;

    }

}
