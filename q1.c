#include<stdio.h>
int main(){
    int dec,bin =0 ,r;
    printf("enter a decimal number is");
    scanf("%d",&dec);
    while(dec!=0){
        r = dec%2;
        bin = bin*10 +r;
        dec = dec/2;
    }
    printf("the binary number is %d",bin);
    return 0;
}