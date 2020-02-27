#include<stdio.h>
int main()
{
    int n;
    int max,min;
    double sum1=0,sum=0;
    printf("Please Enter a Number: ");
    scanf("%d",&n);
    max=n;
    min=n;
    sum=n;
    for(int i=1;i<5;i++)
    {

        printf("Please Enter a Number: ");
        scanf("%d",&n);
        if(n>max)
            max=n;
        else if(n<min)
            min=n;
        sum1=sum1+n;

    }
    sum=sum+sum1;
    double avg=sum/5;
    printf("Max=%d\nMin=%d\nSum=%.2lf\n",max,min,avg);

}
