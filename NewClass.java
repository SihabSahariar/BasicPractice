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
public class NewClass {
     
  public static void main(String args[])
  {
 
    String test = "";
    int i = 0, j = 0, k = 15;
    test = "<--cat";
    while (i < 5){   
      k-=1;
      j = k;
      while (j > 10 ){
        if (j % 2 == 0){
          test += "-->";
          test =  test + i + (j / 2); 
        }else{
          test += "<--";
          test =  test + (i / 2) + j; 
        }
        System.out.println(test);
        if (j == 12){
           test = "<--cat";
        }
        --j;
      }
      i++;
    }




  }


}
