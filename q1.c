#include<stdio.h>
int main(){
    int n,sum=0;
    printf("enter the n natural number is");
    scanf("%d",&n);
    for(int i=1;i<=n;i++){
        sum = sum+i;
    }
    printf("the sum of n natural number is %d",sum);
    return 0;
}
