package pm2;

//(실습2) 한영사전 실습 - 단어가 저장되어있는 Dictionary 클래스
//1817022 조이린

public class Dictionary{
	private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
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
			return ("은(는) 저의 사전에 없습니다.");
		}
		else {
			return ("은(는) " + eng[order]);
		}
	}
}