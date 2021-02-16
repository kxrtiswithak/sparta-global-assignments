package com.sparta.kurtis;

import java.util.Arrays;

public class Printer {
    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void printErrorMessage(String message) {
        System.err.println(message);
    }

    public static String getNestedStringArray(String[][] arrayofArrays) {
        StringBuilder stringBuilder = new StringBuilder();

        for (String[] array : arrayofArrays) {
            stringBuilder.append(Arrays.toString(array)).append(", ");
        }

        return stringBuilder.toString();
    }
}
