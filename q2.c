#include <stdio.h>
int main(){
    int num,multi;
    printf("enter a number num is");
    scanf("%d",&num);
    for(int i=1;i<=10;i++){
        multi = num*i;
        printf("%d",multi);
        printf("\n");
    }
    return 0;
}