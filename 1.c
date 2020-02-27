//n সংখ্যক নাম্বার ইনপুট নিব  তারপর  সবগুলো রিভার্স আকারে প্রিন্ট করব

#include<stdio.h>
int main()
{   int n;
    printf("Please Enter The Value of N to Reverse: ");
    scanf("%d",&n);//n=3
    int s=n+1;//s=3+1=4
    int arra[s];// arra[4];takes 3 number from index 0 to 3
    for(int c=0;c<n;c++) //input until n=2 that means input for n=0,n=1,n=2
    {
        scanf("%d",&arra[c]); // arra[0]=1,arra[1]=2,arra[2]=3
    }

    printf("\nReverse: \n\n");

    for(int i=n-1;i>-1;i--) //i=3-1=2 and print arra[2] then i-- then arra[1] then i-- then arra[0] then get out from loop because i-- mean i=-1 that doesn't satisfy condition.

    {
        printf("array[%d] : %d\n",arra[i],arra[i]);
    }

}
