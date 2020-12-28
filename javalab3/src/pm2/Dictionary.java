package pm2;

//(�ǽ�2) �ѿ����� �ǽ� - �ܾ ����Ǿ��ִ� Dictionary Ŭ����
//1817022 ���̸�

public class Dictionary{
	private static String[] kor = {"���", "�Ʊ�", "��", "�̷�", "���"};
	private static String[] eng = {"love", "baby", "money", "future", "hope"}; 
	private final static int WORDCOUNT = kor.length;
	
	public static String korToEngWord(String korword) {
		int order = -1;
		for(int i=0;i<WORDCOUNT;i++) {
			if(kor[i].contentEquals(korword)) {
				order = i;
			}
		}
		if(order == -1) {
			return ("��(��) ���� ������ �����ϴ�.");
		}
		else {
			return ("��(��) " + eng[order]);
		}
	}
}