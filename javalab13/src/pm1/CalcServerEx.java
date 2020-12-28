package pm1;

import java.io.*;
import java.net.*;
import java.util.*;

//(실습1) 수식 계산 서버 클래스
//1817022 조이린

public class CalcServerEx {
	public static String calc(String exp) { //입력받은 문자열을 수식으로 바꿔서 결과를 계산하는 함수
		StringTokenizer st = new StringTokenizer(exp, " ");
		if (st.countTokens() != 3)
			return "error";
		String res = "";
		int op1 = Integer.parseInt(st.nextToken());
		String opcode = st.nextToken();
		int op2 = Integer.parseInt(st.nextToken());
		switch (opcode) {
		case "+":
			res = Integer.toString(op1 + op2);
			break;
		case "-":
			res = Integer.toString(op1 - op2);
			break;
		case "*":
			res = Integer.toString(op1 * op2);
			break;
		default:
			res = "error";
		}
		return res;
	}

	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;

		try {
			listener = new ServerSocket(9999); // 서버 소켓 생성
			System.out.println("연결을 기다리고 있습니다....");
			socket = listener.accept();
			System.out.println("연결되었습니다.");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while (true) {
				String inputMessage = in.readLine(); // 클라이언트로부터 한 행 읽기
				if (inputMessage.equalsIgnoreCase("bye")) {
					System.out.println("클라이언트에서 bye로 연결을 종료하였음.");
					break; // "bye"를 받으면 연결 종료
				}
				System.out.println(inputMessage); // 받은 메시지를 화면에 출력
				
				String outputMessage = calc(inputMessage);
				out.write(outputMessage + "\n"); // 키보드에서 읽은 문자열 전송
				out.flush();
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (socket != null)
					socket.close();
				if (listener != null)
					listener.close();
			} catch (IOException e) {
				System.out.println("클라이언트와 채팅 중 오류가 발생했습니다.");
			}
		}
	}
}
