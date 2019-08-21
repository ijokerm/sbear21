import java.util.LinkedList;
import java.util.Queue;
//利用队列表示栈
public class MyStack {
    Queue<Integer>queue=new LinkedList<>();
    public void push(int x) {
        queue.add(x);
    }
    //删除头部元素
    public int pop(int a){
    int size=queue.size();
    for(int i=0;i<size-1;i++){
    int t=queue.poll();
    queue.add(t);
//poll即删除队列的头 若为空 返回null
    }
    return queue.poll();
    }
    public int top(){
        int size=queue.size();
        for(int i=0;i<size-1;i++){
            int t=queue.poll();
            queue.add(t);
        }
        int v=queue.poll();

       return v;
    }
    public boolean empty(){
queue.isEmpty();
return false;
    }

}
