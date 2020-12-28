package pm2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

//(�ǽ�2) �ֿϰ� ���� ���α׷�
//1817022 ���̸�

public class PetMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input File name to write Dog data");
		String fileName = sc.next();

		//��ü 10�� ���� �� �迭�� �Է�
		Dog[] myDog = new Dog[10];
		myDog[0] = new Dog("Merry", 3, 2.5, "Bulldog", false);
		myDog[1] = new Dog("JJong", 5, 5.5, "Mix", false);
		myDog[2] = new Dog("Kong", 4, 3, "Poodle", true);
		myDog[3] = new Dog("Apple", 2, 2.5, "Collie", true);
		myDog[4] = new Dog("Candy", 5, 5.5, "Coca", false);
		myDog[5] = new Dog("Cutie", 7, 2.5, "Chiwawa", true);
		myDog[6] = new Dog("Peace", 3, 2.5, "Huskey", false);
		myDog[7] = new Dog("Lion", 9, 1.5, "Shepard", true);
		myDog[8] = new Dog("Windy", 2, 9, "Jindo", true);
		myDog[9] = new Dog("Sweetie", 1, 2.5, "Maltiz", false);

		//���Ͽ� �����ϱ�
		FileOutputStream fileos;
		try {
			fileos = new FileOutputStream(fileName);
			ObjectOutputStream objectos = new ObjectOutputStream(fileos);
			objectos.writeObject(myDog);
			objectos.close();
			sc.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// ���Ϸκ��� �б�
		try {
			FileInputStream fileis = new FileInputStream(fileName);
			ObjectInputStream objectis = new ObjectInputStream(fileis);

			System.out.println("Name \tAge \tWeight \tBreed \t\tBoosterShot");
			Dog[] dogs = (Dog[]) objectis.readObject();

			for (int i = 0; i < dogs.length; i++) {
				System.out.println(dogs[i].toString());
			}
			
			System.out.println();
			System.out.println("Dogs older than 2 years and did not get the boosterShot.");
			for (int i = 0; i < dogs.length; i++) {
				if (dogs[i].getAge() > 2 && dogs[i].getBoosterShot() == false) {
					System.out.println(dogs[i].getName() + "\t\t" + dogs[i].getBreed());
				}
			}

			objectis.close();

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
