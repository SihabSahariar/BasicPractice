
package cse110;

import java.util.Scanner;
public class t13 {
         public static void main(String[] args) 
     {
        System.out.println("Please Enter The Value of A & B & C & D: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int temp;
        temp=c;
        c=d;
        d=a;
        a=b;   
        b=temp;
        System.out.println("A: "+a+" B: "+b+" C: "+c+" D: "+d);
    }
}
