package com.stackroute.pe1;

import java.util.Scanner;
public class Palindrome
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.=");
        int num = sc.nextInt();
        System.out.println(palindromeChecker(num));
    }
    public static String palindromeChecker(int num)
    {
        int t=num,m=0;
        while(t!=0)
        {
            m=m*10+(t%10);
            t=t/10;
        }
        if(num==m)
        {
            int sum=0;
            while(m!=0)
            {
                if((m%10)%2==0)
                {
                    sum+=m%10;
                    m=m/10;
                }
                else
                {
                    m=m/10;
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
        else
        {
            return("is not a Palindrome number.");
        }
    }
}