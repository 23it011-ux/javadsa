package treeavl;
public class AVlNodeDriver {
	public static void main(String[] args) {
        AVLTree avl = new AVLTree();
        // Insert elements into the AVL tree
        avl.insert(10);
        avl.insert(20);
        avl.insert(30);
        avl.insert(40);
        avl.insert(50);
        avl.insert(25);
        // Perform in-order traversal
        System.out.print("In-order traversal of the AVL tree: ");
        avl.inOrder();
    }
}





