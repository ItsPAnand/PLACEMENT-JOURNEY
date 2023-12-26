#include <stdio.h>
#include <stdlib.h>

struct node
{
    float coeff;
    int expo;
    struct node *next;
};
// create pol
// insert pol

struct node *insert(struct node *start, float coeff, int expo)
{
    struct node *temp;
    struct node *newp = malloc(sizeof(struct node));
    newp->coeff = coeff;
    newp->expo = expo;
    newp->next = NULL;

    if (start == NULL || expo > start->expo)
    {
        newp->next = start;
        start = newp;
    }
    else
    {

        temp = start;
        while (temp->next != NULL && temp->next->expo >= expo)
        {
            temp = temp->next;
        }
        newp->next = temp->next;
        temp->next = newp;
    }

    return start;
}

struct node *create(struct node *start)
{
    int expo, n, i;
    float coff;

    printf("Enter the numebr of terms.\n");
    scanf("%d", &n);
    for (i = 0; i < n; i++)
    {
        printf("enter the coeff number %d.\n", i + 1);
        scanf("%f", &coff);
        printf("enter the expo number %d.\n", i + 1);
        scanf("%d", &expo);
        start = insert(start, coff, expo);
    }
    return start;
}

void printpoly(struct node *start)
{

    if (start == NULL)
    {
        printf("There is no polynomial!.\n");
    }
    else
    {
        struct node *temp = start;
        while (temp != NULL)
        {
            printf("(%.1fx^%d)", temp->coeff, temp->expo);
            temp = temp->next;
            if (temp != NULL)
            {
                printf("+");
            }
            else{
                printf("\n");}
        }
    }
}

void polyAdd(struct node *start1, struct node *start2)
{
    struct node* p1 = start1;
    struct node* p2 = start2;
    struct node* start3 = NULL;

    while (p1 != NULL && p2 != NULL)
    {
        if (p1->expo == p2->expo)
        {
            start3 =insert(start3, p1->coeff + p2->coeff, p1->expo);
            p1 = p1->next;
            p2 = p2->next;
        }
        else if (p1->expo > p2->expo)
        {
            start3 =insert(start3, p1->coeff, p1->expo);
            p1 = p1->next;
        }
        else if (p1->expo < p2->expo)
        {
            start3 =insert(start3, p2->coeff, p2->expo);
            p2 = p2->next;
        }
    }

    while (p1 != NULL)
    {
        start3 =insert(start3, p1->coeff, p1->expo);
        p1 = p1->next;
    }
    while (p2 != NULL)
    {
        start3 =insert(start3, p2->coeff, p2->expo);
        p2 = p2->next;
    }

    printf("added polynomial is\n");
    printpoly(start3);
}



int main()

{

    struct node *start1 = NULL;
    struct node *start2 = NULL;
    printf("Enter the First polynomial.\n");
    start1 = create(start1);
    printf("Enter the second polynomial.\n");
    start2 = create(start2);
    polyAdd(start1, start2);
    return 0 ;
}