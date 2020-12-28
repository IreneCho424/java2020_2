package ex5;

//(���� 5) ����� ���� ���� Ŭ������
//1817022 ���̸�

class MyException extends Exception{
	public String getMessage() {
		return "Negative Integer!!!";
	}
}

class MyRuntimeException extends RuntimeException{
	//���� �޽����� �ܺο��� �Է� �޾� ���
	public MyRuntimeException(String errmsg) {
		super(errmsg);
	}
}

class ExceptionTest{
	//foo()��� �޼��带 ȣ������ ��
	//MyException ���ܰ� �� �� ������ �̸� ó��(ȣ���� ������ ����)
	public void foo(int n) throws MyException{
		if(n<0) throw new MyException();
		else System.out.println("foo(int) : " + n);
	}
	
	//goo()��� �޼��带 ȣ������ ��
	//MyRuntimeException ���ܰ� �� �� ������ �̸� ó��(ȣ���� ������ ����)
	public void goo(int n) throws MyRuntimeException{
		if(n<0) throw new MyRuntimeException("������ �Ű������� ���� �� ����.");
		else System.out.println("goo(int) : " + n);
	}
}