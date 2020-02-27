 #include<bits/stdc++.h>
 using namespace std;
 int main()
 {
     int num,counter=0;
     scanf("%d",&num);
     for(int i=1;i<=num;i++)  //6
        {
            if(num%i==0){
                counter++;
            }
        }
        printf("Total Divisor : %d\n",counter);
        if(counter>=3)
            printf("Not Prime");
            else
            printf("Prime");


 }
