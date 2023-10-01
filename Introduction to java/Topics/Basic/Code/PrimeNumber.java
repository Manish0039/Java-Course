import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int i, count;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        count = 0;

        for (i = 1; i <= n; i++) {

            if (n % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("The Given Number is Prime");
        }

        else
            System.out.println("The given NUmber is not prime.");

    }

}

/*
 * Output
 * Enter the Number
 * 5
 * The Given Number is Prime
 */
