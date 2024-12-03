package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.store.Store;
import java.util.*;
import hust.soict.dsai.aims.cart.Cart;

public class Aims {

    public static void showMenu() {

        System.out.println("AIMS:");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");

    }

    public static void storeMenu() {

        System.out.println("Options:");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");

    }

    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }

    public static void main(String[] args) {
        ArrayList<String> authors1 = new ArrayList<>();
        authors1.add("J.K. Rowling");
        authors1.add("Jack Thorne");
        authors1.add("John Tiffany");

        Book book1 = new Book(1, "Harry Potter and the Cursed Child", "Fantasy", 29.99f, authors1);

        ArrayList<String> authors2 = new ArrayList<>();
        authors2.add("George Orwell");

        Book book2 = new Book(2, "1984", "Dystopian", 14.99f, authors2);

        // Creating some DigitalVideoDisc objects
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(3, "Inception", "Sci-Fi", 14.99f, 148, "Christopher Nolan");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(4, "Interstellar", "Sci-Fi", 19.99f, 169, "Christopher Nolan");
        Store s = new Store();
        s.addMedia(book1);
        s.addMedia(book2);
        s.addMedia(dvd1);
        s.addMedia(dvd2);
        Media m1 = s.findByTitle("abc");
        Cart c = new Cart();
        c.addMedia(book1);
        c.addMedia(book2);
        c.addMedia(dvd2);

        showMenu();
        while (true) {
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            if (i == 1) {
                ArrayList<Media> list = s.getList();
                for (Media m : list) {
                    System.out.println(m.toString());
                }
                storeMenu();
                while (true) {
                    int i1 = sc.nextInt();
                    if (i1 == 1) {
                        sc.nextLine();
                        System.out.println("Name of media:");
                        String s1 = sc.nextLine();
                        Media m = s.findByTitle(s1);
                        if (m != null) {
                            System.out.println(m.toString());
                        } else {
                            System.out.println("Can't find Media");
                        }
                        mediaDetailsMenu();
                        while (true) {
                            int i2 = sc.nextInt();
                            if (i2 == 1) {
                                sc.nextLine();
                                System.out.println("Name of media:");
                                String s2 = sc.nextLine();
                                Media md = s.findByTitle(s1);
                                if (md != null) {
                                    c.addMedia(m);
                                }
                            }
                            if (i2 == 2) {
                                sc.nextLine();
                                System.out.println("Name of media:");
                                String s2 = sc.nextLine();
                                Media m2 = s.findByTitle(s1);
                                if (m2 instanceof CompactDisc) {
                                    CompactDisc cd = (CompactDisc) m;
                                    cd.play();
                                } else if (m2 instanceof DigitalVideoDisc) {
                                    DigitalVideoDisc dvd = (DigitalVideoDisc) m;
                                    dvd.play();
                                } else {
                                    System.out.println("Can't play media");
                                }

                            }
                            if (i2 == 0)
                                break;

                        }
                    }
                    if (i1 == 0)
                        break;
                }

            }
            if (i == 2) {
                System.out.println("title you want to remove:");
                sc.nextLine();
                String title = sc.nextLine();
                Media m = s.findByTitle(title);
                s.removeMedia(m);
            }
            if (i == 3) {
                ArrayList<Media> list = c.getList();
                for (Media m : list) {
                    System.out.println(m.toString());
                }
                cartMenu();
                while (true) {
                    int i3 = sc.nextInt();
                    if (i3 == 1) {
                        System.out.println("1 for filter by id,2 for filter by title");
                        int i4 = sc.nextInt();
                        if (i4 == 1) {
                            System.out.println("The ID is:");
                            int i5 = sc.nextInt();
                            c.filter(i5);
                        }
                        if (i4 == 2) {
                            System.out.println("The title is:");
                            sc.nextLine();
                            String tit = sc.nextLine();
                            c.filter(tit);
                        }
                    }
                    if (i3 == 2) {
                        System.out.println("1 for sort by title cost,2 for filter by costtitle");
                        int i5 = sc.nextInt();
                        if (i5 == 1) {
                            ArrayList<Media> list1 = c.getList();
                            Collections.sort(list1, Media.compare_2);
                            c.setList(list);

                        }
                        if (i5 == 2) {
                            ArrayList<Media> list2 = c.getList();
                            Collections.sort(list2, Media.compare_1);
                            c.setList(list);

                        }
                    }
                    if (i3 == 5)
                        System.out.println("Order is created");
                    if (i3 == 0)
                        break;

                }

            }
            if (i == 0)
                break;
        }
    }
}
