import sun.nio.cs.ext.IBM037;

public class Arrays {
    public static void main (String[] args){



        int[] numberArray = new int[10];


        for (int i = 0; i < numberArray.length; i++)
        {
            numberArray[i] = i;
        }

        int k = 1;
        while(k <= 41){System.out.print('-');k++;}
        System.out.println();

        for(int j =0; j < numberArray.length; j++)
        {
            System.out.print("| " + j + " ");
        }
        System.out.print("|");







    }
}
