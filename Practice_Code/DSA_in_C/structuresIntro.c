#include<stdio.h>
#include<stdlib.h>

struct student
{
    char name[20];
    int age;
    int roll_no;
    float marks;
};

struct charSet
{
    char s;
    int i;
};

struct point
{
    int x;
    int y;
};

struct abc
{
    int a;
    char b;
};


void print(char name[],int age,int rollNo,float mark){
    printf("%s %d %d %.2f \n",name,age,rollNo,mark);
}
void keyValue(char *s,int *i){
    scanf("%c %i",s,i);
}

// void printValue(struct point p){
//     printf("%d %d\n",p.x,p.y);
// }

void printValue(struct point *p){
    printf("%d %d\n",p->x,p->y);
}

struct point edit(struct point p){
    (p.x)++;
    (p.y)+=5;
    return p;
}

struct point* fun(int a, int b){
    struct point* ptr=(struct point *)malloc(sizeof(struct point));
    if(ptr==NULL)
        printf("stack overflow\n");
    ptr->x=a;
    ptr->y=b+5;
    return ptr;
}

void printarr(struct abc arr[]){
    int i;
    for(i=0;i<2;i++){
        printf("%d %c\n",arr[i].a,arr[i].b);
    }
}

int main()
{
    // struct student s1={"Anand",20,105,8.51};
    // print(s1.name, s1.age, s1.roll_no, s1.marks);           // passing structure member  as arguments
    // struct charSet cs;
    // keyValue(&cs.s,&cs.i);                         // passing the addresses or call by reference
    // printf("%c %d\n",cs.s,cs.i);

    // struct point p1={21,43};
    // struct point p2={78,69};
    // printValue(p1);                         // passing the structures variable as argument
    // printValue(p2);

    // struct point p1={21,43};
    // struct point p2={78,69};
    // printValue(&p1);                         // passing the structures pointers as argument
    // printValue(&p2);

    // struct point p1={21,43};
    // struct point p2={78,69};
    // p1=edit(p1);                            // returning the structure variable from function
    // p2=edit(p2);
    // printValue(&p1);
    // printValue(&p2);

    // struct point *ptr1,*ptr2;
    // ptr1=fun(2,3);                                   // returning pointer to structure from function
    // ptr2=fun(5,65);
    // printValue(ptr1);
    // printValue(ptr2);
    // free(ptr1);
    // free(ptr2);

    struct abc arr[2]={ {1,'A'},{2,'B'} };              // array of structures of abc
    printarr(arr);
    
    return 0;
}
