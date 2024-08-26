//import stuff here!
//import stuff here!
import java.util.Scanner;

public class Program6{
    public static void main(String [] args){
        
        double diameter = 0.0;
        double area = 0.0;
        final double pi = 3.14159;
        double radius = 0.0;
        double circumference = 0.0;
        
        Scanner radiScan = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        radius = radiScan.nextDouble();
        
        diameter = 2*radius;
        area = pi*(radius*radius);
        circumference = 2*pi*radius;
        
        System.out.println("The radius of this circle is: "+radius);
        System.out.println("The diameter of this cirle is: "+diameter);
        System.out.println("The area of this cirle is: "+area);
        System.out.println("The circumference of this circle is: "+circumference);
        
        
        
        
        
        
    }
}
//Your code here

//Paste console output below:
/*
The radius of this circle is: 2.0
The diameter of this cirle is: 4.0
The area of this cirle is: 12.56636
The circumference of this circle is: 12.56636

*/
//Your code here

//Paste console output below:
/*


*/
