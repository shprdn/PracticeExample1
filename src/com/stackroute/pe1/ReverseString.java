package com.stackroute.pe1;

import java.util.Scanner;

public class ReverseString
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String to Reverse");
        String str;
        int i;
        str = sc.nextLine();
        String reverse="";
        for(i=str.length()-1;i>=0;i--)
        {
            reverse=reverse+str.charAt(i);
        }
        System.out.println(reverse);
    }
}