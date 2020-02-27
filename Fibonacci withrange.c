#include<stdio.h>
int main()
{
    //0,1,1,2,3,5,8,13,21
    int first=0,second=1,fibo=0,n;
    printf("Please Enter nth term: ");
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
        if(i<=1){
            fibo=i;
        }
        else
        {
            fibo=first+second;
            first=second;
            second=fibo;
        }
        printf("%d\n",fibo);
    }


}
