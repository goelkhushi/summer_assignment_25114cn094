// count set bits in a number
#include<stdio.h>
int main(){
    int num,count,r;
    printf("enter a number is ");
    scanf("%d",&num);
    while(num!=0){
        r = num%2;
        if(r ==1){
            count++;
        }
        num  = num/2;
    }
    printf("the number of set bits is %d",count);
    return 0; 
}