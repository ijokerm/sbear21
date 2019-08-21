import java.util.Stack;

public class MyQueue {
    private Stack<Integer>stack1=new Stack<>();
    private Stack<Integer>stack2=new Stack<>();
    public void push(int x){
        stack1.push(x);
    }
    public int pop(){
        //判断stack2是否空
       if( stack2.empty()) {
           while (!stack1.empty()) {
               int t = stack2.pop();
               stack2.push(t);
           }
       }
       //返回删除后的
return stack2.pop();
    }
    public int peek(){
        if( stack2.empty()) {
            while (!stack1.empty()) {
                int t = stack2.pop();
                stack2.push(t);
            }
        }
        //返回
        return stack2.peek();
    }

    public boolean empty(){
return stack1.empty()&&stack2.empty();
    }


}
