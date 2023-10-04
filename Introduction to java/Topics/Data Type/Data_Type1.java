

//  Question 1. Write a Java program to convert temperature from Fahrenheit to Celsius degrees.


import java.util.Scanner;
public class Data_Type1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Fahrenheit value = ");
        float  Fahrenheit = sc.nextFloat();

        float Celsius = (5*Fahrenheit /9) - 32f;
        System.out.println("Celsius = "+Celsius+"Degree");




    }

}


