#include<stdio.h>
int main(){
    int n,product =1,r;
    printf("enter a number n is");
    scanf("%d",&n);
    while(n!=0){
        r =n%10;
        product = product*r;
        n = n/10;
    }
    printf("the product of digits of a number n is %d",product);
    return 0;
}