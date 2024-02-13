package org.example.tools;

import org.example.exceptions.ArgsCountException;
import org.example.exceptions.ArgsConditionException;

import static org.example.tools.StringMatcher.isNumber;
import static org.example.tools.StringMatcher.isOperation;

public class Interpreter {
    private final int elementCount = 3;
    private final int firstIndex=0;
    private final int markIndex=1;
    private final int lastIndex=2;

    public double readArgs(String[] args) throws Exception {
        if (! hasThreeElements(args)){
            throw new ArgsCountException();
        }
        if (! scanHasRightElements(args)){
            throw new ArgsConditionException();
        }

        Memory memory =new Memory(args[firstIndex],args[markIndex],args[lastIndex]);
        memory.doOperation();
        return memory.getResult();
    }

    public boolean scanHasRightElements(String[] args){
        boolean firstResult = isNumber(args[firstIndex]);
        boolean secondResult = isOperation(args[markIndex]);
        boolean lastResult = isNumber(args[lastIndex]);
        return firstResult && secondResult && lastResult;
    }
    private boolean hasThreeElements(String[] args) {
        return args.length == elementCount;
    }

}
