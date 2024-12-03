package hust.soict.dsai.lab01;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        double a[] = new double[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextDouble();
            sum += a[i];
        }
        Arrays.sort(a);
        System.out.print("sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\n");
        System.out.println("sum: " + sum);
        System.out.println("average " + sum / n);

    }
}