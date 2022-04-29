package com.bridgelabz.logical;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        int i, Number, Sum = 0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Number: ");
        Number = sc.nextInt();

        for(i = 1 ; i < Number ; i++) {
            if(Number % i == 0)  {
                Sum = Sum + i;
            }
        }
        if (Sum == Number) {
            System.out.println("its a Perfect Number " + Number);

        }
        else {
            System.out.println("its not Perfect Number " + Number);
        }
    }
}
