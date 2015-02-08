package me.jamesfrost.BCSnatch;

import java.io.IOException;

/**
 * Created by James Frost on 03/02/2015.
 */
public class Sniper implements Runnable {

    private Thread t;
    private Form form;
    private Cart cart;

    public Sniper(String threadName, String itemUrl, String option) {
        t = new Thread(this, threadName);
        form = new Form(itemUrl, option);
        cart = new Cart(itemUrl);
    }

    public void start() {
        t.start();
    }

    public void snipe() {
        String productId = null;

        while (productId == null) {
//            System.out.println("Thread " + t.getName() + " polling....");
            productId = form.getValue();
        }

        try {
            String cookie = cart.addToCart(productId);
            if (cookie != null)
                System.out.println(cookie + "\n \n");
        } catch (IOException e) {
            System.err.println("Adding to cart failed.");
        }

    }

    @Override
    public void run() {
        snipe();
    }
}
