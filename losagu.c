#include<stdio.h>
int main()
{
    int a,b;
    printf("Enter Two Numbers:\n");
    scanf("%d %d",&a,&b);
    if(a==b){
        printf("GCD: %d\n",a);
    }
    else if (a>b && a%b==0){
        printf("GCD: %d\n",a);

    }
     else if (a<b && b%a==0){
         printf("GCD: %d\n",b);

    }
      else if (a!=b && b%a!=0||b%a!=0){
         printf("GCD: %d\n",a*b);

    }
    return 0;
}





/*
step 1: Input Two Numbers (a&b)
step 2:
       1. a==b -> print a/b
       2. a>b && a%b==0 -> print a
       3. b<a && b%a==0 -> print b
       4. a!=b && a%b!=0 || b%a!=0 -> print a*b
step 3: Return 0

*/
