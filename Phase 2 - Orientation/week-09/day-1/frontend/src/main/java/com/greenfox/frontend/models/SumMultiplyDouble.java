package com.greenfox.frontend.models;

import org.springframework.stereotype.Service;

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
