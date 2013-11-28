//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
import java.util.Scanner;

public class Paint
{
    public static void main(String[] args)
    {
        final int COVERAGE = 350; //paint covers 350 sq ft/gal
        //declare integers length, width, and height;
        int length, width, height;
        //declare double totalSqFt;
        double totalSqFt;
        //declare double paintNeeded;
        double paintNeeded;
        //declare and initialize Scanner object
        Scanner scan = new Scanner (System.in);
        //Prompt for and read in the length of the room
        System.out.println("Please input the length of the room to be painted:");
        length = scan.nextInt();
        //Prompt for and read in the width of the room
        System.out.println("please input the width of the room to be painted:");
        width = scan.nextInt();
        //Prompt for and read in the height of the room
        System.out.println("Please input the height of the room to be painted:");
        height = scan.nextInt();
        //Prompt for and read in the number of windows in the room
        System.out.println("please input the number of windows in the room");
        int numberWindows = scan.nextInt();
        int areaWindow = 15;
        //Prompt for the number of doors in the room
        System.out.println("Please input the number of doors in the room");
        int numberDoors = scan.nextInt();
        int areaDoor = 20;
        //Compute the total square feet to be painted--think
        //about the dimensions of each wall
        totalSqFt = ((2 * width * height) + (2 * length * height)) - (numberDoors * areaDoor + numberWindows * areaWindow);
        //Compute the amount of paint needed
        paintNeeded = (totalSqFt / COVERAGE);
        //Print the length, width, and height of the room and the
        //number of gallons of paint needed.
        System.out.println("For a room with walls " + length + " feet long, " 
                + width + " feet wide, and " + height + 
                " feet high, you would need to buy " + paintNeeded + 
                " gallons of paint.");
    }
}