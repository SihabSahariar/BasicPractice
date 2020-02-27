#include<stdio.h>
int main()
{
   // int cases;
   // scanf("%d",&cases);
   // for(int i=1;i<=cases;i++){
    int marks;
    printf("Give me your marks:\n");
    scanf("%d",&marks);
//    printf("Cases %d: ",i);
    if(marks>=80){
        printf("A+\n");
        }
     else if(marks>=70 && marks<=100){
         printf("A\n");
        }
     else if(marks>=60 && marks<70){
        printf("A-\n");
        }
     else if(marks>=50 && marks<60){
        printf("B\n");
         }
     else if(marks>=33 && marks<50){
        printf("C\n");
         }

    else{
        printf("Fail\n");
         }

//}
}
