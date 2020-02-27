#include<stdio.h>
int minimum3num(int a,int b,int c)
{

    int min;
    if(a<b && a<c)
    {
        min=a;
    }
    else if(b<a && b<c)
    {
        min=b;
    }
    else
    {
        min=c;
    }

    return min;
}
int min(int a,int b,int c){
    int m;
if(a<b){
    m=a;
}
else{
    m=b;
}
if(c<m){
    m=c;
}
return m;


}
main()
{
    int x,y,z;
    scanf("%d %d %d",&x,&y,&z);
    int minimum=min(x,y,z);//minimum3num(x,y,z);
    printf("Minimum: %d",minimum);

}
