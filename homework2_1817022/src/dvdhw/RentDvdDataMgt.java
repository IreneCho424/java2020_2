package dvdhw;

import java.io.Serializable;
import java.util.Vector;

//1817022 ���̸�
/*
 * RentDvdDataMgt Ŭ����
 * �뿩�� DVD���� ������ �����ϰ� �˻��ϴ� Ŭ����
 */

public class RentDvdDataMgt extends DataMgt<RentDvd> implements Serializable{
	private Vector<RentDvd> collect;
	
	public RentDvdDataMgt() {
		collect = getCollect();
	}
	
	@Override
	public RentDvd selectByName(String name) { //�뿩�� DVD �� �������� �˻�
		for(RentDvd obj : collect) {
			Dvd dvd = obj.getDvd(); 
			if(name.equals(dvd.getTitle())) {
				return obj;
			}
		}
		
		return null;
	}

	@Override
	public RentDvd selectById(String id) {	//�뿩�� DVD �� ISBN���� �˻�
		for(RentDvd obj : collect) {
			Dvd dvd = obj.getDvd(); 
			if(id.equals(dvd.getISBN())) {
				return obj;
			}
		}
		
		return null;
	}
	
}
