package tree;

class BST {
    NodeTree root;
    public void insert(int key) {
    root = insert(root, key);
    }
    public NodeTree insert(NodeTree root, int key) {
        if (root == null) {
            return new NodeTree(key);
        }
        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        }
        return root;
    }
    public void delete(int key) {
    root = delete(root, key);
    }
    public NodeTree delete(NodeTree root, int key) {
        if (root == null) {
           return root;
        }
        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
            if (root.left == null)
            return root.right;
            else if (root.right == null)
            return root.left;
            root.data = minValue(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }
    private int minValue(NodeTree root) {
        int minVal = root.data;
        while (root.left != null) {
            root = root.left;
        }
        minVal = root.data;
        return minVal;
    }
    public boolean search(int key) {
    return search(root, key);
    }
    public boolean search(NodeTree root, int key) {
        if (root == null)
        return false;
        if (root.data == key)
        return true;
        if (key < root.data) {
        return search(root.left, key);
        }
        return search(root.right, key);
    }
    public int height() {
    return height(root);
    }
    public int height(NodeTree node) {
        if (node == null)
        return -1;
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return Math.max(leftHeight, rightHeight) + 1;

    }
    public void inOrder(NodeTree root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    public void inOrder() {
        System.out.print("In-order: ");
        inOrder(root);
        System.out.println();
    }
    public void preOrder(NodeTree root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public void preOrder() {
        System.out.print("Pre-order: ");
        preOrder(root);
        System.out.println();
    }
    public void postOrder(NodeTree root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }
    public void postOrder() {
        System.out.print("Post-order: ");
        postOrder(root);
        System.out.println();
    }
}