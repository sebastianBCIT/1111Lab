// ***************************************************************
// LabGrade.java
// This program computes a student's lab grade from
// the grades on the three components of lab: the pre-lab
// assignment, the lab itself, and the post-lab assignment.
// ***************************************************************
import java.util.Scanner;

public class LabGrade 
{
    public static void main(String[] args)
    {
        //Declare constants
        double inWeight;   //In-class weight is 60%
        double outWeight;   //Out-of-class weight is 40%
        
        //Declare variables
        double preLabPts;  //number of points earned on the pre-lab assignment
        double preLabMax;  //maximum number of points possible for pre-lab
        double labPts;     //number of points earnred on the lab
        double labMax;     //maximum number of points possible for the lab
        double postLabPts; //number of points earned on the post-lab assignment
        double postLabMax; //maximum number of points possible for the post-lab
        double outClassAvg; //average on the out of class (pre and post) work
        double inClassAvg; //average on the in-class work
        double labGrade; //final lab grade
        
        Scanner scan = new Scanner (System.in);
        
        // Get the input
        System.out.println("\nWelcome to the lab grade calculator\n");
        System.out.print("Enter the number of points you earned on the pre-lab: ");
        preLabPts = scan.nextInt();
        System.out.print("What was the maximum number of points you could have earned? ");
        preLabMax = scan.nextInt();
        System.out.print("Enter the number of points you earned on the lab: ");
        labPts = scan.nextInt();
        System.out.print("What was the maximum number of points for the lab? ");
        labMax = scan.nextInt();
        System.out.print("Enter the number of points you earned on the post-lab: ");
        postLabPts = scan.nextInt();
        System.out.print("What was the maximum number of points for the post-lab? ");
        postLabMax = scan.nextInt();
        System.out.println();
        System.out.print("What ratio (in decimal form) of the total grade is in class work worth?");
        inWeight = scan.nextDouble();
        System.out.println();
        // Calculate the average for the out of class work
        outClassAvg = ( preLabPts + postLabPts ) / ( preLabMax + postLabMax) * 100;
        // Calculate the average for the in-class work
        inClassAvg = labPts / labMax * 100;
        // Calculate the weighted average taking 40% of the out-of-class average
        // plus 60% of the in-class
        labGrade = (1 - inWeight) * outClassAvg + inWeight * inClassAvg;
        // Print the results
        System.out.println("Your average on out-of-class work is " + outClassAvg + "%");
        System.out.println("Your average on in-class work is " + inClassAvg + "%");
        System.out.println("Your lab grade is " + labGrade + "%");
        System.out.println();
    }
}
// Hand Trace of original program (Question 1)
// outClassAvg  = preLabPts + postLabPts / preLabMax + postLabMax * 100
//              = 17 + 12 / 20 + 15 * 100
//              = 17 + 0 + 1500
//              = 1517
//
// inClassAvg   = labPts / labMax * 100
//              = 13 / 25 * 100
//              = 0 * 100
//              = 0
//
// labGrade     = 1517 * 0.4 + 0 * 0.6
//              = 606.8