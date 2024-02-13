package org.example.exceptions;

public class ArgsConditionException extends Exception implements InterpreterExeption {
    public ArgsConditionException() {
        super("Args should be [number] [mark] [number].");
    }
}
