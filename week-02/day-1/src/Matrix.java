import java.util.Arrays;

public class Matrix {
    public static void main (String[] args){

        // - Create (dynamically) a two dimensional array
        //   with the following matrix. Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        // - Print this two dimensional array to the output

        int x = 4;
        int y = 1;

        int[][] matrix = new int [x][y];

        for (int i = 0; i <= x; i++) {{
            for (int j = 0; j < i; j++) {

            }
        }
            System.out.println(Arrays.deepToString(matrix));
        }
    }
}
