import java.util.Scanner;
public class Array_Practise {
    public static void main(String[] args){
        /*  Scanner sc = new Scanner(System.in);
        System.out.println("Enter ten numbers");
        int[] z= new int[10];
        for(int i =0;i<z.length;i++){
            System.out.println("Print the value of the z ["+i+"]");
            z[i] = sc.nextInt();

        }
        for(int i = 0;i<z.length;i++){
            System.out.println("The value of z["+i+"] is"+z[i]);
        }

         */

        int[][] a = {
                {1,-2,3},
                {-4,-5,6,9},
                {7},
        };
        System.out.println(a.length);


       for(int i = 0;i<a.length;i++){
           for(int j = 0;j<a[i].length;j++){

               System.out.println(a[i][j]);d
           }
       }




    }
}
