package pm2;

//(실습2) 스택의 성질 활용하는 프로그램
//1817022 조이린

public class StackDemo{
	
	public static void main(String[] args) {
		int stackSize = 5;
		StringStack arrStack = new StringStack(stackSize);
		
		arrStack.push("Ewha");
		arrStack.printStack();
		System.out.println();
		
		arrStack.push("Womans");
		arrStack.printStack();
		System.out.println();
		
		arrStack.push("University");
		arrStack.printStack();
		System.out.println();
		
		arrStack.pop();
		arrStack.printStack();
		System.out.println();
		
		arrStack.pop();
		arrStack.printStack();
		System.out.println();
		
		arrStack.peek();
		arrStack.printStack();
		System.out.println();
		
		arrStack.clear();
		arrStack.printStack();
	}
}