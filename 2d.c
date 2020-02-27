#include<stdio.h>
int main()
{   int arra[2][4]; //for 2 class & 4 number of students
    int clas=0,temp;

    for(int i=0;i<2;i++)
    {
        printf("Please Enter Class: ");
        scanf("%d",&clas);
         if(i==0){
           temp=clas;
        }
         printf("Please Enter Result for Class %d: ",clas);
        for(int k=0;k<4;k++)
        {
            scanf("%d",&arra[i][k]);
        }
    }

    for(int i=0;i<2;i++)
    {
        if(i>0){
           clas=temp;
           printf("\n");
        }
        for(int k=0;k<4;k++)
        {
             printf("Class: %d,Roll: %d,Result: %d\n",clas,k+1,arra[i][k]);

        }
    }
}
