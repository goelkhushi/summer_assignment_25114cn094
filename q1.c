#include<stdio.h>
int main(){
    int a=0,b=1,sum=0;
    for(int i=1;i<=5;i++){
        sum = a+b;
        printf("%d",sum);
        printf("\n");
        a=b;
        b= sum;
    }
    return 0;
}