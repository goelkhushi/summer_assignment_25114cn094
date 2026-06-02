#include<stdio.h>
int main(){
    int n ,sum =0,r;
    printf("enter a number n is");
    scanf("%d",&n);
    while(n!=0){
        r =n%10;
        sum = sum*10+r;
        n = n/10;
    }
    printf("the reverse of a number n %d is %d",n,sum);
    return 0;
}