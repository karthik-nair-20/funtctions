package com.karthik;

public class string_fun {
    public static void main(String[] args) {

//        String msg = greet();
//        System.out.println(msg);
        String personal_msg = myGreet("karthik nair");
        System.out.println(personal_msg);
    }

    static String myGreet(String name) {
        String msg = "Hello " + name;
        return msg;

    }

    static String greet(){

        String greeting = "how r u ";
        return greeting;
    }
}
