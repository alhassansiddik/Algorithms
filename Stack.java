// Implementation of stack using array
public class Stack {
	public String[] stackArray;
	public int size;
	public int first = -1;
	
	public Stack(int size) {
		this.size = size;
		stackArray = new String[size];
	}
	
	public void push(String input) {
		if(first + 1 < size) {
			stackArray[++first] = input;
		} else {
			System.out.println("Stack is full");
		}
	}
	
	public String pop() {
		if(first >= 0) {
			String temp = stackArray[first];
			stackArray[first--] = null;
			return temp;
		} else {
			System.out.println("Stack is empty");
			return null;
		}
	}
	
	public String peek() {
		return stackArray[first];
	}

	public static void main(String[] args) {
		Stack stack = new Stack(2);
		stack.push("5");
		stack.push("2");
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
	}
}
