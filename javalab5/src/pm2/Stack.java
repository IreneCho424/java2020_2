package pm2;

//(�ǽ�2) ������ �⺻�� ������ ������ �ִ� Stack �������̽� ����
//1817022 ���̸�

interface Stack{
	boolean isEmpty();
	boolean isFull();
	void push(Object item);
	Object pop();
	Object peek();
	void clear();
}