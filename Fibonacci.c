#include<stdio.h>
int main()
{
    //0,1,1,2,3,5,8,13,21
    int num1=0,num2=1,sum;
    while(num1<=21)
    {
        printf("%d\n",num1);
        sum=num1+num2;
        num1=num2;
        num2=sum;
    }
}
