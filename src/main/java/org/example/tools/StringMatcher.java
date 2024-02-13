package org.example.tools;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class StringMatcher {
    public static boolean isNumber(String element) {
        return Pattern.matches("[0-9]+[.]?[0-9]*", element);
    }

    public static boolean isOperation(String element) {
        Set<String> operationMarks = new HashSet<>();
        operationMarks.addAll(Arrays.asList("+", "-", "*", "/"));
        return operationMarks.contains(element);
    }
}
