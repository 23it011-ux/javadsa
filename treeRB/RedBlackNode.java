package treeRB;

public class RedBlackNode {
 int data;
 RedBlackNode left,right,parent;
 boolean color;
 
 static final boolean RED = true;
 static final boolean BLACK = false;
 
 RedBlackNode(int data){
	 this.data=data;
	 this .color=RED;
	 this.left=null;
	 this.right=null;
	 this.parent=null;
 }
}
