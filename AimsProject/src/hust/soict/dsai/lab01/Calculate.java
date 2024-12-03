package hust.soict.dsai.lab01;

import java.util.*;

public class Calculate {
    public static void main(String args[]) {
        double a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        System.out.println("a+b=" + (a + b));
        System.out.println("a-b=" + (a - b));
        System.out.println("a*b=" + (a * b));
        System.out.println("a/b=" + (a / b));

    }
}