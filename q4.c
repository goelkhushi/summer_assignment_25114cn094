#include<stdio.h>
int main(){
    int num,r,p1=0,a=0;
    printf("enter a number num is");
    scanf("%d",&num);
    for(int i=1;i<=num;i++){
        r =num%i;
        if(r == 0){
            for(int j=2;j<i;j++){
                if (i%j ==0){
                    p1 =0;
                    break;
                }
                p1 =i;
            }
            if(p1!=0){
                if(p1>a){
                    a =p1;
                }
            }
        }
    }
    printf("the largest prime factor of  num %d is %d",num ,a);
    return 0;
}