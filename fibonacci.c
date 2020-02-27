#include<stdio.h>


 int main()
 {
    int prime,c=0;
    scanf("%d",&prime);
    for(int i=1;i<=prime;i++)
    {
       if(prime%i==0)
       {
           c++;
       }
   }
   if(c>2)
   {
        printf("Not Prime\n");
   }
   else
   {
        printf("Prime\n");
   }
 }
