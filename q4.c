#include<stdio.h>
int main(){
    int num1,num2,lcd;
    printf("enter a number num1 is");
    scanf("%d",&num1);
    printf("enter a number num2 is");
    scanf("%d",&num2);
    for(int i=1;i<=num1;i++){
        if(num1%i==0 && num2%i==0){
            lcd = i;
            break;
        }
    }
    printf("lcd of two number %d and %d is %d",num1,num2,lcd);
    return 0;
}