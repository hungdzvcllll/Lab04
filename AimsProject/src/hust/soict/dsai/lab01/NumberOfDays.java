package hust.soict.dsai.lab01;

import java.util.Arrays;
import java.util.Scanner;

public class NumberOfDays {
    private static String months[][] = {
            {},
            { "1", "January", "Jan", "Jan." },
            { "2", "February", "Feb", "Feb." },
            { "3", "March", "Mar", "Mar." },
            { "4", "April", "Apr", "Apr." },
            { "5", "May", "May", "May." },
            { "6", "June", "Jun", "Jun." },
            { "7", "July", "Jul", "Jul." },
            { "8", "August", "Aug", "Aug." },
            { "9", "September", "Sep", "Sep." },
            { "10", "October", "Oct", "Oct." },
            { "11", "November", "Nov", "Nov." },
            { "12", "December", "Dec", "Dec." }
    };

    public static int findMonth(String month) {
        for (int i = 1; i <= 12; i++) {
            for (int j = 0; j < 4; j++) {
                if (months[i][j].equals(month))
                    return i;
            }
        }
        return 0;
    }

    public static void main(String args[]) {

        String month;
        int year;
        Scanner sc = new Scanner(System.in);
        month = sc.next();
        year = sc.nextInt();
        int i = findMonth(month);
        System.out.println(month == "April");
        if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
            System.out.println(31);
        else if (i == 4 || i == 6 || i == 9 || i == 11)
            System.out.println(30);
        else {
            if (year % 4 == 0 && !(year % 100 == 0 && year % 400 != 0))
                System.out.println(29);

            else
                System.out.println(28);
        }

    }
}