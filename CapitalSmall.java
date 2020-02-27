package javaselfpractice;
import java.util.Scanner;
public class CapitalSmall {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch=sc.next().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("Small");
        }
        else if(ch>='A' && ch<='Z'){
            System.out.println("Captial");
        }
        else{
            System.out.println("Wrong Input!");
        }
    }
}
