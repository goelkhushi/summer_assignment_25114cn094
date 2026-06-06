#include<stdio.h>
int main(){
    int x,n;
    printf("enter a number x is");
    scanf("%d",&x);
    printf("enter a power of x is");
    scanf("%d",&n);
    for(int i=1;i<=n;i++){
        x = x*x;
    }
    printf("the value of x to the power n is %d",x);
    return 0;
}