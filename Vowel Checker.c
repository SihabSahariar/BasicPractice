#include<stdio.h>
main(){

char a;
printf("Enter an Alphabet:\n");
printf("------------------\n");
scanf("%c",&a);
printf("\n");
if (a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
    printf("Result: Vowel\n");
else
    printf("Result: Consonant\n");

}
