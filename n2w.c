#include<stdio.h>


int main()
{
  int number, i=0, x, d;
  char * word [2000];
  printf ("Enter a Number: \n");
  scanf ("%d", &number);
  while (number)
  {


    switch(number %10)
    {
      case 0: word[i++] = "zero";
      break;
      case 1: word[i++] = "one";
      break;
      case 2: word[i++] = "two";
      break;
      case 3: word[i++] = "three";
      break;
      case 4: word[i++] = "four";
      break;
      case 5: word[i++] = "five";
      break;
      case 6: word[i++] = "six";
      break;
      case 7: word[i++] = "seven";
      break;
      case 8: word[i++] = "eight";
      break;
      case 9: word[i++] = "nine";
      break;
    }
    number = number /10;
  }
  for(x=i-1; x>=0; x--){
  printf ("%s ",word[x]);
  }
}
