#include<stdio.h>
#include<math.h>
int main(){
    int bin ,dec =0,r,p=0;
    printf("enter a binary number is");
    scanf("%d", &bin);
    while(bin !=0){
        r = bin%10;
        if(r==1){
            dec = dec + pow(2,p);
        }
        p++;
        bin = bin/10;        
    }
    printf("the decimal number is %d",dec);
    return 0;        
}