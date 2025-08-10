package treeQueue;


class CircularQ {
    TreeNode arr[];
    int capacity, front, rear, size;

    CircularQ(int capacity) {
        arr = new TreeNode[capacity];
        this.capacity = capacity;
        front = size = 0;
        rear = -1;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == capacity;
    }

    void enQueue(TreeNode ob) {
        if (isFull()) {
            System.out.println("OverFlow");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = ob;
        size++;
    }

    TreeNode Dequeue() {
        if (isEmpty()) {
            return null;
        }
        TreeNode ob = arr[front];
        front = (front + 1) % capacity;
        size--;
        return ob;
    }
}
