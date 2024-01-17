import java.util.Scanner;
public class Array_Practise {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ten numbers");
        int[] z= new int[10];
        for(int i =0;i<z.length;i++){
            System.out.println("Print the value of the z ["+i+"]");
            z[i] = sc.nextInt();

        }
        for(int i = 0;i<z.length;i++){
            System.out.println("The value of z["+i+"] is"+z[i]);
        }

    }
}
