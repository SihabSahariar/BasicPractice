#include <stdio.h>
#include <bits/stdc++.h> 

int main()
{
   int n, sum = 0, c;
   //unsigned long long array[1000];
char array[1000];

   scanf("%d", &n);

   for (c = 0; c < n; c++)
   {
      
gets(array);
int len=strlen(array);
      sum = sum + len;
   }

   printf("%d\n", sum);

   return 0;
}

