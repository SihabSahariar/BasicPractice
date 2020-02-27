#include<stdio.h>
int main()
{
    int input,sum=0;
    scanf("%d",&input);
    for(int i=1;i<input;i++)
    {
        if(input%i==0)
        {
            sum=sum+i;
        }

    }

    if(sum==input)
    {
        printf("Perfect Number\n");
    }
    else
    {
        printf("Not Perfect Number\n");
    }

}
