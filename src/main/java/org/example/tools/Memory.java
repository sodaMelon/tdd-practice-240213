package org.example.tools;

import org.example.exceptions.ArgsConditionException;

public class Memory {
    private final Double firstElements;
    private final String operationMark;
    private final Double lastElements;
    private Double result;

    public Memory(String first, String mark, String last) {
        this.firstElements = Double.parseDouble(first);
        this.operationMark = mark;
        this.lastElements = Double.parseDouble(last);
    }

    public void doOperation() throws ArgsConditionException {
        switch (this.operationMark) {
            case "+":
                doAddiction();
                break;
            case "-":
                doSubtraction();
                break;
            case "*":
                doMultiplication();
                break;
            case "/":
                doDivision();
                break;
            default:
             //   throw new ArgsConditionException();
        }
    }
    private void doAddiction(){
        result = firstElements + lastElements;
        //OverFlow&UnderFlow 경우 나중에 캐치
    }

    private void doSubtraction(){
        result = firstElements - lastElements;
    }

    private void doMultiplication(){
        result = firstElements * lastElements;
    }

    private void doDivision(){
        result = firstElements / lastElements;
    }
    public Double getResult() {
        return result;
    }
}
