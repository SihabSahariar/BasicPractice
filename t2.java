
package cse110;

import java.util.Scanner;


public class t2 {
    public static void main(String[] args) 
    {
        System.out.print("Please Enter Marks: ");
        Scanner sc=new Scanner(System.in);
        int mark=sc.nextInt();    
        if(mark>100 || mark<0)
        {
            System.out.println("Wrong Input");                
        }
        else if(mark>=90)
        {
            System.out.println("A");                
        }
        else if(mark>=80 && mark<90)
        {
            System.out.println("B");                
        }
        else if(mark>=70 && mark<80)
        {
            System.out.println("C");                
        }
        else if(mark>=60 && mark<70)
        {
            System.out.println("D");                
        }
        else if(mark>=50 && mark<60)
        {
            System.out.println("E");                
        }
        else{
            System.out.println("F");
        }
    }
}
