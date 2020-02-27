#include<stdio.h>
#include<math.h>
int minimum(int x,int y)
{
    if(x>y){
        return y; //Y is Minimum
    }
    else{
        return x;// X is Minimum
    }
}

int nPn (int s)
{
    int sq=pow(s,s); //make sq=s^s Ex: 3^3=27
    return sq;
}

int root(int x)         //Replacement of sqrt function using loop.
{
    for(int i=1;i<=x;i++){
    if(x==i*i){
        return i;
        break;
    }
 }

}
double circle(double r)
{
    double area_circle=3.1416*pow(r,2);
    return area_circle;
}
int rect(int h,int w)
{
    int area_rect=h*w;
    return area_rect;
}


int main()
{
    int a,b;
    printf("Please Enter Two Numbers to Find Minimum: \n");
    scanf("%d %d",&a,&b);
    int min=minimum(a,b);
    printf("Minimum: %d\n",min);
    printf("\n");
    printf("Please Enter n to Find n^n: \n");
    double s;
    scanf("%lf",&s);
    int sqr=nPn(s);
    printf("n^n: %d\n",sqr);
    printf("\n");
    printf("Please Enter a Number to Find Square Root: \n");
    int r;
    scanf("%d",&r);
    int rt=root(r);
    printf("Root of %d: %d\n",r,rt);
    printf("\n");
    printf("Please Enter Radius to Find Area of a Circle: \n");
    double rad;
    scanf("%lf",&rad);
    double cric=circle(rad);
    printf("Area of Circle : %.2lf\n",cric);
    printf("\n");
    printf("Please Enter H & W to Find Area of a Circle: \n");
    int h,w;
    scanf("%d %d",&h,&w);
    int recta=rect(h,w);
    printf("Area of Rectangular : %d\n",recta);
}
