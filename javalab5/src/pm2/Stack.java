package pm2;

//(실습2) 스택의 기본적 성질을 가지고 있는 Stack 인터페이스 구현
//1817022 조이린

interface Stack{
	boolean isEmpty();
	boolean isFull();
	void push(Object item);
	Object pop();
	Object peek();
	void clear();
}