package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.*;

public class CartTest {
    public static void main(String[] args) {

        DigitalVideoDisc d1 = new DigitalVideoDisc("abc", "hsdh", "gsdgx", 17, 3.95f);
        Book b1 = new Book();
        Disc d2 = new Disc();

        Cart c = new Cart();

        c.addMedia(d1);
        c.addMedia(d2);
        c.addMedia(b1);
        for (Media m : c.getList()) {
            System.out.println(m.toString());
        }
        // c.addDigitalVideoDisc(d2);
        // c.addDigitalVideoDisc(d3);

    }
}