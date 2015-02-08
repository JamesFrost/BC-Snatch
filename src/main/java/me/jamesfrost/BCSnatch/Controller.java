package me.jamesfrost.BCSnatch;

import java.util.Map;

/**
 * Controller.
 * <p/>
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
        isVerboseMode = Boolean.parseBoolean(parameters.get("verboseMode"));
        itemUrl = parameters.get("itemUrl");
        option = parameters.get("option");
        noThreads = 10;

    }

    public void beginSnipe() {
        if (isVerboseMode) {
            System.out.println("\nSnatching: " + itemUrl);
            if (!option.equals(""))
                System.out.println("Option: " + option);
            else
                System.out.println("Option: No option");
            System.out.println("Number of threads: " + noThreads + "\n");
            System.out.println("Beginning snatch...\n");
        }
        for (int i = 0; i < noThreads; ++i)
            new Sniper(Integer.toString(i), itemUrl, option).start();
    }

}
