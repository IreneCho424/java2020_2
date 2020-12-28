package pm1;

//(실습1) 도형에 관한 Geometry 인터페이스
//1817022 조이린

interface Geometry{
	double PI = 3.14159;		//원의 면적과 둘레 구할 때 필요한 상수 값 -- public static final 생략 가능
	public double area();		//도형의 면적을 구하는 방법이 도형마다 다르므로 구현을 강요
	public double perimeter();	//도형의 둘레를 구하는 방법이 도형마다 다르므로 구현을 강요
}