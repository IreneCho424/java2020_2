package dvdhw;

import java.io.*;
import java.util.Scanner;
import java.util.Vector;

//1817022 ���̸�
/*
* DataFile Ŭ���� 
* �Է� ���� �����͸� ���Ϸ� ���� �����ϵ��� �ϴ� Ŭ����
* customers.dat, dvds.dat, rentDvds.dat�� �����ϰ� �о�´�
*/
public class DataFile {

	//write file
	//�������� �����ϴ� customers.dat ����
	public static void writeCustomersData(CustomerDataMgt cData) throws IOException {
		FileOutputStream fo = new FileOutputStream("customers.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fo);
		oos.writeObject(cData);

		fo.close();
		oos.close();
	}

	//Dvd������ �����ϴ� dvds.dat ����
	public static void writeDvdData(DvdDataMgt dData) throws IOException {
		FileOutputStream fo = new FileOutputStream("dvds.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fo);

		oos.writeObject(dData);

		fo.close();
		oos.close();
	}

	//�뿩�� Dvd ������ �����ϴ� rentDvds.dat ����
	public static void writeRentDvdData(RentDvdDataMgt rdData) throws IOException {
		FileOutputStream fo = new FileOutputStream("rentDvds.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fo);

		oos.writeObject(rdData);

		fo.close();
		oos.close();
	}

	//read files
	//customers.dat ������ �о���� �޼���
	public static CustomerDataMgt readCustomersData() throws IOException, ClassNotFoundException {
		FileInputStream fi = new FileInputStream("customers.dat");
		ObjectInputStream ois = new ObjectInputStream(fi);
		
		CustomerDataMgt cust = (CustomerDataMgt) ois.readObject();
		
		ois.close();
		return cust;
	}
	
	//dvds.dat ������ �о���� �޼���
	public static DvdDataMgt readDvdsData() throws IOException, ClassNotFoundException {
		FileInputStream fi = new FileInputStream("dvds.dat");
		ObjectInputStream ois = new ObjectInputStream(fi);
		
		DvdDataMgt dvd = (DvdDataMgt) ois.readObject();
		
		ois.close();
		return dvd;
	}

	//rentDvds.dat ������ �о���� �޼���
	public static RentDvdDataMgt readRentDvdsData() throws IOException, ClassNotFoundException {
		FileInputStream fi = new FileInputStream("rentDvds.dat");
		ObjectInputStream ois = new ObjectInputStream(fi);
		
		RentDvdDataMgt rdvd = (RentDvdDataMgt) ois.readObject();
		
		ois.close();
		return rdvd;
	}
}
