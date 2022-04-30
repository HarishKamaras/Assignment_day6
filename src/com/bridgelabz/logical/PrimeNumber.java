package com.bridgelabz.logical;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Input = scan.nextInt();
                boolean isPrime = true;
        if(Input==0||Input==1){
            isPrime = false;
        }
        else {
            for (int i = 2; i < Input; i++) {

                if (Input % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
                if (isPrime)
                    System.out.println(Input + " is a prime number.");
                else
                    System.out.println(Input + " is not a prime number.");
    }
}
