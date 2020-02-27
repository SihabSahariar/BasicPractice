
package cse110;

import java.util.Scanner;

public class t4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter Your Payment: ");
        int payment=sc.nextInt();
        System.out.println("Please Enter Your Age: ");
        int age=sc.nextInt();
        if(age<18 || payment<10000)
        {
            System.out.println("NO TAX");
        }
        else if(payment>=10000 && payment<=20000)
        {
            System.out.println("Tax: "+(payment/20));
        }
        else if( payment>20000)
        {
            System.out.println("Tax: "+(payment/10));
        }
    }
}
