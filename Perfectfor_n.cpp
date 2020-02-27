#include<bits/stdc++.h>
using namespace std;
int main()
{
    int limits,limite,counter=0;
    scanf("%d %d",&limits,&limite);
    for(int c=limits;c<=limite;c++)
    {
        int sum=0;
        for(int i=1;i<c;i++)
        {
            if(c%i==0)
            {
                sum=sum+i;

            }
        }
        if(sum==c)
            {
               printf("%d \n",c);
                counter++;
                }

    }
printf("Total %d Perfect Number(s)",counter);


}
