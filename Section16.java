
package Quiz;

import java.util.Scanner;

/**
 *
 * @author : Sihab Sahariar Sizan 
 * 
 */
public class Section16 {
    public static void main(String[] args) {
        int lottery=327;
        int num,n1,n2,n3;
        int a=3,b=2,c=7;
        System.out.printf("Please Enter Your Lottery Number: \n");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        n1=num/100;
        n2=(num-(n1*100))/10;
        n3=(num-(n1*100))%10;
        if(num==lottery){
            System.out.printf("Boom!Boom!You Have Won 10000$ Prize\n");
        }
        else if(a==n1 &&b==n2||b==n2&&c==n3||a==n1&&c==n3){
            System.out.printf("Boom!You have won $3000 Prizes");
        }
        else if(a==n1 || b==n2||c==n3){
            System.out.printf("Yes!You have won $1000 Prizes");
    }

    }
}
