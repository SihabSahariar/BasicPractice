/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp;

import java.util.Scanner;
public class Main_038
{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
  int code=sc.nextInt();
  int q=sc.nextInt();
  
        switch (code) {
            case 1:
                {
                    double total=q*4.00;
                    System.out.println("Total: R$ "+total);
                    break;
                }
            case 2:
                {
                    double total=q*4.50;
                    System.out.println("Total: R$ "+total);
                    break;
                }
            case 3:
                {
                    double total=q*5.00;
                    System.out.println("Total: R$ "+total);
                    break;
                }
            case 4:
                {
                    double total=q*2.00;
                    System.out.println("Total: R$ "+total);
                    break;
                }
            case 5:
                {
                    double total=q*1.50;
                    System.out.println("Total: R$ "+total);
                    break;
                }
            default:
                break;
        }
  
    }
  
}