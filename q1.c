#include<stdio.h>
int main(){
    int n ,sum=0;
    printf("enter a n natural number");
    scanf("%d",&n);
    for(int i=1;i<=n;i++){
        sum+=i;
    }
    printf("the sum of n natural number is %d",sum);
    return 0;
}