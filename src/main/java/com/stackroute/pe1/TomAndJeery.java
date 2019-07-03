//if the input integer is between 20 and 30 then print jerry for even no. and tom for odd no.
//else wrong input

package com.stackroute.pe1;

import java.util.Scanner;
public class TomAndJeery {
    public static void main(String[] args) {
        System.out.print("enter the number=");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();//input integer
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
