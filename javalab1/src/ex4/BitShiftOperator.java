package ex4;

//(����4) ��Ʈ �����ڿ� ����Ʈ ������
//1817022 ���̸�

public class BitShiftOperator {
	public static void main(String[] args) {
		short a = (short)0x55ff;
		short b = 0x00ff;
		
		//��Ʈ ����
		//printf("%x\n")�� ��� ���� 16���� �������� ����Ѵ�
		System.out.printf("%x\n", a & b);
		System.out.printf("%x\n", a | b);
		System.out.printf("%x\n", a ^ b);
		System.out.printf("%x\n", ~a);
		byte c = 20; 	//0x14
		byte d = -8; 	//0xf8
		
		//����Ʈ ����
		System.out.println(c << 2); 	//c�� 2��Ʈ ���� ����Ʈ
		System.out.println(c >> 2); 	//c�� 2��Ʈ ������ ����Ʈ. 0 ����
		System.out.println(d >> 2); 	//d�� 2��Ʈ ������ ����Ʈ. 1 ����
		System.out.printf("%x\n", d >>> 2); //d�� 2��Ʈ ������ ����Ʈ. 0 ����
		
	}
}