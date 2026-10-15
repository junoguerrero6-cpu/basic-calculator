package com.pluralsight;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the first number");
        int first = scanner.nextInt();

        System.out.println("enter the second number");
        int second = scanner.nextInt();

        System.out.println("possible calculations");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");
        System.out.println("please select an option: M");

    }

}
