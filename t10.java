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
public class t10 {
    
  public static void main(String args[])
  {
    boolean var1 = false, var2 = false, var3 = false, var4 = false,var5 = false; 
    boolean var6 = false, result1 = false, result2 = false, result3 = false, result4 = false;
    boolean result5 = false, result6 = false, result7 = false, result8 = false;
    boolean result9 = false, result10 = false;
    var1 = 4 > 3 - 1;
    var2 = var1 && false;
    var3 = true;
    var4 = false;
    var5 = true;
    var6 = var3 && false;
    result1 = (var1 || var2) && (8 * 10 > 45);
    result2 = (var1 || var2) && (result1 && false);
    result3 = (var1 && result1) || result2;
    result4 = (var1 || var2) || ((var3 && var1) && false);
    result5 = (var1 && var2) && (result3 || var1);
    result6 = ((var3 || var2) && !(result5)) || true;
    result7 = (var4 && result1) && ((result1 && false) || true);
    result8 = ((var1 && result3) && (var5 || var6)) && true;
    result9 = ((result2 && var2) || (result7 && var1)) && false;
    result10 = !(var1 && true);
      System.out.println("Result 1: "+result1);
      System.out.println("Result 2: "+result2);
      System.out.println("Result 3: "+result3);
      System.out.println("Result 4: "+result4);
      System.out.println("Result 5: "+result5);
      System.out.println("Result 6: "+result6);
      System.out.println("Result 7: "+result7);
      System.out.println("Result 8: "+result8);
      System.out.println("Result 9: "+result9);
      System.out.println("Result 10: "+result10);
      
  }

}
