#include<stdio.h>
#define SIZE 5
int Stack[SIZE];
int top=0;

void push(int x){
    if(top==SIZE-1){
        printf("Stack is full\n");
    }
    else{
        Stack[top++]=x;
    }
}

void pop(){
    if(top==-1){
        printf("Stack is Empty\n");
    }
    else{
        printf("The poped element is %d\n",Stack[top]);
        top--;
    }
}

void display(){
    for(int i=top-1;i>=0;i--)
        printf("%d\t",Stack[i]);
}
int main()
{
    push(7);
    push(6);
    push(56);
    push(67);
    display();
    return 0;
}