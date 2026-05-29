#include<stdio.h>
int main(){
    int n,muti =1;
    printf("enter a n natural number is");
    scanf("%d",&n);
    for(int i=1;i<=n;i++){
        muti = muti*i;
    }
    printf("the mutiple of n natural number n is %d",muti);
    return 0;
}