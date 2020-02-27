/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheoryTracing;

/**
 *
 * @author sizan_000
 */
public class t3 {
       public static void main(String args[])
   {
     int x = 0, y =0;
     int sum = 0;
       System.out.println("X= "+x);
       System.out.println("Y= "+y);
       System.out.println("sum= "+sum);
     while (x < 10){
       y = x - 3;
       System.out.println("Y= "+y);
       while (y < 3){
         sum = (sum % 3) + x - y * 3 ;
         System.out.println("Sum= "+sum);
         System.out.println("Output= "+sum);
         
         y = y + 1;
         System.out.println("Y= "+y);
       }
       if (x > 5){
         x++;
         System.out.println("X= "+x);
       }else{
         x += 2;
         System.out.println("X= "+x);
       }
     }
   }

    
}
