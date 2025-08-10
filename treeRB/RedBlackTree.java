package treeRB;

public class RedBlackTree {

		private RedBlackNode root;

		private void rotateLeft(RedBlackNode node) {

		RedBlackNode rightChild = node.right;

		node.right = rightChild.left;

		if (rightChild.left != null) {

		rightChild.left.parent = node;

		}

		rightChild.parent = node.parent;

		if (node.parent == null) {

		root = rightChild;

		} else if (node == node.parent.left) {

		node.parent.left = rightChild;

		} else {

		node.parent.right = rightChild;

		}

		rightChild.left = node;

		node.parent = rightChild;

		}

		private void rotateRight(RedBlackNode node) {

		RedBlackNode leftChild = node.left;

		node.left = leftChild.right;

		if (leftChild.right != null) {

		leftChild.right.parent = node;

		}

		leftChild.parent = node.parent;

		if (node.parent == null) {

		root = leftChild;

		} else if (node == node.parent.right) {

		node.parent.right = leftChild;

		} else {

		node.parent.left = leftChild;

		}

		leftChild.right = node;

		node.parent = leftChild;

		}

		private void fixInsert(RedBlackNode node) {

		while (node.parent != null && node.parent.color == RedBlackNode.RED) {

		if (node.parent == node.parent.parent.left) {

		RedBlackNode uncle = node.parent.parent.right;

		if (uncle != null && uncle.color == RedBlackNode.RED) {

		node.parent.color = RedBlackNode.BLACK;

		uncle.color = RedBlackNode.BLACK;

		node.parent.parent.color = RedBlackNode.RED;

		node = node.parent.parent;

		} else {

		if (node == node.parent.right) {

		node = node.parent;

		rotateLeft(node);

		}

		node.parent.color = RedBlackNode.BLACK;

		node.parent.parent.color = RedBlackNode.RED;

		rotateRight(node.parent.parent);

		}

		} else {

		RedBlackNode uncle = node.parent.parent.left;

		if (uncle != null && uncle.color == RedBlackNode.RED) {

		node.parent.color = RedBlackNode.BLACK;

		uncle.color = RedBlackNode.BLACK;

		node.parent.parent.color = RedBlackNode.RED;

		node = node.parent.parent;

		} else {

		if (node == node.parent.left) {

		node = node.parent;

		rotateRight(node);

		}

		node.parent.color = RedBlackNode.BLACK;

		node.parent.parent.color = RedBlackNode.RED;

		rotateLeft(node.parent.parent);

		}

		}

		}

		root.color = RedBlackNode.BLACK;

		}

		public void insert(int data) {

		RedBlackNode newNode = new RedBlackNode(data);

		if (root == null) {

		root = newNode;

		root.color = RedBlackNode.BLACK;

		return;

		}

		RedBlackNode parent = null, temp = root;

		while (temp != null) {

		parent = temp;

		if (data < temp.data) {

		temp = temp.left;

		} else {

		temp = temp.right;

		}

		}

		newNode.parent = parent;

		if (data < parent.data) {

		parent.left = newNode;

		} else {

		parent.right = newNode;

		}

		fixInsert(newNode);

		}

		private void inOrderTraversal(RedBlackNode node) {

		if (node != null) {

		inOrderTraversal(node.left);

		System.out.print(node.data + (node.color == RedBlackNode.RED ? "(R) " : "(B) "));

		inOrderTraversal(node.right);

		}

		}

		public void inOrder() {

		inOrderTraversal(root);

		System.out.println();

		}

		}



