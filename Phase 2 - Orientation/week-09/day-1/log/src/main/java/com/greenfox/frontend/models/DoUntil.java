package com.greenfox.frontend.models;

public class DoUntil {

    int result;

    public DoUntil(int until, String input) {
        int sum = 0;
        if (input.equals("sum")){
            for (int i = 1; i <= until; i++) {
                sum += i;
            }
        } else if (input.equals("factor")){
            sum = 1;
            for (int i = 1; i <= until; i++) {
                sum *= i;
            }
        }
        this.result = sum;
    }

    public DoUntil() {
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
