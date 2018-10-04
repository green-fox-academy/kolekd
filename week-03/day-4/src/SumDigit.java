public class SumDigit {
    public static void main(String[] args) {

        // Given a non-negative int n, return the sum of its digits recursively (no loops).
        // Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
        // divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

        System.out.println(digits(123));

        //System.out.println((123 % 10)/1);
        //System.out.println((123 % 100)/10);
        //System.out.println((123 % 1000)/100);

    }

    public static int digits(int n){
        if (n == 1 || n < 0){
            return 1;
        } else {
            System.out.println();
            return (n%10)+digits(n/10);
        }

    }
}