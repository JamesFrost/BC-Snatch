import org.jsoup.Jsoup;

import java.io.IOException;

/**
 * Created by James on 03/02/2015.
 */
public class Sniper implements Runnable {

    private Thread t;
    private String itemUrl;
    private String option;

    public Sniper(String threadName, String itemUrl, String option) {
        t = new Thread(this, threadName);
        this.itemUrl = itemUrl;
        this.option = option;
    }

    public void start() {
        t.start();
    }

    public void snipe() {
        String productId = null;

        while (productId == null) {
            System.out.println("trying.... " +t.getName());
            try {
                productId = new Form(Jsoup.connect(itemUrl).get()).getValue(option);
            } catch (IOException e) {
                System.err.println("Timed out...");
            }

        }

        String cookie = "";
        try {
            Cart cart = new Cart("http://snipertest.bigcartel.com/cart");
            cookie = cart.addToCart(productId);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Cookie: " + cookie);

    }

    @Override
    public void run() {
        snipe();
    }
}
