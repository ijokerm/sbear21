//栈 一般用数组或者链表实现 示例数组 特点：先进后出
public class StackDemo {
    private int[]array={};
    private int size=0;
    private int top=0;
//top既是栈顶 也记录长度
    public  void ensure(){
        if(size<array.length){
            return ;
        }
        size=size+(2*array.length);
    }
    public  int push(int x) {
//即在栈顶中插入
    ensure();

    array[top]=x;
    top++;
    return x;
    }
    public int pop(){
        //删除此堆栈顶部的对象，并将该对象作为此函数的值返回。在数组中直接删除
        top--;
        return array[top];
    }
    public int peek(){
        return array[top];
    }
    public boolean isEmpty(){
return top==0;
    }
    public int search(int key){
        //利用遍历进行查找
        for(int i=0;i<size;i++){
            if(array[i]==key){
                //查找的该元素的位置
                return i;
            }
        }
        return -1;
    }

}
