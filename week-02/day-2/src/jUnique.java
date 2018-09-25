//  Create a function that takes a list of numbers as a parameter
//  Returns a list of numbers where every number in the list occurs only once

//  Example
//  System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
//  should print: `[1, 11, 34, 52, 61]`

import java.util.Arrays;

public class jUnique {

    public static void main(String[] args) {

        int[] listNums = {1, 11, 34, 11, 52, 61, 1, 34};
        System.out.println(unique(listNums));
    }

    public static String unique(int[] arr){

        //creates an array of int with length equal to amount of unique nums
        int uniqueNums[] = new int[howManyUniques(arr)];
        int indexOfUniqueNums = 0;
        for (int i = 0; i < arr.length; i++) {
            //for every int in the arr passed as an argument, it checks if it is present in the arr of unique nums
            if (isItInTheArray(uniqueNums, arr[i])){
                uniqueNums[indexOfUniqueNums] = arr[i];
                indexOfUniqueNums++;
            }
        }
        return Arrays.toString(uniqueNums);
    }

    public static int howManyUniques(int[] arr){

        //baseline of unique numbers is length of array passed as argument
        int uniqueNums = arr.length;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                    // everytime it finds a non-unique element it decrements the unique elements count
                    uniqueNums--;
                }
            }
        }
        return uniqueNums;
    }

    public static boolean isItInTheArray(int[] arr, int num) {
        for (int x : arr) {
            if (x == num) {
                return false;
            }
        }
        return true;
    }
}