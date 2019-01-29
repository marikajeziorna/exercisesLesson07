package com.company;

import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number 'a'; ");
        int a = scanner.nextInt();
        System.out.println("Enter a number 'b'; ");
        int b = scanner.nextInt();
        System.out.println("Enter a number 'c'; ");
        int c = scanner.nextInt();

        while (a == 0){
            System.out.println("Enter a new number for 'a', it can't be 0.");
            a = scanner.nextInt();
        }

        int x = (c - b) / a;
        System.out.println("Result for 'x': " + x);
    }
}
