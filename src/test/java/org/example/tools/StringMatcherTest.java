package org.example.tools;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class StringMatcherTest {

    @Test
    void isNumber() {
        assertThat(StringMatcher.isNumber("123")).isTrue();
        assertThat(StringMatcher.isNumber("12.3")).isTrue();
        assertThat(StringMatcher.isNumber("1-23")).isFalse();
    }

    @Test
    void isOperation() {
        assertThat(StringMatcher.isOperation("+")).isTrue();
        assertThat(StringMatcher.isOperation("-")).isTrue();
        assertThat(StringMatcher.isOperation("*")).isTrue();
        assertThat(StringMatcher.isOperation("/")).isTrue();

        assertThat(StringMatcher.isOperation("x")).isFalse();
        assertThat(StringMatcher.isOperation("X")).isFalse();
        assertThat(StringMatcher.isOperation("789")).isFalse();
    }
}