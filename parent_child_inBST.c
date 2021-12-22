#include <stdio.h>
#include <stdlib.h>

struct node {
	int key;
	struct node *left, *right;
};

// A utility function to create a new BST node
struct node* newNode(int item)
{
	struct node* temp
		= (struct node*)malloc(sizeof(struct node));
	temp->key = item;
	temp->left = temp->right = NULL;
	return temp;
}

// A utility function to do inorder traversal of BST
void inorder(struct node* root)
{
	if (root != NULL) {
		inorder(root->left);
		printf("%d \n", root->key);
		inorder(root->right);
	}
}

/* A utility function to insert
a new node with given key in
* BST */
struct node* insert(struct node* node, int key)
{
	/* If the tree is empty, return a new node */
	if (node == NULL)
		return newNode(key);

	/* Otherwise, recur down the tree */
	if (key < node->key)
		node->left = insert(node->left, key);
	else if (key > node->key)
		node->right = insert(node->right, key);

	/* return the (unchanged) node pointer */
	return node;
}

struct node* func2( struct node* root, int key ){
    
    if( root-> left-> key == key || root-> right-> key == key ){
        return root ;
    }
    
    if( key < root-> key ){
        //  SEarch left
        // printf( "\nroot-> key: %d < key: %d\n", root-> key, key ) ;
        return func2( root-> left, key ) ;
    }
    
    // printf( "\nroot-> key: %d < key: %d\n", root-> key, key ) ;
    //  else SEarch right
    return func2( root-> right, key ) ;
}

struct node* func1( struct node* root, int key, struct node** parent ){
    
    struct node* child = NULL ;
    
    //  func2 returns a pointer to parent node
    *parent = func2( root, key ) ;
    
    //  Either child node is on left or right
    
    if( (*parent)-> left-> key == key ){
        
        child = (*parent)-> left ;
    }
    else{
        
        child = (*parent)-> right ;
    }
    
    return child ;
}

// Driver Code
int main()
{
	/* Let us create following BST
			    50
    		/	   \
    	 30	   70
    	/ \    / \
     20 40  60 80 */
	struct node* root = NULL;
	root = insert(root, 50);
	insert(root, 30);
	insert(root, 20);
	insert(root, 40);
	insert(root, 70);
	insert(root, 60);
	insert(root, 80);

    struct node* parent = NULL ;
    struct node* child = func1( root, 40, &parent ) ;

    printf( "\nparent: %d\n", parent-> key ) ;
    printf( "\nchild: %d\n", child-> key ) ;

	// print inoder traversal of the BST
	inorder(root);

	return 0;
}
