package com.stackroute.pe1;

import java.util.Scanner;
public class tom_and_jeery {
    public static void main(String[] args) {
        System.out.print("enter the number=");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(tom_and_jerry_check(number));
    }
    public static String tom_and_jerry_check(int number)
    {
        if(number<=30 && number>=20)
        {
            if(number%2==0)
            {
                return("Jerry");
            }
            else
            {
                return("Tom");
            }
        }
        return("Wrong input");
    }
}
