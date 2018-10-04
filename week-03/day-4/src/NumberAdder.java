public class NumberAdder {
    public static void main (String[] args){

    // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.


        System.out.println(add(5));

    }

    public static int add (int n){

        int factorial = 0;
        for (int i = 0; i <= n; i++) {
            factorial+=i;
        }
        return factorial;
    }

}
