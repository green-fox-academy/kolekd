public class Power {
    public static void main (String[] args){

        // Given base and n that are both 1 or more, compute recursively (no loops)
        // the value of base to the n power, so powerN(3, 2) is 9 (3 squared).


        System.out.println(compute(5,4));

    }

    public static int compute( int base, int n){
        if(n == 0 || base == 0){
            return 1;
        } else {
            return base*compute(base, n - 1);
        }
    }

}
