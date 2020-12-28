package dvdhw;

import java.io.Serializable;
import java.util.Vector;

//1817022 조이린
/*
 * RentDvdDataMgt 클래스
 * 대여한 DVD들의 정보를 저장하고 검색하는 클래스
 */

public class RentDvdDataMgt extends DataMgt<RentDvd> implements Serializable{
	private Vector<RentDvd> collect;
	
	public RentDvdDataMgt() {
		collect = getCollect();
	}
	
	@Override
	public RentDvd selectByName(String name) { //대여한 DVD 중 제목으로 검색
		for(RentDvd obj : collect) {
			Dvd dvd = obj.getDvd(); 
			if(name.equals(dvd.getTitle())) {
				return obj;
			}
		}
		
		return null;
	}

	@Override
	public RentDvd selectById(String id) {	//대여한 DVD 중 ISBN으로 검색
		for(RentDvd obj : collect) {
			Dvd dvd = obj.getDvd(); 
			if(id.equals(dvd.getISBN())) {
				return obj;
			}
		}
		
		return null;
	}
	
}
