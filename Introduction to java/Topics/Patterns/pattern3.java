import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n ");
        int n = sc.nextInt();

        for(int i = 1;i<=n;i++){
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
1
12
123
1234
12345


 */
