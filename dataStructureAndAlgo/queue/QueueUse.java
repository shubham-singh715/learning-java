package queue;

public class QueueUse {


	public static void main(String[] args) {
		
//	  QueueUsingArray queue = new QueueUsingArray();
//	  int arr[]= {1,2,3,4,5};
//	  
//	  for(int elem : arr) {
//		  queue.enqueue(elem);
//	  }
//	  
//	  while(!queue.isEmpty()) {
//		  try {
//			System.out.println(queue.dequeue());
//		} catch (QueueEmptyException e) {
//			
//		}
//	  }
//	  
	  
	  
	  
	  
	  
	  
	  
	  QueueUsingStack<Integer> qstack= new QueueUsingStack<>();
	  qstack.enqueue(10);
	  qstack.enqueue(20);
	  qstack.enqueue(30);
	  qstack.enqueue(40);
	  

	  System.out.println(qstack.dequeue());
	  System.out.println(qstack.dequeue());
	}

}
