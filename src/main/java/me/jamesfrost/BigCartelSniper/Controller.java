package me.jamesfrost.BigCartelSniper;

import java.util.Map;

/**
 * Created by James Frost on 03/02/2015.
 */
public class Controller {

    private String itemUrl;
    private int noThreads;
    private String option;
    private boolean isVerboseMode;

    public Controller(String[] args) {

        InputParser test = new InputParser();
        Map<String, String> parameters = test.parse(args);
        itemUrl = parameters.get("itemUrl");
        option = parameters.get("option");
        noThreads = 1;

    }

    public void beginSnipe() {
//        new me.jamesfrost.BigCartelSniper.Sniper(Integer.toString(i), "http://snipertest.bigcartel.com/product/test", "").start();
        for (int i = 0; i < noThreads; ++i)
            new Sniper(Integer.toString(i), itemUrl, option).start();
//            new me.jamesfrost.BigCartelSniper.Sniper(Integer.toString(i), "http://shop.casualco.com/product/victorinox-swiss-army-knife", "RED").start();
        //400
    }

}
