package org.example.tools;
import org.assertj.core.api.Assertions;
import org.example.exceptions.ArgsCountException;
import org.example.exceptions.ArgsConditionException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class InterpreterTest {

    private Interpreter interpreter;

    public InterpreterTest() {
        this.interpreter = new Interpreter();
    }


    @Test
    @DisplayName("명령행에서 넘겨주는 인자 3개: 만족")
    public void elementsTest() throws Exception {
        String[] bestCase = {"2", "+" ,"3"};
        Assertions.assertThat(interpreter.readArgs(bestCase)).isEqualTo(5);
    }

    @Test
    @DisplayName("명령행에서 넘겨주는 인자 3개가 아닌경우: 불만족")
    public void elementsTest2() {
        String[] elementsMoreThan3 = {"2", "+" ,"3","4"};
        Assertions.assertThatThrownBy( () -> {
                    interpreter.readArgs(elementsMoreThan3);
                }).isInstanceOf(ArgsCountException.class)
                .hasMessageContaining("be 3 words.");
        String[] elementsLessThan3 = {"2", "+" };
        Assertions.assertThatThrownBy( () -> {
                    interpreter.readArgs(elementsLessThan3);
                }).isInstanceOf(ArgsCountException.class)
                .hasMessageContaining("be 3 words.");
    }

    @Test
    @DisplayName("명령행에서 넘겨주는 인자에 적절한 수학기호가 없음")
    public void elementsTest3() {
        String[] elementsWithNoMark = {"2", "@" ,"3"};
        Assertions.assertThatThrownBy( () -> {
                    interpreter.readArgs(elementsWithNoMark);
                }).isInstanceOf(ArgsConditionException.class)
                .hasMessageContaining("mark");
        }
}