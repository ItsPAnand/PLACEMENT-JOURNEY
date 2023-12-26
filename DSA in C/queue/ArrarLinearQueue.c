#include<stdio.h>
#define SIZE 5
int queue[SIZE];
int front=-1,rear=-1;

void enqueue(int x){
    if(rear==SIZE-1)
        printf("The Queue is Full\n");
    else if(front==-1 && rear==-1){
        front=0;
        rear=0;
        queue[rear]=x;
    }
    else{
        queue[++rear]=x;
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
        front++;
    }
}

void display(){
    if(front==-1 && rear==-1)
        printf("The Queue is Empty\n");
    else{
        printf("The element of the Queue is\n");
    for (int i = front; i <= rear; i++)
    {
        printf("%d\t",queue[i]);
    }
    printf("\n");
    }
}

int main(){
    enqueue(5);
    enqueue(3);
    enqueue(1);
    enqueue(12);
    enqueue(51);
    enqueue(1);
    display();
    dequeue();
    dequeue();
    dequeue();
    dequeue();
    dequeue();
    dequeue();
    dequeue();
}