#include<stdio.h>
#include<stdlib.h>
#define MAX 10
char TREE[MAX];

void root(char ch){
    if(TREE[0]!='\0')
        printf("Root is alreay exist\n");
    else
        TREE[0]=ch;
}

void left(char ch,int parentIndex){
    if(TREE[parentIndex]=='\0'){
        printf("parent of %c does not exit\n",ch);
    }
    else{
        int index=(2*parentIndex)+1;
        TREE[index]=ch;
    }
}

void right(char ch,int parentIndex){
    if(TREE[parentIndex]=='\0'){
        printf("parent of %c does not exit\n",ch);
    }
    else{
        int index=(2*parentIndex)+2;
        TREE[index]=ch;
    }
}

void print(){
    int i;
    for(i=0;i<MAX;i++){
        if(TREE[i]=='\0')
            printf("*\t");
        else
            printf("%c\t",TREE[i]);
    }
}

int main(){
    root('A');
    left('B',0);
    right('C',0);
    left('D',1);
    right('E',1);
    print();

}