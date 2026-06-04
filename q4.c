#include<stdio.h>
int main(){
    int num,n1,sum=0,r;
    printf("enter a number of range you want see an armstrong number");
    scanf("%d",&num);
    for(int i=1; i<=num;i++){
        n1 =i;
        sum=0;
        while(i!=0){
            r = i%10;
            sum = sum+(r*r*r);
            i = i/10;
        }
        if ( n1 == sum){
            printf("%d",n1);
            printf("\n");
        }
    }
    return 0;
}