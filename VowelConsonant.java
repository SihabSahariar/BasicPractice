
package javaselfpractice;
//Using If Else
import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Test Case: ");
        int counter=sc.nextInt();
        for(int i=1;i<=counter;i++)
        {
        System.out.print("Please Enter A Character: ");
        char ch=sc.next().charAt(0); //Just taking the character located at a[0] 
        
        if(ch=='a'|| ch=='A'){
            System.out.println("Case No: "+i+" : VOWEL");
        }
        else if(ch=='e'|| ch=='E'){
           System.out.println("Case No: "+i+" : VOWEL");
        }
        else if(ch=='i'|| ch=='I'){
           System.out.println("Case No: "+i+" : VOWEL");
        }                                                           
        else if(ch=='o'|| ch=='O'){
             System.out.println("Case No: "+i+" : VOWEL");
        }
        else if(ch=='u'|| ch=='U'){
            System.out.println("Case No: "+i+" : VOWEL");
        }
        else{
            System.out.println("Case No: "+i+" : CONSONANT");
        }
    }
}
}
