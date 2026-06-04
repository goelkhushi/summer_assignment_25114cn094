#include<stdio.h>
int main(){
    int num,n1,r,sum =0;
    printf("enter a number num is");
    scanf("%d",&num);
    n1=num;
    while(num!=0){
        r = num%10;
        sum = sum+(r*r*r);
        num = num/10;
    }
    if (n1==sum){
        printf("the number %d is an armstrong number",n1);
    }
    else
    printf("the number %d is not an armstrong number",n1);
    return 0;
}