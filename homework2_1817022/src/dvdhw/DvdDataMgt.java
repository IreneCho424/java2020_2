package dvdhw;

import java.util.Vector;

//1817022 조이린
/*
 * DvdDataMgt 클래스
 * Dvd의 정보를 Dvd 타입의 벡터에 저장하기 위한 클래스
 */

public class DvdDataMgt extends DataMgt<Dvd> {
	private Vector<Dvd> collect;
	
	public DvdDataMgt() {
		collect = getCollect();
	}
	

	@Override
	public Dvd selectByName(String name) { //제목으로 Dvd 찾기
	
		for(Dvd obj : collect) {
			if(name.equals(obj.getTitle())) {
				return obj;
			}
		}
		return null;
	}


	@Override
	public Dvd selectById(String id) {	//ISBN으로 Dvd 찾기
		for(Dvd obj : collect) {
			if(id.equals(obj.getISBN())) {
				return obj;
			}
		}
		return null;
	}

}
