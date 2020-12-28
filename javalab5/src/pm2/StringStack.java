package pm2;

//(실습2) Stack 인터페이스를 구현하는 StringStack 클래스
//1817022 조이린

public class StringStack implements Stack{
	
	protected String[] Stackarr;			//String배열 형태의 스택 설정
	private int top = -1;					//stack의 top은 비어있을 때 -1
	private int stackSize;					//스택의 크기
	
	public StringStack(int stackSize) {		//생성자로 스택 배열 생성
		this.stackSize = stackSize;
		Stackarr = new String[this.stackSize];
	}
	
	//스택이 비어있는지 확인
	public boolean isEmpty() {
		if(top == -1) return true;
		else return false;
	}
	
	//스택이 모두 찼는지 확인
	public boolean isFull() {
		if(top == this.stackSize-1) return true;
		else return false;
	}
	
	//스택에 내용 추가
	public void push(Object item) {
		String data = (String) item;			//String 형태의 스택이므로 다운캐스팅
		if(isFull()) {
			System.out.println("Stack is full!");
		}
		else {									//추가할 내용 보여주고 스택에 추가
			System.out.println("Inserted Item(push) : " + data);
			this.Stackarr[++this.top] = data;	//top 값 증가시키기
		}
	}
	
	//스택의 마지막 데이터 추출, 삭제
	public Object pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty!");
			return 0;
		}
		else {
			System.out.println("Deleted Item(pop) : " + Stackarr[top]);
			return Stackarr[--this.top];		//top 값 감소시키기
		}
	}
	//스택의 마지막 데이터 추출
	public Object peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty!");
			return 0;
		}
		else {
			System.out.println("Peeked Item : " + Stackarr[top]);
			return Stackarr[top];				//마지막 데이터 추출
		}
	}
	
	//스택 초기화
	public void clear() {
		if(isEmpty()) {
			System.out.println("Stack is empty!");
		}
		else {
			top = -1;							//top의 값 초기화
			Stackarr = new String[this.stackSize];	//새로운 스택 만들기
			System.out.println("Stack is clear!");
		}
	}
	
	//스택의 모든 데이터 출력
	public void printStack() {
		if(isEmpty()) {
			System.out.println("Stack is empty!");
		}
		else {
			System.out.print("Stack elements : ");
			for(int i=0;i<=top;i++) {			//반복문을 통해 모든 값 출력
				System.out.print(Stackarr[i] + " ");
			}
			System.out.println();
		}
		
		
	}
	
}