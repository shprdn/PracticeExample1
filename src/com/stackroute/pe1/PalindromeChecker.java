package com.stackroute.pe1;

import java.util.*;
public class PalindromeChecker
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check whether it is a pallindrome or not");
        long num = sc.nextLong();

        long i,rem,sum=0,total=0;
        long temp;
        temp=num;
        while (num>0)
        {
            rem = num%10;
            if (rem%2==0)
                total = total+rem;
            sum = (sum*10) + rem;
            num = num/10;
        }
        if (temp==sum)
        {
            if (total>25)
                System.out.println(temp + " is palindrome and the sum of even numbers is greater than 25");
            else
                System.out.println(temp+" is palindrome and the sum of even numbers is less than 25");

        }
        else
            System.out.println(temp + "is not pallindrome");

    }
}
