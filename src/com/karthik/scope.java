package com.karthik;

public class scope {
    public static void main(String[] args) {
        int a=0;
        {
             a=9;//updating the original a
             int c= 99;//new c only available in c
            //as long as you are not creating a new instance;we can modify them in block.
        }
        int c=0;
        System.out.println(a);//modify is also applied outside the block.

        String name = "karthik";
        change(name);
        System.out.println(name);

    }

    static void change(String name) {
        name = "kanishk";
        System.out.println(name);
    }
}
