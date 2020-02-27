#include<bits/stdc++.h>
using namespace std;
int main()
{
  int start,end,change,i,counter=1;  //0-1234-100
  scanf("%d %d %d",&start,&end,&change);
   i=end/change;
   printf("%d\n",start);
   while(counter<=i){
    printf("%d\n",(counter*change));
    counter++;
   }

}
