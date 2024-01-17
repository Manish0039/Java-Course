

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




// Question 4. Write a Java program to convert minutes into years and days.
/*
import java.util.Scanner;
public class Data_Type1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of minutes");
        int min = sc.nextInt();
        int days = (min/(60*24))%365;
        int years = min/(60*24*365);
        System.out.println(min  +" is approximately "+ years +" Years And "+days +" Days");
    }
}

 */

// Output
//Enter no. of minutes
//3456789
//3456789 is approximately 6 Years And 210 Days




// Question 5.  Write a Java program that prints the current time in GMT.

/*
import java.util.Scanner;
public class Data_Type1 {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input the time zone offset to GMT: ");
        long timeZoneChange = input.nextInt();

        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHour = ((totalHours + timeZoneChange) % 24);

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}

 */

//Output
//Input the time zone offset to GMT: 345
//Current time is 17:34:42




// Question 6. Write a Java program to compute the body mass index (BMI).

/*
import java.util.Scanner;
public class Data_Type1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Body weight in kg.");
        double weigh = sc.nextDouble();
        System.out.println("Enter the Body Height in meter.");
        double height = sc.nextDouble();
        Double BMI = weigh/(height*height);
        System.out.println("Your Body Mass index is = "+BMI);
    }
}

 */
//Output
//Enter the Body weight in kg.
//65
//Enter the Body Height in meter.
//1.73
//Your Body Mass index is = 21.71806608974573




// Question 7. Write a Java program to take the user for a distance (in meters) and the time taken (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).
/*
import java.util.Scanner;
 public class Data_Type1{
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Distance in Meters.");
         double meter = sc.nextDouble();
         double km = meter/1000;
         double mile = km/1.609;
         System.out.println("Enter hour");
         double hour = sc.nextDouble();
         System.out.println("Enter Minute");
         double min = sc.nextDouble();
         System.out.println("Enter Second");
         double sec = sc.nextDouble();
         double hour1 = hour+(min/60)+(sec/3600);
         double sec1 = sec+(hour*3600)+(min*60);
         double min1 = min+(hour*60)+(sec/60);
         double speed1 = meter/sec1;
         double speed2 = km/hour1;
         double speed3 = mile/hour1;
         System.out.println("The Speed in meters/second is = "+speed1);
         System.out.println("The Speed in km/hour is = "+speed2);
         System.out.println("The Speed in miles/hour is = "+speed3);


     }
 }

 */
 //Output
//Enter the Distance in Meters.
//2500
//Enter hour
//5
//Enter Minute
//56
//Enter Second
//23
//The Speed in meters/second is = 0.11691530655193377
//The Speed in km/hour is = 0.4208951035869616
//The Speed in miles/hour is = 0.26158800720134345





// Question 8. Write a Java program that reads a number and displays the square, cube, and fourth power.
/*
import java.util.Scanner;
 public class Data_Type1{
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Number");
         int num = sc.nextInt();
         int square = num*num;
         int cube = square*num;
         int fourth = cube*num;
         System.out.println("The square of the number is = "+square);
         System.out.println("The cube of the number is = "+cube);
         System.out.println("The fourth power of the number is = "+fourth);

     }
 }

 */

 // Output
// Enter the Number
//4
//The square of the number is = 16
//The cube of the number is = 64
//The fourth power of the number is = 256




// Question 9.  Write a Java program that accepts two integers from the user and prints the sum, the difference, the product, the average, the distance (the difference between the integers), the maximum (the largest of the two integers), and the minimum (the smallest of the two integers).
/*
import java.util.Scanner;
public class Data_Type1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        int diff = (num1-num2);
        int product = num1*num2;
        int average = (num1+num2)/2;
        int max = Math.max(num1,num2);
        int min = Math.min(num1,num2);
        int distance = Math.abs(num1-num2);
        System.out.println("Sum of given Number = " +sum);
        System.out.println("Difference of given Number = " +diff);

        System.out.println("Product of given Number = " +product);
        System.out.println("Average of given Number = " +average);
        System.out.println("Distance of given Number = " +distance);
        System.out.println("Maximum Number = " +max);
        System.out.println("Minimum Number = " +min);


    }
}

 */

//Output
//Enter the first number
//25
//Enter the second number
//30
//Sum of given Number = 55
//Difference of given Number = -5
//Product of given Number = 750
//Average of given Number = 27
//Distance of given Number = 5
//Maximum Number = 30
//Minimum Number = 25




// Question 10. Write a Java program to break an integer into a sequence of digits.

import java.io.StringReader;
import java.util.Scanner;
public class Data_Type1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive digit");
        int num = sc.nextInt();
        int n1 = num/100000%10;
        int n2 = num/10000%10;
        int n3 = num/1000%10;
        int n4 = num/100%10;
        int n5 = num/10%10;
        int n6 = num%10;
        
        System.out.println(n1+" "+n2+ " "+ n3 + " " + n4 + " " + n5 + " " + n6);
    }
}

//Output
//Enter a positive digit
//456345
//4 5 6 3 4 5