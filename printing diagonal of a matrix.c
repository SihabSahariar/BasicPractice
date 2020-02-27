#include <stdio.h>
main()
{
	int a,b,c,d,e,f,g,h,i;
	printf("Please Input all the value:\n" );
	scanf("%d %d %d %d %d %d %d %d %d",&a,&b,&c,&d,&e,&f,&g,&h,&i);
	printf("\n");
	printf("Matrix:\n");
	printf("--------\n");
	printf("%d %d %d\n",a,b,c);
	printf("%d %d %d\n",d,e,f);
	printf("%d %d %d\n",g,h,i);
	printf("\n");
	printf("If The matrix is right then please press 1 to confirm and 2 to exit\n");
	printf("\n");
    int x;
    scanf("%d",&x);
    if(x==1)
    {
      printf("The elements of the Primary Diagonal are: %d %d %d",a,e,i);
      printf("\n");
    }

    else if(x==2)
    {
	return 0;
    }
}

//Normal using variable and stdio.h function
