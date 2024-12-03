package hust.soict.dsai.lab01;

import java.util.Scanner;
import java.lang.Math;

public class SolveEquation {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "press 1 to solve first degree equation,2 to solve system of equation ,3 to solve second degree equation ");
        n = sc.nextInt();
        if (n == 1) {
            System.out.println("input a,b to solve ax+b=0");
            double a, b;
            a = sc.nextDouble();
            b = sc.nextDouble();
            System.out.println(-b / a);
        }
        if (n == 2) {
            System.out.println("input a1,b1,c1,a2,b2,c2 to solve a1 x+b1 y=c1,a2 x+b2 y= ");
            double a1, b1, c1, a2, b2, c2;
            a1 = sc.nextDouble();
            b1 = sc.nextDouble();
            c1 = sc.nextDouble();
            a2 = sc.nextDouble();
            b2 = sc.nextDouble();
            c2 = sc.nextDouble();
            double D = a1 * b2 - a2 * b1;
            double Dx = c1 * b2 - c2 * b1;
            double Dy = a1 * c2 - a2 * c1;
            if (D != 0)
                System.out.println("x=" + (Dx / D) + " " + "y=" + (Dy / D));
            else if (Dx != 0 || Dy != 0)
                System.out.println("no  solution");

            else
                System.out.println("Infinity solution");

        }
        if (n == 3) {
            System.out.println("input a,b,c to solve ax^2+bx+c=0");
            double a, b, c;
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();
            double delta = b * b - 4 * a * c;
            if (delta < 0)
                System.out.println("no solution");
            else if (delta == 0)
                System.out.println("1 solution:x=" + (-b / (2 * a)));
            else
                System.out.println("2 solution:x1=" + ((-b + Math.sqrt(delta)) / (2 * a)) + " " + "x2="
                        + ((-b - Math.sqrt(delta)) / (2 * a)));
        }

    }
}