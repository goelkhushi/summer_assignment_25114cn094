#include<stdio.h>
int main(){
    int n,a=0,b=1,sum=0;
    printf("enter a number of term which fibo series you want to see");
    scanf("%d",&n);
    for(int i=1;i<=n;i++){
        sum = a+b;
        printf("%d",sum);
        printf("\n");
        a=b;
        b=sum;
    }
    return 0;
}