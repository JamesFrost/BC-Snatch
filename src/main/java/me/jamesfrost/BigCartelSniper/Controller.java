package me.jamesfrost.BigCartelSniper;

import java.util.Map;

/**
 * Controller.
 *
 * Created by James Frost on 03/02/2015.
 */
public class Controller {

    private String itemUrl;
    private String option;
    private int noThreads;
    private boolean isVerboseMode;

    public Controller(String[] args) {

        InputParser test = new InputParser();
        Map<String, String> parameters = test.parse(args);
        isVerboseMode = Boolean.getBoolean(parameters.get("verboseMode"));
        itemUrl = parameters.get("itemUrl");
        option = parameters.get("option");
        noThreads = 1;

    }

    public void beginSnipe() {
        System.out.println();
        System.out.println("Beginning snipe....");
        for (int i = 0; i < noThreads; ++i)
            new Sniper(Integer.toString(i), itemUrl, option).start();
    }

}
