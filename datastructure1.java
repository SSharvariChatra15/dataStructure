package datastructure;
public class datastructure1 {
    int[] stack;
    int capacity;
    int top;
    datastructure1(int size){
        stack=new int[size];
        capacity=size;
        top=-1;
    }
    void push(int x){
        if(top==capacity-1){
            System.out.println("overflow state");
        }
        else{
            top=top+1;
            stack[top]=x;
            System.out.println(x+"Succesfully pushed");
        }
    }
    boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else{
            return false;
        }
    }
    void pop(){
        if(isEmpty()){
            System.out.println("underflow stack");
        }
        else{
            System.out.println(stack[top]+"is popped");
            top=top-1;
        }
    }
    public static void main(String[] args) {
        Datastructure d=new Datastructure(3);
        d.push(10);
        d.push(20);
        d.push(30);
        System.out.println(d.isEmpty());
        d.pop();
        d.pop();
    }
    
}
