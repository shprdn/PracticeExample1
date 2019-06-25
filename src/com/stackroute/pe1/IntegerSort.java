package com.stackroute.pe1;

import java.util.Scanner;
public class IntegerSort {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = s.nextInt();
        int[] freq = new int[10];
        while (n> 0)
        {
            int d = n % 10;
            freq[d]++;
            n= n / 10;
        }
        int result = 0,sum=0;
        for (int i = 9; i >= 0 ; i--)
        {
            if (freq[i] != 0)
            {
                result = i;
                freq[i]--;
                break;
            }
        }
        for (int i = 9 ; i >=0; i--)
            while (freq[i]-- != 0) {
                result = result * 10 + i;
                if(i%2==0)
                    sum=sum+i;
            }
        System.out.println(result);
        if (sum>15)
            System.out.println("False");
        else
            System.out.println("Sum is "+sum );
    }
}
