#include<stdio.h>
int main()
{
    int a,b;
    printf("Enter the number:\n");
    scanf("%d",&a);
    for(b=1;b<=a;b++)
    {
        if(b*b==a)
        {
             printf("%d\n",b);
             break;
        }

    }
}


