#include<stdio.h>
int main()
{
    int section,studentn;
    printf("Please Enter Section Number & Student Number\n");
    scanf("%d %d",&section,&studentn);
    int total[section][studentn];
    for(int i=0;i<section;i++){
        for (int k=0;k<studentn;k++){
                printf("Please Enter For Section %d Student Number %d: ",section,k+1);
            scanf("%d %d",&total[section][studentn]);
        }
    }
      for(int i=0;i<section;i++){
        for (int k=0;k<studentn;k++){
               // printf("Please Enter Section %d Student")
            printf("Section: %d Student:%d",total[section][studentn]);
        }
    }
}
