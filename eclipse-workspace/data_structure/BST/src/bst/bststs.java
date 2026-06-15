package bst;

public class bststs {
	
static class node{
	
	int data;
	node right;
	node left;
	
	node(int data){
		this.data=data;
	}
	
	public static boolean insert(node root,int key) {
		
		
		if(root==null) {
			root.left = insert(root.left, data);
		}
		
		if(data < root.data) {
			return true;
			
		}
		
		if(root.data>key) {
			
		return	insert(root.left,key);
		}
		
		else{
			return insert(root.right,key);
		}
	}
	
}	
	
public static void main(String[] args) {

    // Creating BST
    node root = new node(8);

    root.left = new node(5);
    root.right = new node(10);

    root.left.left = new node(3);
    root.left.right = new node(6);

    root.right.right = new node(11);

    int key1 = 6;
    int key2 = 20;

    System.out.println("Search " + key1 + " : "
            + node.insert(root, key1));

    System.out.println("Search " + key2 + " : "
            + node.insert(root, key2));
}

}
