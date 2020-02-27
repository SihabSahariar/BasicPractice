
package javaselfpractice;

/**
 *
 * @author sizan_000
 */
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
 
             
          int n = 21, t1 = 0, t2 = 1;
        
        while (t1 <= n)
        {
            System.out.println(t1);

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
            
    }
}
    

