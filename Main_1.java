
public class Main_1 {
    public static void testStack(StackDemo stack){
        stack.push(2);
        stack.push(3);
        stack.push(3);
        stack.push(3);
        stack.push(3);
        stack.push(4);
        stack.search(3);
        System.out.println(stack);

    }
    public static void  tetQueue(QueueDemo.Node queue){
        queue.push(2);
        queue.push(2);
    }
    public static void main(String[] args) {
        StackDemo tmp=new StackDemo();
        testStack(tmp);
        QueueDemo tmp1=new QueueDemo();
        tetQueue(tmp1);
    }
}
