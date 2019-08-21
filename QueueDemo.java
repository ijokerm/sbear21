// 利用单链表 头删尾插
public class QueueDemo {
    static class Node {
        int val;
        Node next = null;

        Node(int val) {
            this.val = val;
        }

        private Node front = null;
        private Node rear = null;
        private int size = 0;


        public void push(int v) {
            //尾插；
            if (rear !=null){
                rear=rear.next=new Node(v);
            }
            rear=front=new Node(v);
            size++;
        }
        public int pop(){
            //头删
            size--;
            int key=front.val;
            if(front==null){
                front=rear=null;
            }
            else{
                front=front.next;
            }
            return key;
        }

        public int front(){
            return front.val;
        }
        public int rear(){
            return rear.val;
        }
        public int size(){
            return size;
        }
        public boolean isEmpty(){
            return size==0;
        }
    }
}