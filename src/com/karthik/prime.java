package com.karthik;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        primeN(num);
    }
    static void primeN(int num)
    {
        for (int i=2;i*i<=num;i++)
            if (num % i == 0) {
                System.out.println("Not prime");
                break;

            } else {
                System.out.println("prime");
                break;

            }

    }
}
