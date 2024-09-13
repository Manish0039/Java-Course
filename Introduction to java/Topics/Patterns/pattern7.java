import java.util.Scanner;
public class pattern7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n ");
        int n = sc.nextInt();

        for(int i = n-1;i<=n;i++){
            
            
            for(int j = 2*i-1;j<=i;j++){
                System.out.print("* ");
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
