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

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4;j++) {
                if (i == j){System.out.print("1 ");}
                else if (i < 4){System.out.print("0 ");}
            }
            System.out.println();
        }



    }
}
