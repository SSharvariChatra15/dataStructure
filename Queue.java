public class Queue {
    int size=5;
    int front=-1;
    int rear=-1;
    int[] queue=new int[size];
    void enQueue(int n){
        if(front==0 && rear==size-1){
            System.out.println("Queue is full");
        }
        else{
            if(front==-1){
                front=0;
            }
            rear++;
            queue[rear]=n;
            System.out.println(n+" "+"Inserted into Queue");
        }
    }
    void deQueue(){
        if(front==-1 && rear==-1){
            System.out.println("Queue is empty");
        }
        else if(front==rear){
            System.out.println(queue[front]+" "+ "Deleted");
            front=-1;
            rear=-1;
        }
        else{
            System.out.println(queue[front]+" "+ "Deleted");
            front++;
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);
        q.enQueue(40);
        q.enQueue(50);
        q.enQueue(60);
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue();
    }
    
}
