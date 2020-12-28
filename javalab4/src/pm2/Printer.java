package pm2;

//(실습2) Printer 클래스
//1817022 조이린

public class Printer{		//protected를 사용하여 getter와 setter는 필요 없지만 외부 패키지에서는 접근 불가능
	protected String modelName;
	protected String maker;
	protected String interf;			//interface 
	protected int printPaper;
	protected int leftPaper;
	
	
	public Printer(String modelName, String maker, String interf, int printP) {
		this.modelName = modelName;
		this.maker = maker;
		this.interf = interf;
		this.printPaper = printP;
	}
	
	

	//오버라이딩
	public void print() {
	}
}