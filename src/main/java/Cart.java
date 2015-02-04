import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by James on 03/02/2015.
 */
public class Cart {
    private String url;

    private static String CART_ID_NAME = "cart[add][id]";
    private static String CART_QUANTITY_NAME = "cart[add][quantity]";

    public Cart(String url) {
        this.url = buildCartUrl(url);
    }

    private String buildCartUrl(String itemUrl) {
        try {
            URL cartUrl = new URL(itemUrl);
            return itemUrl.replace(cartUrl.getPath(), "/cart.js");
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String addToCart(String value) throws IOException {
        try {
            HttpResponse<JsonNode> response = Unirest.post("http://snipertest.bigcartel.com/cart.js")
                    .header("accept", "text/javascript, text/html, application/xml, text/xml, */*")
                    .header("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
                    .field(CART_ID_NAME, value)
                    .field(CART_QUANTITY_NAME, "1")
                    .asJson();

            return response.getHeaders().getFirst("set-cookie");

        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return null;
    }

}

