package com.stackroute.pe1;

import java.util.Scanner;
import java.lang.*;
public class VowelConsonentChecker
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word to check vowels or consonents");
        String str = sc.nextLine();
        int i;
        int len;
        len = str.length();
        for (i=0;i<len;i++)
        {
            if(str.charAt(i)=='A' || str.charAt(i)=='a' || str.charAt(i)=='E' || str.charAt(i)=='e' || str.charAt(i)=='I' || str.charAt(i)=='i' || str.charAt(i)=='O' || str.charAt(i)=='o' || str.charAt(i)=='U' || str.charAt(i)=='u')
                System.out.print("Vowel ");
            else
                System.out.print("Consonent ");
        }
    }


}
