package com.stackroute.pe1;

import java.util.Scanner;
import java.lang.String;
public class VowelConsonantChecker {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String");
        String inputString=scanner.nextLine();
        System.out.println(vowelConsonantCheck(inputString));
    }
    public static String vowelConsonantCheck(String inputString)
    {
        String str="";
        for(int i=0;i<inputString.length();i++)
        {
            if(inputString.charAt(i)=='a' || inputString.charAt(i)=='e'|| inputString.charAt(i)=='i' || inputString.charAt(i)=='o' || inputString.charAt(i)=='u' || inputString.charAt(i)=='A' || inputString.charAt(i)=='E'|| inputString.charAt(i)=='I' || inputString.charAt(i)=='O' || inputString.charAt(i)=='U')
                str=str+"Vowel ";
            else
                str=str+"Consonant ";
        }
        return str;
    }
}
