
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