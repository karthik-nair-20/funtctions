package com.karthik;



import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] arr = {1,3,4,5,6,7,8}; //array
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void change(int[] num) {

        num[0] = 0;
    }
}
