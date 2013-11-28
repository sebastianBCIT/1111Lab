// ************************************************************
// Circle.java
//
// Print the area of a circle with two different radii
// ************************************************************
import java.util.Scanner;
public class Circle
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        final double PI = 3.14159;
        int radius;
        System.out.println("Please enter a value for the radius of a circle");
        radius = scan.nextInt();
        double area = PI * radius * radius;
        double circumf = 2 * PI * radius;
        System.out.println("The area of a circle with radius " + radius + " is " 
                            + area);
        System.out.println("The circumference of a circle with radius " +
                radius + " is " + circumf);
        double area1 = area;
        double circumf1 = circumf;
        radius = 2 * radius;
        area = PI * radius * radius;
        circumf = 2 * PI * radius;
        System.out.println("The area of a circle with radius " + radius +
                " is " + area);
        System.out.println("The circumference of a circle with radius " +
                radius + " is " + circumf);
        double area2 = area;
        double circumf2 = circumf;
        double area_change = area2 / area1;
        double circumf_change = circumf2 / circumf1;
        System.out.println("The area changed by a factor of: " + area_change);
        System.out.println("The circumference changed by a facor of: " +
                            circumf_change);
        //Part 2: These results were expected because area depends on the 
        //square of the radius, whereas circumference is not.
        //Part3: The results hold for any value input.
    }
}