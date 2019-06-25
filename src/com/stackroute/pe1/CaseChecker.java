package com.stackroute.pe1;

import java.util.Scanner;
import java.io.*;

public class CaseChecker
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char str;
        System.out.println("Enter any character");
        str = sc.next().charAt(0);
        if(str>=48 && str<58)
            System.out.println("Digit");
        else if(str>=97 && str<123)
            System.out.println("small letter");
        else if(str>=65 && str<91)
            System.out.println("Capital letter");
        else
            System.out.println("Special character");


    }
}
