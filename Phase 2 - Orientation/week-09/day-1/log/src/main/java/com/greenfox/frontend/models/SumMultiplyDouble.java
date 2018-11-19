package com.greenfox.frontend.models;

public class SumMultiplyDouble {

    String what;
    int[] numbers;

    public SumMultiplyDouble(String what, int[] numbers) {
        this.what = what;
        this.numbers = numbers;
    }

    public SumMultiplyDouble() {
    }

    public String getWhat() {
        return what;
    }

    public int[] getNumbers() {
        return numbers;
    }
}
