package interview.array;

public class StackDemo 
{	
	private int arr[];
	private int top;
	private static int capacity;
	
	StackDemo(int size)
	{
		arr = new int[size];
		capacity = size; 
		top = -1;
	}
	
	public void push(int x) {
		if(isFull()) {
			System.out.println("Overflow\nProgram Terminated");
			System.exit(1);
		}
		System.out.println("Inserting "+x);
		top++;
		arr[top] = x;
	}
	
	public int pop()
	{
		if(isEmpty()) {
			System.out.println("Underflow\nProgram Terminated");
			System.exit(1);
		}
		System.out.println("Removing "+arr[top]);
		int returnValue = arr[top];
		top--;
		return returnValue;	
	}
	
	public int size() 
	{
		return top+1;
	}
	
	public Boolean isEmpty() {
		return top == -1;
	}
	
	public Boolean isFull() {
		return top == capacity-1;
	}
	
	public static void main(String[] args) {
		StackDemo stack = new StackDemo(3);
		
		System.out.println("The stack capacity is "+String.valueOf(capacity));
		stack.push(1);
		stack.push(2);		
		stack.push(3);	
		stack.push(4);
		
		System.out.println("The stack size is "+stack.size());
		stack.pop();
		stack.pop();
		stack.pop();
		
		System.out.println("The stack size is "+stack.size());
		stack.pop();
	}
}
