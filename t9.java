package cse110;

import java.util.Scanner;

public class t9 {
    public static void main(String[] args) {
        System.out.println("Please Enter 3 Numbers: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b&&a>c)
        {
             System.out.println("Maxumum Number: "+a);
        }  
        else if(b>a &&b>c)
        {
             System.out.println("Maxumum Number: "+b);
        }  
        else
        {
             System.out.println("Maxumum Number: "+c);
        }
        
    }
    
}
