#include<stdio.h>
int main(){
    int n,count =0,d;
    printf("enter a number n is ");
    scanf("%d",&n);
    while(n!=0){
        d= n%10;
        count++;
        n =n/10;
    }
    printf(" the of digit in a given number n %d is %d",n,count);
    return 0;
}