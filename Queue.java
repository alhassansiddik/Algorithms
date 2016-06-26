// Implementation of queue using array
public class Queue {
	public String[] queueArray;
	public int size;
	public int first, last, numItems = 0;
	
	public Queue(int size) {
		this.size = size;
		queueArray = new String[size];
	}
	
	public void insert(String input) {
		if(numItems + 1 <= size) {
			queueArray[last++] = input;
			numItems++;
		} else {
			System.out.println("Queue is full");
		}
	}
	
	// sorts queue from highest to lowest when being inserted
	public void priorityInsert(String input) {
		if(numItems == 0) {
			insert(input);
		} else {
			int i;
			for (i = numItems - 1; i >= 0; i--) {
				if(Integer.parseInt(input) > Integer.parseInt(queueArray[i])) {
					queueArray[i + 1] = queueArray[i];
				} else {
					break;
				}
			}
			queueArray[i + 1] = input;
			last++;
			numItems++;
		}
	}
	
	public void remove() {
		if(numItems > 0) {
			queueArray[first++] = null;
			numItems--;
		} else {
			System.out.println("Queue is empty");
		}
	}
	
	public String peek() {
		return queueArray[first];
	}
	
	public static void main(String[] args) {
		Queue queue = new Queue(2);
		queue.insert("2");
		queue.insert("5");
		System.out.println(queue.peek());
		queue.remove();
		System.out.println(queue.peek());
		
		Queue queue2 = new Queue(4);
		queue2.priorityInsert("3");
		queue2.priorityInsert("6");
		queue2.priorityInsert("2");
		queue2.priorityInsert("5");
		System.out.println(queue2.peek());
		queue2.remove();
		System.out.println(queue2.peek());
	}	
}