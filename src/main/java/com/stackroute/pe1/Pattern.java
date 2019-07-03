//for an inputed integer return a pattern

package com.stackroute.pe1;

import java.util.Scanner;
public class Pattern {
    public static void main(String[] args)
    {
        System.out.print("Enter the value of n=");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();//input string
        System.out.println(printing_pattern(number));
    }
    public static String printing_pattern(int number)
    {
        int index,iterate;
        String patternString="";
        for(index=0;index<=n;index++)//forming pattern
        {
            for(iterate=0;iterate<index;iterate++)
            {
                patternString=patternString+index;
            }
        }
        return patternString;
    }
}
