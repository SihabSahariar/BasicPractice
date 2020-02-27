#include<bits/stdc++.h>
using namespace std;
int main()
{
int counter=1;
int sum=0;
while(counter<=600){


if(counter%7==0){
sum=sum+counter;

}
else if(counter%9==0){
sum=sum+counter;

}

if(counter%63==0){
sum=sum-counter;
}



counter++;


}

printf("%d",sum);

}


