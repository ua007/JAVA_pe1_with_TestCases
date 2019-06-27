package com.stackroute.pe1;

import java.util.Scanner;
public class pattern {
    public static void main(String[] args)
    {
        System.out.print("Enter the value of n=");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(printing_pattern(n));
    }
    public static String printing_pattern(int n)
    {
        int i,j;
        String str="";
        for(i=0;i<=n;i++)
        {
            for(j=0;j<i;j++)
            {
                str=str+i;
            }
        }
        return str;
    }
}
