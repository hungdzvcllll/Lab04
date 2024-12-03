package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String args[]) {
        Store c = new Store();
        DigitalVideoDisc d1 = new DigitalVideoDisc("abc", "hsdh", "gsdgx", 17, 3.95f);
        DigitalVideoDisc d2 = new DigitalVideoDisc("gsgd", "gsdg", "tjedasu", 25, 4.5f);
        DigitalVideoDisc d3 = new DigitalVideoDisc("adll", "ewrads", "rdwrasr", 14, 9f);
        c.addMedia(d1);
        c.addMedia(d2);
        c.addMedia(d3);
        System.out.println(c.getList().size());
        c.addMedia(d2);
        System.out.println(c.getList().size());
    }
}