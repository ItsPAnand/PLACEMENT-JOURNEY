#include<stdio.h>
#define SIZE 5
int queue[SIZE];
int front=-1,rear=-1;

void enqueue(int x){
    if((rear+1)%SIZE==front)
        printf("The Queue is Full\n");
    else if(front==-1 && rear==-1){
        front=0;
        rear=0;
        queue[rear]=x;
    }
    else{
        rear=(rear+1)%SIZE;
        queue[rear]=x;
    }
}

void dequeue(){
    if(front==-1 && rear==-1){
        printf("The Queue is Empty\n");
    }
    else if(front==rear){
        printf("The dequeue element is %d\n",queue[front]);
        front=-1;
        rear=-1;
    }
    else{
        printf("The dequeue element is %d\n",queue[front]);
        front=(front+1)%SIZE;
    }
}

void display(){
    int i=front;
    if(front==-1 && rear==-1)
        printf("The Queue is Empty\n");
    else{
        printf("The element of the Queue is\n");
        while(i!=rear){
            printf("%d\t",queue[i]);
            i=(i+1)%SIZE;
        }
        printf("%d",queue[i]);
        printf("\n");
    }
}

int main(){
    enqueue(5);
    enqueue(3);
    enqueue(1);
    enqueue(12);
    enqueue(100);
    enqueue(0);
    display();
    dequeue();
    dequeue();
    dequeue();
    display();
    enqueue(88);
    enqueue(77);
    enqueue(122);
    display();
    return 0;
}