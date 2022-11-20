package Day14_DataStructure;

public class StackMain {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		stack.push(70);
		stack.push(30);
		stack.push(56);
		stack.print();
		
		while (!stack.isEmpty())
		{
			System.out.println(stack.peek());
			stack.pop();
			stack.print();
			System.out.println();
		}

	}

}
