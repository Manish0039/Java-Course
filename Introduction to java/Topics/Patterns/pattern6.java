import java.util.Scanner;
public class pattern6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n ");
        int n = sc.nextInt();

        for(int i = n;i>=1;i--){
            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }


    }
    
}


/*
 Output

 Enter the number n 
5
12345
1234
123
12
1


 */
