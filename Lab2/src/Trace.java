// FILE: Trace.java
// PURPOSE: An exercise in tracing a program and understanding
// assignment statements and expressions.
import java.util.Scanner;
public class Trace
{
    public static void main (String[] args)
       {
        int one, two, three;
        double what;
        Scanner scan = new Scanner(System.in);
        System.out.print ("Enter two integers: ");
        one = scan.nextInt();
        two = scan.nextInt();
        System.out.print("Enter a floating point number: ");
        what = scan.nextDouble() ;
        three = 4 * one + 5 * two;
        two = 2 * one;
        System.out.println ("one " + two + ":" + three);
        one = 46 / 5 * 2 + 19 % 4;
        three = one + two;
        what = (what + 2.5) / 2 ;
        System.out.println (what + " is what!");
       }
}

//                                  one     two     three       what
// three    = 4 * one + 5 * two     10      3       -           14.3
//          = 40 + 15
//          = 55                                    55
//
// two      = 2 * one               10      3       55          14.3
//          = 20                            20
//
// one      = 46 / 5 * 2 + 19 % 4   10      20      55          14.3
//          = 9 * 2 + 19 % 4
//          = 18 + 19 % 4
//          = 18 + 4
//          = 22                    22
//
//three     = one + two             22      20      55          14.3
//          = 22 + 20
//          = 44                                    44
//
//what      = (what + 2.5) / 2      22      20      55          14.3
//          = 16.8 / 2
//          = 8.4                   22      20      55          8.4