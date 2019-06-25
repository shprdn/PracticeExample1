package com.stackroute.pe1;

import java.util.Scanner;
import java.lang.System;
public class IndefiniteSum
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int total=0;
        try {
            System.out.println("Enter numbers and enter 0 to get the results");
            while ((num = sc.nextInt()) != 0) {
                if (num % 1 != 0) {

                    break;
                }
                total += num;
            }
            System.out.println(total);
        }
        catch (Exception e) {
            System.out.println("error");
        }
    }
}
