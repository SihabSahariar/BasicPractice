
package cse110;

import java.util.Scanner;

public class t6 {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("Please Enter S: ");
          int s=sc.nextInt();
          int L;
          if(s<100){
                L=3000-(125*s*s);
                System.out.println(L);
          } 
          else if(s>=100){
              L=12000/(4+((s*s)/14900));
              System.out.println(L);
          }
          
    }
 
}
