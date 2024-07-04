
// Ouestion 1. Take 2 integer values in two variables a and b and print their
// product.

/*
 * class Basic {
 * public static void main(String[] args) {
 * 
 * int a = 20;
 * int b = 30;
 * int product = (a * b);
 * System.out.println("Product of a and b is = " + product);
 * 
 * }
 * }
 */
// output
// Product of a and b is = 600

// Question 2. Print the ASCII value of character ‘U’.

/*
 * class Basic {
 * public static void main(String[] args) {
 * char x = 'U'; // Here we declare x. x is assign as the char U.
 * int y = x; // Here we declare y. y is declare to get the integer value of
 * variable x
 * System.out.println("The ASCII value of U is = " + y);
 * }
 * }
 */

// Output
// The ASCII value of U is = 85

// Question 3.- Write a Java program to take the length and breadth of a
// rectangle and print its area.

/*
 * import java.util.Scanner; // This is used for taking input form the users.
 * 
 * public class Basic {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter the Length of rectangle");
 * int l = sc.nextInt();
 * System.out.println("Enter the breadth of the rectangle");
 * int b = sc.nextInt();
 * int area = (l * b);
 * System.out.println("The Area of the rectangle is = " + area);
 * 
 * }
 * }
 * 
 * Output
 * Enter the Length of rectangle
 * 10
 * Enter the breadth of the rectangle
 * 10
 * The Area of the rectangle is = 100
 */

// Question 4. Write a Java program to calculate the cube of a number.

/*
 * import java.util.Scanner;
 * public class Basic{
 * public static void main(String[] args){
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter the number ");
 * int n = sc.nextInt();
 * int cube = n*n*n;
 * System.out.println("The cube of the number is = "+ cube);
 * 
 * }
 * }
 * 
 * Output
 * Enter the number
 * 6
 * The cube of the number is = 216
 */

// <------------------ Question 5. Write a Java program to swap two numbers with
// the help of a third variable. -------------------->

/*
 * import java.util.Scanner; // This is used for taking input from the user.
 * 
 * public class Basic {
 * 
 * public static void main(String[] args) {
 * int Num1, Num2, Temp;
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter the first Number ");
 * Num1 = sc.nextInt();
 * System.out.println("Enter the Second Number ");
 * Num2 = sc.nextInt();
 * Temp = Num1;
 * Num1 = Num2;
 * Num2 = Temp;
 * System.out.println("The value of First Number = " + Num1);
 * System.out.println("The value of Second Number = " + Num2);
 * 
 * System.out.println();
 * }
 * }
 * 
 * OutputEnter the first Number
 * 12
 * Enter the Second Number
 * 34
 * The value of First Number = 34
 * The value of Second Number = 12
 */

// Question 6. Input name, roll number and field of interest from user and print

/*
 * import java.util.Scanner;
 * 
 * public class Basic {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter your name");
 * String Name = sc.nextLine();
 * System.out.println("Enter your roll no");
 * int Roll = sc.nextInt();
 * System.out.println("Enter your Field of Interest");
 * String Field = sc.next();
 * 
 * 
 * 
 * System.out.println("Name = " + Name);
 * System.out.println("Roll Number = " + Roll);
 * System.out.println("Field Of Interest = " + Field);
 * 
 * }
 * }
 * 
 * Enter your name
 * Manish
 * Enter your roll no
 * 1234
 * Enter your Field of Interest
 * Computer Science
 * Name = Manish
 * Roll Number = 1234
 * Field Of Interest = Computer
 */

// Question 7. - If the marks of Robert in three subjects are entered through
// keyboard (each out of 100), write a program to calculate his total marks and
// percentage marks.

/*
 * import java.util.Scanner;
 * public class Basic{
 * public static void main(String[] args){
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter the mark of three subjects");
 * int mark1 = sc.nextInt();
 * int mark2 = sc.nextInt();
 * int mark3 = sc.nextInt();
 * 
 * int Total = (mark1+mark2+mark3);
 * double percentage = (mark1+mark2+mark3)/3;
 * double CGPA = percentage/9.5;
 * System.out.println("Total Number = "+Total+"/300");
 * System.out.println("Percentage = "+percentage);
 * System.out.println("CGPA = "+CGPA); // For Practise
 * 
 * }
 * }
 * 
 * Enter the mark of three subjects
 * 89
 * 87
 * 78
 * Total Number = 254/300
 * Percentage = 84.0
 * CGPA = 8.842105263157896
 */

