package org.example.tools;

import org.example.exceptions.ArgsCountException;
import org.example.exceptions.ArgsConditionException;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Interpreter {
    private Float firstElements;
    private String operationMark;
    private Float lastElements;
    private final Set<String> operationMarks ;
    private final int elementCount = 3;
    private final int firstIndex=0;
    private final int markIndex=1;
    private final int lastIndex=2;

    public Interpreter() {
        operationMarks = new HashSet<>();
        operationMarks.addAll(Arrays.asList("+", "-", "*", "/"));
    }
    public boolean has3Args(String[] args) throws Exception {
        if (! hasThreeElements(args)){
            throw new ArgsCountException();
        }
        if (! scanHasRightElements(args)){
            throw new ArgsConditionException();
        }
        return true;
    }

    public boolean scanHasRightElements(String[] args){
        boolean firstResult = isNumber(args[firstIndex]);
        boolean secondResult = isOperation(args[markIndex]);
        boolean lastResult = isNumber(args[lastIndex]);
        return firstResult && secondResult && lastResult;
    }
    private boolean hasThreeElements(String[] args){
        return args.length == elementCount;
    }
    private boolean isNumber(String element){
        return false;
    }
    private boolean isOperation(String element){
        return false;
    }

}
