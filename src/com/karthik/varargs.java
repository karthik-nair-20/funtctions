package com.karthik;

import java.util.Arrays;

public class varargs {
    public static void main(String[] args) {
        fun(1,2,3,4,4,5,5,6,6,6,6,5,4,4,4);
        multiple(2 , 4, "karthik" , "kanishk");
    }

     static void multiple(int i, int i1, String ...name)
     {

     }

    static void fun(int ...num)//variable argument(can take any number of arguments)
    {
        System.out.println(Arrays.toString(num));
    }
}
