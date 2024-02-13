package org.example;

import org.example.tools.Interpreter;

public class Main {

    public static void main(String[] args)
    {
        Interpreter interpreter = new Interpreter();
        try {
            interpreter.has3Args(args);
        }catch (Exception e){
            System.out.println("error occur:");
            System.out.println(e.getMessage());
        }
        System.out.println("-fin-");

    }
}