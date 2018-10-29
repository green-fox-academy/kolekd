package Fibonacci;

import java.util.ArrayList;

public class Fibonacci {

//    public int FibonacciInput (int input){
//
//        ArrayList<Integer> sequence = new ArrayList<Integer>();
//
//        input = 5;
//        int result = 0;
//        for (int i = 0; i < input; i++) {
//            sequence.add(i,i);
//        }
//
//        System.out.println(sequence);
//
//        return result;
//    }

    public static int fibo (int n){
        if (n > 1){
        } if (n < 0){
            System.out.println("Number is negative.");
            return 0;
        } else if (n == 1){
            return 1;
        } else if (n == 0){
            return 0;
        } else {

        int n1 = 0;
        int n2 = 1;
        int n3 = 2;

        for (int i = 2; i < n; i++) {

            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

        } return n3;
    }
    }
}
