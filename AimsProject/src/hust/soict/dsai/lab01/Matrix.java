package hust.soict.dsai.lab01;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    public static void main(String args[]) {
        System.out.println("input matrix size:");
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        double m1[][] = new double[a][b];
        double m2[][] = new double[a][b];
        System.out.println("input first matrix ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++)
                m1[i][j] = sc.nextDouble();
        }
        System.out.println("input second matrix ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++)
                m2[i][j] = sc.nextDouble();
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++)
                System.out.print(m1[i][j] + m2[i][j] + " ");
            System.out.print("\n");
        }

    }
}