//------------------------------------------------------------
//Prelab Exercises (continued in Errors.java)
//1) What is the difference between a variable and a constant?
//  A variable is a data value that can change over the course of
//  program execution by assignment statements, for example. In
//  contrast, a constant will hold a particular value for the
//  duration of their existence.
//
//2)Explain what each of the following does:
//
//a)int x;
//  This statement is a variable declaration; it instructs the
//  compiler to reserve a portion of main memory large enough to
//  hold an integer value in this case.
//
//b)int x = 3;
//  This statement is also a variable declaration, but it also
//  assigns the value of 3 to x. 
//
//c)x = 3;
//  This statement is an assignment statement: it assigns the
//  value 3 to the variable x. It does not declare the type
//  of variable that x is.
//
//3)The following program reads three integers and prints the average.
//  Fill in the blanks so that it will work correctly.
// *****************************************************************
// Average.java
//
// Read three integers from the user and print their average
// *****************************************************************
import java.util.Scanner;
public class Average
{
    public static void main(String[] args)
    {
        int val1, val2, val3;
        double average;
        Scanner scan = new Scanner(System.in);
        
        // get three values from the user
        System.out.println("Please enter three integers and" +
                            " I will compute their average");
        val1 = scan.nextInt();
        val2 = scan.nextInt();
        val3 = scan.nextInt();
        //compute the average
        average = (val1 + val2 + val3)/3;       //is there a way to generalize this denominator for n inputs?
        //print the average
        System.out.println("The average value of your integers is: " + average);
    }
}