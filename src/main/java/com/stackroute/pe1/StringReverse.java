//reverse the input string

package com.stackroute.pe1;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        // write your code here
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.next();//input the string
        System.out.println(stringReverse(str));
    }

    public static String stringReverse(String str) {

        String reverse = "";
        //reversing the string
        for(int i=str.length()-1; i>=0; i--) {
            reverse = reverse + str.charAt(i);
        }

        return reverse;

    }
}
