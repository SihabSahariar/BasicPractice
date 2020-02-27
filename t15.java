package cse110;

import java.util.Scanner;

public class t15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter Hour: ");
        int time=sc.nextInt();
        if(time>24 || time<0)
        {
            System.out.println("Wrong Time");           
        }
        else if(time<=6 && time>=4)
        {
            System.out.println("Breakfast");
        }
        else if(time<=13 && time>=12)
        {
             System.out.println("Lunch");
        }
        else if(time<=17 && time>=16)
        {
             System.out.println("Snacks");
        }
        else if(time<=20 && time>=19)
        {
             System.out.println("Dinner");
        }
        else
        {
            System.out.println("Patience is a virtue");
        }
    }
    
}
