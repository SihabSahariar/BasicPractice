#include<stdio.h>
int main()
{
    int ticket=312;
    int a=3,b=1,c=2;
    int lottery;
    scanf("%d",&lottery);
    int t1=lottery/100;
    int t2=(lottery%100)/10;
    int t3=(lottery%100)%10;
    if(ticket==lottery)
        printf("Champion: 10,000$");
    else if((t1==a&&t2==b)||(t1==a&&t3==c)||(t2==b&&t3==c))
        printf("First Runner Up: 3000$");
    else if(t1==a||t2==b||t3==c)
        printf("Second Runner Up: 1000$");
    else
        printf("Sorry");
}
