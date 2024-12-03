package hust.soict.dsai.test.disc;

import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class TestPassingParameter {
    private static String a = "abc";
    private static String b = "def";

    public static void main(String args[]) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
        swap(jungleDVD, cinderellaDVD);

        System.out.println("jungle dvd title:" + jungleDVD.getTitle());
        System.out.println("cinderella dvd title:" + cinderellaDVD.getTitle());
        changeTittle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title:" + jungleDVD.getTitle());
        changeObject();
        System.out.println(a);
        System.out.println(b);

    }

    public static void swap(Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

    public static void changeTittle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }

    public static void changeObject() {
        String tmp = a;
        a = b;
        b = tmp;
    }

}