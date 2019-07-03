//check if the inputed integer is a palindrome or not

package com.stackroute.pe1;

import java.util.Scanner;
public class Palindrome
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.=");
        int number = sc.nextInt();//integer input
        System.out.println(palindromeChecker(number));
    }
    
    public static String palindromeChecker(int number)
    {
        int numberCopy=number,remainder=0;
        while(numberCopy!=0)//reverse the integer
        {
            remainder=remainder*10+(numberCopy%10);
            numberCopy=numberCopy/10;
        }
        if(number==remainder)//check if it is a palindrome
        {
            int sum=0;
            while(remainder!=0)
            {
                if((remainder%10)%2==0)
                {
                    sum+=remainder%10;
                    remainder=remainder/10;
                }
                else
                {
                    remainder=remainder/10;
                }
            }
            if(sum>25)
            {
                return("is Palindrome and the sum of even numbers is greater than 25");
            }
            else
            {
                return("is Palindrome and the sum of even numbers is less than 25");
            }
        }
        else//if not a palindrome
        {
            return("is not a Palindrome number.");
        }
    }
}
