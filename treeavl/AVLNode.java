package treeavl;
public class AVLNode {
int key;
int height;
AVLNode left,right;

AVLNode(int key){
	this.key=key;
	this.height=1;//initial height of node is 1
  }
}
