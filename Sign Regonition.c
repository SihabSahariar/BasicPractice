#include<stdio.h>
#include<conio.h>
main()
{

        char p;
        printf("Enter The Character:\n");
        scanf("%c",&p);
        if(p=='+'){
            printf("The Sign is: Plus\n"); //Plus
            printf("Example: 1+2=3\n");
        }
        else if(p=='-'){
            printf("The Sign is: Minus\n");//Minus
            printf("Example: 5-2=3\n");
        }
         else if(p=='*'){
            printf("The Sign is: Multiplication\n");//Into
            printf("Example: 2*2=4\n");
        }
         else if(p=='/'){
            printf("The Sign is: Devision\n");//Divide
            printf("Example: 6/2=3\n");
        }
         else if(p=='%'){
            printf("The Sign is: Modulus\n"); //Modulus
            printf("Example: 9%3=0\n");
        }
         else if(p=='&'){
            printf("The Sign is: And\n"); //And
            printf("Example: Used in several condition needed at a time.\n");
        }
         else if(p=='#'){
            printf("The Sign is: Hash\n"); //Hash
            printf("Example: Used in Social Media for tagging.\n");
        }


}
