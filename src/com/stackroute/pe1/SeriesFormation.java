package com.stackroute.pe1;

import java.util.Scanner;
import java.lang.*;
public class SeriesFormation {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int i, j,k, n;
        System.out.println("enter the number to draw the series");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <=i; j++) {
                k=i;
                System.out.print(k+" ");
            }
        }
    }

}