
package cse110;

import java.util.Scanner;

public class t12 {
     public static void main(String[] args) 
     {
        System.out.println("Please Enter The Value of A & B & C: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int temp;
        temp=b;
        b=a;
        a=c;
        c=temp;
        System.out.println("A: "+a+" B: "+b+" C: "+c);
    }
}
