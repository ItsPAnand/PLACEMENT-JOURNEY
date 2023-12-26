#include<stdio.h>
#include<stdlib.h>


struct node{
    int data;
    struct node* left;
    struct node* right;
};

//creating a tree function
struct node* createTree(){
    int data,input;
    printf("Do you want to add Node (1 for yes and 0 for No)\n");
    scanf("%d",&input);
    if(!input)
        return NULL;
    else{
        struct node* newnode=(struct node*)malloc(sizeof(struct node));
        printf("Enter the data\n");
        scanf("%d",&data);
        newnode->data=data;
        printf("Enter the left child of %d\n",data);
        newnode->left=createTree();
        printf("Enter the Right child of %d\n",data);
        newnode->right=createTree();
        return newnode;
    }
}

int height(struct node *node)
{
    if (node ==NULL)
    {
        return 0;
    }
    else
    {
        int left_height = height(node->left);
        int right_height = height(node->right);
            if (left_height > right_height){
                return left_height + 1;
            }
            else
            {
                return right_height + 1;
            }
        
    }
}

int countnode(struct node* root){
    if(root==NULL)
        return 0;
    else{
        int count=1;
        count+=countnode(root->right);
        count+=countnode(root->left);
        return count;
    }
}

int main(){
    struct node* root=createTree();
    printf("%d\n",root->data);
    printf("%d\n",root->left->data);
    printf("%d\n",root->left->left->data);
    printf("%d\n",root->left->right->data);
    printf("%d\n",root->right->data);
    printf("count is %d",countnode(root));
}