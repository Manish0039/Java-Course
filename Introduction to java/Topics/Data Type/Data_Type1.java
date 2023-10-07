

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