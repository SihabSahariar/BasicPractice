#include<stdio.h>
#include<conio.h>
void main()
{
     int a,b,k;
    char q;
    printf("Calculator By Sizan\n");
    printf("\n");
    int t;
    while (t--){
    printf("Input(Number Operator Number): \n");
    scanf("%d %c %d",&a,&q,&b);
    if(q=='+'){
           k=a+b;
           printf("\n");
        printf("Result : %d + %d = %d\n",a,b,k);
    }
   else if(q=='-'){
         printf("\n");
           k=a+b;
        printf("Result: %d - %d = %d\n",a,b,k);
   }
    else if(q=='*')
    {
         printf("\n");
          k=a+b;
        printf("Result: %d * %d = %d\n",a,b,k);
    }
    else if(q=='/'){
           k=a/b;
           printf("\n");
        printf("Result: %d / %d = %d\n",a,b,k);


}
  else{
            return 0;
        }
printf("\n");
printf("Next Calculation:\n");
printf("----------------\n");
printf("\n");
    }



   return 0;
}
