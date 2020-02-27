#include<stdio.h>
int main()
{   //Database using 1D array
    int x[10]={10,22,83,14,65,89,90,100,43,55}; // x[0]=10 //x[1]=22//x[2]=83....x[n-1]=nth element
    printf("Total Elements: \n");
    for(int k=0;k<10;k++){
        printf("%d\n",x[k]);
    }
    printf("\n");
    int store;
    printf("Please Enter a Number to Find: ");
    int in;
    scanf("%d",&in);
    for(int i=0;i<10;i++)
    {
        if(in==x[i]){
           if(in==x[0]){
            printf("Found %d on %dst position\n",x[i],i+1);
            store=x[i];
           }
           else if(in==x[1]){
            printf("Found %d on %dnd position\n",x[i],i+1);
            store=x[i];
           }
            else if(in==x[2]){
            printf("Found %d on %drd position\n",x[i],i+1);
            store=x[i];
           }
           else{
            printf("Found %d on %dth position\n",x[i],i+1);
            store=x[i];
           }
        }
    }

    if(in!=store){
        printf("Can't Find in Database\n");
    }

}
