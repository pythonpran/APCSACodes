package com.company;

// Import Declaration
import java.util.Scanner;

public class ScannerTesting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Input: ");

        String a = scan.next();
        String b = scan.next();
        // imagine as removing all the whitespace near it
        int d = scan.nextInt();

        // This does not remove any form of white space
        String c = scan.nextLine();

        System.out.println(a);
        System.out.println(b + "\n" + c);
        System.out.println(d);
    }
}
