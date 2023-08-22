package com.karthik;

public class shadow {
    static int x=5; //available most where

    public static void main(String[] args) {
        System.out.println(x);//5
        int x=100;
        System.out.println(x); //shadow the value of x by 100;
        shadow();
    }
    static void shadow()
    {
        System.out.println(x); //5

    }
}
