package me.jamesfrost.BigCartelSniper;

import java.net.MalformedURLException;

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
        try {
            test.parse(args);
        } catch (MalformedURLException e) {
            System.err.println("Invalid URL.");
            System.exit(1);
        }

    }

    public void beginSnipe() {
//        new me.jamesfrost.BigCartelSniper.Sniper(Integer.toString(i), "http://snipertest.bigcartel.com/product/test", "").start();
        for (int i = 0; i < noThreads; ++i)
            new Sniper(Integer.toString(i), itemUrl, option).start();
//            new me.jamesfrost.BigCartelSniper.Sniper(Integer.toString(i), "http://shop.casualco.com/product/victorinox-swiss-army-knife", "RED").start();
        //400
    }

//    public static void main(String[] args) {
////        new me.jamesfrost.BigCartelSniper.Sniper(Integer.toString(i), "http://snipertest.bigcartel.com/product/test", "").start();
//        for (int i = 0; i < 1; ++i)
//            new Sniper(Integer.toString(i), "http://snipertest.bigcartel.com/product/test", "").start();
////            new me.jamesfrost.BigCartelSniper.Sniper(Integer.toString(i), "http://shop.casualco.com/product/victorinox-swiss-army-knife", "RED").start();
//        //400
//
//    }
}
