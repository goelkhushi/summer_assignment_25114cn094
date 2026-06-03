#include<stdio.h>
int main(){
    int num,p=0;
    printf("enter a number n is");
    scanf("%d",&num);
    for(int i=2;i<num;i++){
        if(num%i==0){
            p=1;
            break;
        }
    }
    if (p==0){
        printf("number num %d is a prime number",num);
    }
    else
    printf("number num %d is not a prime number",num);
    return 0;
}
