public class Bunnies2 {
    public static void main (String[]args){

        // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
        // (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
        // have 3 ears, because they each have a raised foot. Recursively return the
        // number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

        //EVEN - 2   ODD - 3

        System.out.println(bunnies(11));

    }

    public static int bunnies (int n){
        if(n == 1){
            return 3;
        } else if (n % 2 == 0) {
            return 2 + bunnies(n-1);
        } else {
            return 3 + bunnies(n-1);
        }

    }
}
