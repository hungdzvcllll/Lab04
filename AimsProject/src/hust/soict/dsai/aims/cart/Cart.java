package hust.soict.dsai.aims.cart;

import java.util.*;
import hust.soict.dsai.aims.media.*;

public class Cart {
    private ArrayList<Media> list = new ArrayList<Media>();

    public void setList(ArrayList<Media> list) {
        this.list = list;
    }

    public ArrayList<Media> getList() {
        return list;
    }

    /*
     * public void searchByID(int id) {
     * boolean is_found = false;
     * for (DigitalVideoDisc d : getList()) {
     * if (d.getID() == id) {
     * System.out.println(d.toString());
     * is_found = true;
     * }
     * }
     * if (!is_found)
     * System.out.println("Can't find DVD");
     * }
     */

    /*
     * public void searchByTitle(String title) {
     * boolean is_found = false;
     * for (DigitalVideoDisc d : getList()) {
     * if (d.getTitle().equals(title)) {
     * System.out.println(d.toString());
     * is_found = true;
     * 
     * }
     * }
     * if (!is_found)
     * System.out.println("Can't find DVD");
     * }
     */

    /*
     * public void printList() {
     * System.out.println("****************CART****************");
     * System.out.println("Ordered Items:");
     * for (DigitalVideoDisc d : getList()) {
     * System.out.println(d.toString());
     * }
     * System.out.println(totalCost());
     * System.out.println("*************************************");
     * }
     */

    public void addMedia(Media m) {
        list.add(m);
    }

    public void Media(Media medialist[]) {
        for (int i = 0; i < medialist.length; i++) {
            list.add(medialist[i]);
        }
    }

    public void addMedia(Media m1, Media m2) {

    }

    public void removeMedia(Media d) {
        list.remove(d);
    }

    public void filter(int id) {
        for (Media d : list) {
            if (d.getID() == id) {
                System.out.println(d.toString());
            }
        }
    }

    public void filter(String title) {
        for (Media d : list) {
            if (d.getTitle().equals(title)) {
                System.out.println(d.toString());
            }
        }
    }

    public float totalCost() {
        float sum = 0;
        for (Media d : list) {
            sum += d.getPrice();
        }
        return sum;
    }

}