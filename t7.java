package cse110;

import java.util.Scanner;

public class t7 
{
    public static void main(String[] args) 
    {
        double x,y,z,s,area;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter The Value of X,Y,Z: ");
        x=sc.nextDouble();
        y=sc.nextDouble();
        z=sc.nextDouble();
        s=(x+y+z)/2;
        area=Math.sqrt(s*(s-x)*(s-y)*(s-z));
        System.out.println("Area: "+area);
    }
    
}
