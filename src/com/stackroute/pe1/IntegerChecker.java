package com.stackroute.pe1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IntegerChecker {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a number between 1-100");
        num = sc.nextInt();
        if (num > 1 && num < 100) {
            System.out.println("Number guessed matches the original number");
        } else if (num <= 1) {
            System.out.println("Number guessed is less than original number");
        } else {
            System.out.println("Number guessed is more than original number");
        }
    }
}