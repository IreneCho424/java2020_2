package pm2;

//(�ǽ�2) Stack �������̽��� �����ϴ� StringStack Ŭ����
//1817022 ���̸�

public class StringStack implements Stack{
	
	protected String[] Stackarr;			//String�迭 ������ ���� ����
	private int top = -1;					//stack�� top�� ������� �� -1
	private int stackSize;					//������ ũ��
	
	public StringStack(int stackSize) {		//�����ڷ� ���� �迭 ����
		this.stackSize = stackSize;
		Stackarr = new String[this.stackSize];
	}
	
	//������ ����ִ��� Ȯ��
	public boolean isEmpty() {
		if(top == -1) return true;
		else return false;
	}
	
	//������ ��� á���� Ȯ��
	public boolean isFull() {
		if(top == this.stackSize-1) return true;
		else return false;
	}
	
	//���ÿ� ���� �߰�
	public void push(Object item) {
		String data = (String) item;			//String ������ �����̹Ƿ� �ٿ�ĳ����
		if(isFull()) {
			System.out.println("Stack is full!");
		}
		else {									//�߰��� ���� �����ְ� ���ÿ� �߰�
			System.out.println("Inserted Item(push) : " + data);
			this.Stackarr[++this.top] = data;	//top �� ������Ű��
		}
	}
	
	//������ ������ ������ ����, ����
	public Object pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty!");
			return 0;
		}
		else {
			System.out.println("Deleted Item(pop) : " + Stackarr[top]);
			return Stackarr[--this.top];		//top �� ���ҽ�Ű��
		}
	}
	//������ ������ ������ ����
	public Object peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty!");
			return 0;
		}
		else {
			System.out.println("Peeked Item : " + Stackarr[top]);
			return Stackarr[top];				//������ ������ ����
		}
	}
	
	//���� �ʱ�ȭ
	public void clear() {
		if(isEmpty()) {
			System.out.println("Stack is empty!");
		}
		else {
			top = -1;							//top�� �� �ʱ�ȭ
			Stackarr = new String[this.stackSize];	//���ο� ���� �����
			System.out.println("Stack is clear!");
		}
	}
	
	//������ ��� ������ ���
	public void printStack() {
		if(isEmpty()) {
			System.out.println("Stack is empty!");
		}
		else {
			System.out.print("Stack elements : ");
			for(int i=0;i<=top;i++) {			//�ݺ����� ���� ��� �� ���
				System.out.print(Stackarr[i] + " ");
			}
			System.out.println();
		}
		
		
	}
	
}