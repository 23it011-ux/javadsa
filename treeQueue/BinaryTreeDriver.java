package treeQueue;

public class BinaryTreeDriver {
    public static void main(String[] args) {
        BinarTree b = new BinarTree();
        b.insert(10);
        b.insert(20);
        b.insert(30);
        b.insert(40);
        b.insert(50);
        b.insert(60);
        b.insert(70);
        b.insert(80);
        b.insert(90);
        b.insert(100);
        b.insert(120);
        b.insert(130);
        b.insert(140);
        b.inOrder();
        b.preOrder();
        b.postOrder();
    }
}