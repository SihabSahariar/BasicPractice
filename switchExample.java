
package javaselfpractice;

import java.util.Scanner;

public class switchExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter Number: ");
        int input=sc.nextInt();
        int div=input%2;
        switch(div){
            case 0:
                System.out.println("Even Number");
                break;
            default:
                System.out.println("Odd Number");
        }
    }
}
