package javaselfpractice;

import java.util.Scanner;

public class switchExample2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter a Small Letter:");
        char ch=sc.nextLine().charAt(0);   //Taking character at first position 
        switch(ch){
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
        
    }
    
    
}
