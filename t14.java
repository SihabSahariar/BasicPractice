package cse110;

import java.util.Scanner;

public class t14 {
     public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           System.out.println("Please Enter An Integer: ");
        int n=sc.nextInt();
        if(n>0){
            System.out.println(n);
        }    
        else{
             System.out.println(-1*n);
        }
    }
   
}