// Question 8. Given two numbers, return their sum in the following format: Int
// t representing number of test cases
// T lines of Two integers representing the numbers to be added

/*
 * import java.util.Scanner;
 * 
 * public class Basic {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.println("How many times you want to do test");
 * int t = sc.nextInt();
 * int i;
 * for (i = 1; i <= t; i++) {
 * System.out.println("Enter first number");
 * int a = sc.nextInt();
 * System.out.println("Enter second number");
 * int b = sc.nextInt();
 * System.out.println("Sum = " + (a + b));
 * }
 * }
 * }
 * 
 * How many times you want to do test
 * 3
 * Enter first number
 * 12
 * Enter second number
 * 12
 * Sum = 24
 * Enter first number
 * 23
 * Enter second number
 * 34
 * Sum = 57
 * Enter first number
 * 12
 * Enter second number
 * 34
 * Sum = 46
 */

/*
 * Question 9 = Make a Tax Calculator program.
 * 
 * import java.util.Scanner;
 * public class Main{
 * public static void main(String [] args){
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter the Income");
 * int income = sc.nextInt();
 * float amount ;
 * float tax ;
 * if(income<500000){
 * tax = 0;
 * System.out.println("The amount of tax to paid is zero");
 * }
 * else if (income>500000 && income<1000000){
 * amount = income-500000;
 * tax = amount*(0.2f);
 * System.out.println("The amount of tax to paid is = "+ tax);
 * }
 * else if(income>1000000){
 * amount = income-1000000;
 * tax = 100000+amount*(0.3f);
 * System.out.println("The amount of tax to paid is = "+ tax);
 * }
 * else{
 * System.out.println("Invalid input");
 * }
 * 
 * }
 * }
 * 
 * // Output
 * Enter the Income
 * 1200000
 * The amount of tax to paid is = 160000.0
 * 
 * 
 */

/*
 * Question 10 Write a program to tell that student is pass or fail using
 * ternary operator.
 * 
 * import java.util.Scanner;
 * public class Main{
 * public static void main(String[]args){
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter the marks.");
 * int marks = sc.nextInt();
 * 
 * String result = (marks>=33)? "Pass":"Fail";
 * System.out.println(result);
 * }
 * }
 * 
 * Output
 * Enter the marks.
 * 33
 * Pass
 * 
 * 
 */

/*
 * Question11 :Write a Java program to input week number(1-7)and print day of
 * week name using switch case.
 * 
 * import java.util.Scanner;
 * public class Main{
 * public static void main(String[] args){
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter the Number");
 * int Number = sc.nextInt();
 * 
 * switch(Number){
 * case 1 : System.out.println("Monday");
 * break;
 * case 2 : System.out.println("Tuesday");
 * break;
 * case 3 : System.out.println("Wednesday");
 * break;
 * case 4 : System.out.println("Thursday");
 * break;
 * case 5 : System.out.println("Friday");
 * break;
 * case 6 : System.out.println("Saturday");
 * break;
 * case 7 : System.out.println("Sunday");
 * break;
 * default: System.out.println("Invalid input");
 * 
 * 
 * }
 * 
 * }
 * }
 * 
 * output
 * 
 * Enter the Number
 * 6
 * Saturday
 * 
 */

/*
 * Question 12. Write a program to print hello world for n number of times using
 * while loop.
 * 
 * import java.util.Scanner;
 * public class Main{
 * public static void main(String[] args){
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter the Number");
 * int num = sc.nextInt();
 * int counter = 1;
 * int n = 1;
 * while(counter <= num ){
 * System.out.println("Hello World "+n);
 * n++;
 * counter++;
 * }
 * System.out.println("Work is Done.");
 * 
 * }
 * }
 * 
 * Output
 * Enter the Number
 * 25
 * Hello World 1
 * Hello World 2
 * Hello World 3
 * Hello World 4
 * Hello World 5
 * Hello World 6
 * Hello World 7
 * Hello World 8
 * Hello World 9
 * Hello World 10
 * Hello World 11
 * Hello World 12
 * Hello World 13
 * Hello World 14
 * Hello World 15
 * Hello World 16
 * Hello World 17
 * Hello World 18
 * Hello World 19
 * Hello World 20
 * Hello World 21
 * Hello World 22
 * Hello World 23
 * Hello World 24
 * Hello World 25
 * Work is Done.
 * 
 */
