/**
 * Created by James Frost on 03/02/2015.
 */
public class Controller {

    public static void main(String[] args) {
        //400
        for (int i = 0; i < 4; ++i)
            new Sniper(Integer.toString(i), "http://snipertest.bigcartel.com/product/test", "").start();
    }
}
