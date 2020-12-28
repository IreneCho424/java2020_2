package dvdhw;

import java.io.*;
import java.util.Scanner;
import java.util.Vector;

//1817022 조이린
/*
* DataFile 클래스 
* 입력 받은 데이터를 파일로 만들어서 저장하도록 하는 클래스
* customers.dat, dvds.dat, rentDvds.dat를 생성하고 읽어온다
*/
public class DataFile {

	//write file
	//고객정보를 저장하는 customers.dat 파일
	public static void writeCustomersData(CustomerDataMgt cData) throws IOException {
		FileOutputStream fo = new FileOutputStream("customers.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fo);
		oos.writeObject(cData);

		fo.close();
		oos.close();
	}

	//Dvd정보를 저장하는 dvds.dat 파일
	public static void writeDvdData(DvdDataMgt dData) throws IOException {
		FileOutputStream fo = new FileOutputStream("dvds.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fo);

		oos.writeObject(dData);

		fo.close();
		oos.close();
	}

	//대여한 Dvd 정보를 저장하는 rentDvds.dat 파일
	public static void writeRentDvdData(RentDvdDataMgt rdData) throws IOException {
		FileOutputStream fo = new FileOutputStream("rentDvds.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fo);

		oos.writeObject(rdData);

		fo.close();
		oos.close();
	}

	//read files
	//customers.dat 파일을 읽어오는 메서드
	public static CustomerDataMgt readCustomersData() throws IOException, ClassNotFoundException {
		FileInputStream fi = new FileInputStream("customers.dat");
		ObjectInputStream ois = new ObjectInputStream(fi);
		
		CustomerDataMgt cust = (CustomerDataMgt) ois.readObject();
		
		ois.close();
		return cust;
	}
	
	//dvds.dat 파일을 읽어오는 메서드
	public static DvdDataMgt readDvdsData() throws IOException, ClassNotFoundException {
		FileInputStream fi = new FileInputStream("dvds.dat");
		ObjectInputStream ois = new ObjectInputStream(fi);
		
		DvdDataMgt dvd = (DvdDataMgt) ois.readObject();
		
		ois.close();
		return dvd;
	}

	//rentDvds.dat 파일을 읽어오는 메서드
	public static RentDvdDataMgt readRentDvdsData() throws IOException, ClassNotFoundException {
		FileInputStream fi = new FileInputStream("rentDvds.dat");
		ObjectInputStream ois = new ObjectInputStream(fi);
		
		RentDvdDataMgt rdvd = (RentDvdDataMgt) ois.readObject();
		
		ois.close();
		return rdvd;
	}
}
