package func;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class TCPNumBaseballGameServer {
	int[] numS = new int[3];
	int count;
	int strike, ball;
	public void main() {
		//1.��Ʈ��ȣ����
		int port = 5678;
		ServerSocket serverSocket = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		Scanner sc = new Scanner(System.in);
		count=0;
		
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("<<<<<Baseball Game>>>>>");
			System.out.println("Ŭ���̾�Ʈ ���� ��� ��...");
			Socket clientSocket = serverSocket.accept();
			System.out.println("Ŭ���̾�Ʈ ���� �Ϸ�");
			InputStream in = clientSocket.getInputStream();
			OutputStream out = clientSocket.getOutputStream();
			dis = new DataInputStream(in);
			dos = new DataOutputStream(out);
			numS = NumBaseballGameNumber();
			System.out.println("���� ���� : "+numS[0]+numS[1]+numS[2]);
			System.out.println("<<<<< game start >>>>>");
			while(true) {
				int num1 = dis.readInt();
				int num2 = dis.readInt();
				int num3 = dis.readInt();
				System.out.println("Ŭ���̾�Ʈ�� �Է��� �� -> "+num1+num2+num3+"\n");				
				String str = NumBaseballGameLogic(num1, num2, num3);
				dos.writeUTF(str);
				System.out.println(str);
				if(str.equals("���� ��")) {
					break;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				dos.close();
				dis.close();
				serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
	}
	
	String NumBaseballGameLogic(int num1, int num2, int num3) {
		count++;
		int temp[] = {num1, num2, num3};
		strike=0;
		ball=0;
		HashSet<Integer> data = new HashSet<Integer>();
		for(int i=0;i<numS.length;i++) {
			for(int j=0;j<temp.length;j++) {
				if(temp[j]==numS[i]) {
					if(data.add(temp[j])) {
						ball++;
						data.add(temp[j]);
					}
				}
			}
		}
		for(int i=0;i<numS.length;i++) {
			if(temp[i]==numS[i]) {
				ball--;
				strike++;
			}
		}
		if(strike!=3) {
			String stemp = count+"ȸ -----> "+strike+"��Ʈ����ũ"+ball+"��";
			return stemp;
		}else {
			return "���� ��";
		}
	}

	int[] NumBaseballGameNumber() {
		int nums[] = new int[3];
		int first = (int)(Math.random()*9);
		int second = (int)(Math.random()*9);
		int third = (int)(Math.random()*9);
		while(!(second!=first)) {
			second = (int)(Math.random()*9);
		}
		while(!((third!=second)&&(third!=first))) {
			third = (int)(Math.random()*9);
		}
		nums[0]=first;
		nums[1]=second;
		nums[2]=third;
		return nums;
	}
}
