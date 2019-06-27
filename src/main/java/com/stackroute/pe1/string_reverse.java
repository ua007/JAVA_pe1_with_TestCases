package com.stackroute.pe1;

import java.util.Scanner;

public class string_reverse {

    public static void main(String[] args) {
        // write your code here
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.next();
        System.out.println(stringReverse(str));
    }

    public static String stringReverse(String str) {

        String reverse = "";
        for(int i=str.length()-1; i>=0; i--) {
            reverse = reverse + str.charAt(i);
        }

        return reverse;

    }
}