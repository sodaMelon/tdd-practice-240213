package org.example.tools;

import org.assertj.core.api.Assertions;
import org.example.exceptions.ArgsConditionException;
import org.junit.jupiter.api.Test;

class MemoryTest {

    @Test
    public void addiction() throws ArgsConditionException {
        Memory memory = new Memory("2","+","3");
        memory.doOperation();
        Assertions.assertThat(memory.getResult()).isEqualTo(2+3);
    }

    @Test
    public void subtraction() throws ArgsConditionException {
        Memory memory = new Memory("2","-","3");
        memory.doOperation();
        Assertions.assertThat(memory.getResult()).isEqualTo(2-3);
    }

    @Test
    public void multiplication() throws ArgsConditionException {
        Memory memory = new Memory("2","*","3");
        memory.doOperation();
        Assertions.assertThat(memory.getResult()).isEqualTo(2*3);
    }
    @Test
    public void division() throws ArgsConditionException {
        Memory memory = new Memory("2","/","3");
        memory.doOperation();
        double result = (double) 2/3;
        Assertions.assertThat(memory.getResult()).isEqualTo(result);
    }

    //성공하게 구현해야하는 (추가로)테스트
    //1.overflow
    //2.underflow
    //3.divide by zero (Exception 던지도록 함)
}