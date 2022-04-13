package queue;

public class QueueUsingArray {

	private int data[];
	private int front;  //index of element at front of queue
	private int rear;  //index of element at rear of queue
    private int size;
    
    public QueueUsingArray() {
    	data=new int [5];
    	front=-1;
    	rear=-1;
    }
    
    public QueueUsingArray(int capacity) {
    	data=new int [capacity];
    	front=-1;
    	rear=-1;
    	size=0;
    }
    
    public int size() {
    	return size;
    }
    
    public boolean isEmpty() {
    	return size==0;
    }
    
    public void enqueue(int elem) {
    	if(front == -1) {
        	front++;
    	}
    	data[size]=elem;
    	size++;
    	rear++;
    }
    
    public int front() throws QueueEmptyException{
    	if(size==0) {
    		throw new QueueEmptyException();
    	}
    	return data[0];
    }
    
    public int dequeue() throws QueueEmptyException {
    	if(size==0) {
    		throw new QueueEmptyException();
    	}
    	if(size==0) {
    		front=-1;
    		rear=-1;
    	}
    	int temp=data[front];
    	front++;
    	size--;
    	return temp;
    }
    
}
