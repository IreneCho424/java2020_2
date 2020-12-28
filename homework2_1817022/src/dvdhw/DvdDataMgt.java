package dvdhw;

import java.util.Vector;

//1817022 ���̸�
/*
 * DvdDataMgt Ŭ����
 * Dvd�� ������ Dvd Ÿ���� ���Ϳ� �����ϱ� ���� Ŭ����
 */

public class DvdDataMgt extends DataMgt<Dvd> {
	private Vector<Dvd> collect;
	
	public DvdDataMgt() {
		collect = getCollect();
	}
	

	@Override
	public Dvd selectByName(String name) { //�������� Dvd ã��
	
		for(Dvd obj : collect) {
			if(name.equals(obj.getTitle())) {
				return obj;
			}
		}
		return null;
	}


	@Override
	public Dvd selectById(String id) {	//ISBN���� Dvd ã��
		for(Dvd obj : collect) {
			if(id.equals(obj.getISBN())) {
				return obj;
			}
		}
		return null;
	}

}
