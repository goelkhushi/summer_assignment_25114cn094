#include<stdio.h>
int main(){
    int n;
    printf("how many range you want to print a prime number");
    scanf("%d",&n);
    for(int i=1;i<=n;i++){
        int p=0;
        for(int j=2;j<i;j++){
            if(i%j==0){
                p=1;
                break;
            }
        }
        if (p==0){
            printf("%d",i);
        }
        printf("\n");
    }
    return 0;
}