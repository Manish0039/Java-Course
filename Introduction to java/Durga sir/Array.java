

public class Array {
    public static void main(String[] args){

        //  Single Dimensional Array

        /* int[] x = new int[3];

        x [0] = 12;
        x[1] = 23;
        x[2] = 34;
        System.out.println(x[0]);

        int[] y = {12,23,34};
        System.out.println(y[2]);
        */


        // Two Dimensional Array

        int[][] x = new int[2][2];
        x[0][1] = 12;
        x[0][0] = 23;
        System.out.println(x[0][1]);
        System.out.println(x[0]);
        System.out.println(x);

        //Output

        //12
        //[I@e9e54c2
        //[[I@65ab7765
    }

}
