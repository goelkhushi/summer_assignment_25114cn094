#include<stdio.h>
int main(){
    int n,sum=0,n1,r;
    printf("enter a number n is ");
    scanf("%d",&n);
    n1 =n;
    while(n!=0){
        r = n%10;
        sum = sum*10 +r;
        n = n/10;
    }
    if (n1 == sum){
        printf("number n  %dis  a pallindrome number",n1);
    }   
    else{
        printf("number n %d is not a  pallindrome number",n1);
    }
    return 0;
}