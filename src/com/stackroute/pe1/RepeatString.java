package com.stackroute.pe1;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the string");
        String name = s.nextLine();
        System.out.println("Enter the number");
        int num = s.nextInt();
        char[] c =name.toCharArray();
        System.out.print(name);
        for(int i=0;i<num;i++) {
            System.out.print(name.substring(c.length-num));

        }}
}