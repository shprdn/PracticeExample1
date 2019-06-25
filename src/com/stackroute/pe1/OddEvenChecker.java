package com.stackroute.pe1;

import java.util.*;
public class OddEvenChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number to check ");
        num=sc.nextInt();
        if (num%2==0 && (num>20 || num<30))
                System.out.println("Jerry");
        else if (num%2==1 && (num>20 || num<30))
            System.out.println("Tom");
    }
}
