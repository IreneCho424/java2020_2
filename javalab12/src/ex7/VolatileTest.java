package ex7;

class SharedObject {
	public volatile int MY_INT = 0; //volatile이 없을 경우 Got Change for MY_INT 가 나타나지 않음
}

class ChangeListener extends Thread {
	public SharedObject sharedObj;

	public void run() {
		int local_value = sharedObj.MY_INT;

		while (local_value < 5) {
			if (local_value != sharedObj.MY_INT) {
				String s = String.format("Got Change for MY_INT : %d", sharedObj.MY_INT);
				System.out.println(s);
				local_value = sharedObj.MY_INT;
			}
		}
	}
}

class ChangeMaker extends Thread {
	public SharedObject sharedObj;

	public void run() {
		int local_value = sharedObj.MY_INT;

		while (sharedObj.MY_INT < 5) {
			String s = String.format("Incrementing MY_INT to %d", local_value + 1);
			System.out.println(s);
			sharedObj.MY_INT = ++local_value;
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class VolatileTest {

	public static void main(String[] args) {
		ChangeListener listenerObj = new ChangeListener();
		ChangeMaker makerObj = new ChangeMaker();
		SharedObject obj = new SharedObject();
		
		listenerObj.sharedObj = obj;
		makerObj.sharedObj = obj;
		
		listenerObj.start();
		makerObj.start();
	}

}
