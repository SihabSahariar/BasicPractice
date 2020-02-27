/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaselfpractice;

import java.util.Scanner;

/**
 *
 * @author sizan_000
 */
public class SwitchExample3 {
    public static void main(String[] args) {
        System.out.println("Please Enter A Digit For Spelling(0-9): ");
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        switch(i){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 0:
                System.out.println("Zero");
                break;
            default:
                System.out.println("Not a Digit");
        }
    }
}
