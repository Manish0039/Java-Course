

//  Question 1. Write a Java program to convert temperature from Fahrenheit to Celsius degrees.


/*
import java.util.Scanner;
public class Data_Type1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Fahrenheit = ");
        float  Fahrenheit = sc.nextFloat();

        float Celsius = (Fahrenheit-32) *5/9;
        System.out.println("Celsius = "+Celsius+"Degree");

    }
}

 Output
Fahrenheit = 100
Celsius = 37.77778Degree */




// Question 2.  Write a Java program that reads a number in inches and converts it to meters.
//Note: One inch is 0.0254 meter.


/*
  import java.util.Scanner;
 public class Data_Type1{
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.print("Inches = ");
         double inch = sc.nextDouble();
         double meters = inch*0.0254;
         System.out.println("Meters = "+meters);


     }
 }
 // Output
//Inches = 567
//Meters = 14.4018  */




// Question 3.  Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.
// Without using loops,function and recursion.

//<------------There are many approach to solve this question we will discuss it later------->


/*
import java.util.Scanner;

public class Data_Type1 {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value between 0 and 1000");
        int num = sc.nextInt();
        int digit1 = num%10;
        int n = num/10;
        int digit2 = n%10;
        n = n/10;
        int digit3 = n%10;
        n = n/10;
        int digit4 = n%10;
        n=n/10;
        int Sum = digit1+digit2+digit3+digit4;
        System.out.println("The Sum of the digits of the number "+ num + " is " + Sum);

    }
} */
//Output
//Enter the value between 0 and 1000
//543
//The Sum of the digits of the number 543 is 12




// Question 4. 


