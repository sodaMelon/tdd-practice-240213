package org.example;

import org.example.tools.Interpreter;

public class Main {

    public static void main(String[] args) {
        Interpreter interpreter = new Interpreter();
        try {
            System.out.println(interpreter.readArgs(args));
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("error occur: read msg and Try again");
            System.out.println(e.getMessage());
        }
    }
}