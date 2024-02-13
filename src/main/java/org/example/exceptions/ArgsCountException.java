package org.example.exceptions;

public class ArgsCountException extends Exception implements InterpreterExeption {

    public ArgsCountException() {
        super("Args should be 3 words.");
    }
}
