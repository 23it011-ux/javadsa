package treeQueue;

public class BinarTree {
    TreeNode root = null;
    static final int NODE_COUNT = 100;

    void insert(int data) {
        TreeNode newNode = new TreeNode(data);
        if (root == null) {
            root = newNode;
            return;
        }
        CircularQ q = new CircularQ(NODE_COUNT);
        q.enQueue(root);
        while (!q.isEmpty()) {
            TreeNode current = q.Dequeue();
            if (current.left == null) {
                current.left = newNode;
                return;
            } else {
                q.enQueue(current.left);
            }
            if (current.right == null) {
                current.right = newNode;
                return;
            } else {
                q.enQueue(current.right);
            }
        }
    }

    void delete(int key) {
        if (root == null) {
            System.out.println("Empty Tree");
            return;
        }

        TreeNode keyNode = null, current = null, temp = null;
        CircularQ q = new CircularQ(NODE_COUNT);
        q.enQueue(root);

        while (!q.isEmpty()) {
            current = q.Dequeue();

            if (current.data == key) {
                keyNode = current;
            }

            if (current.left != null) {
                q.enQueue(current.left);
                temp = current;
            }

            if (current.right != null) {
                q.enQueue(current.right);
                temp = current;
            }
        }

        if (keyNode == null) {
            System.out.println("Value not in the tree");
            return;
        }

        // Replace keyNode data with deepest node data
        int x = current.data;
        deleteDeepest(root, current);
        keyNode.data = x;
    }

    void deleteDeepest(TreeNode root, TreeNode delNode) {
        CircularQ q = new CircularQ(NODE_COUNT);
        q.enQueue(root);

        while (!q.isEmpty()) {
            TreeNode current = q.Dequeue();

            if (current == delNode) {
                current = null;
                return;
            }

            if (current.right != null) {
                if (current.right == delNode) {
                    current.right = null;
                    return;
                } else {
                    q.enQueue(current.right);
                }
            }

            if (current.left != null) {
                if (current.left == delNode) {
                    current.left = null;
                    return;
                } else {
                    q.enQueue(current.left);
                }
            }
        }
    }

    // In-order Traversal
    public void inOrder(TreeNode root) {
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

    // Pre-order Traversal
    public void preOrder(TreeNode root) {
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

    // Post-order Traversal
    public void postOrder(TreeNode root) {
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