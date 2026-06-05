
#include<stdio.h>
int main(){
    int num,r,n1,fact =1,sum=0; 
    printf("enter a number num is");
    scanf("%d",&num);
    n1 = num;
    while(num!=0){
        r= num%10;
        fact =1;
        for(int i=1;i<=r;i++){
            fact = fact*i;
        }
        sum = sum+fact;
        num = num/10;
    }
    if (n1 == sum){
        printf(  "the number num %d is a strong number",n1);
    }
    else
    printf("the number num %d is not a strong number",n1);
}