package func;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//¥���ڵ�
public class WordConnectGame {
	Scanner sc;
	ArrayList<String> words;
	BufferedReader br = null;
	
	//���� ����
	int w, l;
	//�߸������������� ��
	int count;
	//����üũ
	boolean btemp = true;
	//ù���ڿ� ������ ����
	char ch=' ', ch1;
	public WordConnectGame() {
		super();
		// TODO Auto-generated constructor stub
		sc = new Scanner(System.in);
		words = new ArrayList<String>();
		FileReader fr;
		try {
			fr = new FileReader("word.txt");
			br = new BufferedReader(fr);
			while(true) {
				String line = br.readLine();
				//������ �� �о�����
				if(line == null) {
					break;
				}
				words.add(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void main() {
		while(true) {
			System.out.println("\n----- �����ձ� -----\n");
			System.out.println("1.���� ����");
			System.out.println("2.���� Ȯ��");
			System.out.println("3.���α׷� ����");
			System.out.print("���� > ");
			int sel = sc.nextInt();
			switch(sel) {
			case 1:
				wordGameChoose();
				break;
			case 2:
				System.out.printf("�¸� : %d��\n�й� : %d��\n", w, l);
				break;
			case 3:
				System.out.println("�ý��� ����");
				return;
			default:
				System.out.println("1~3 ���� ���� �Է�");
				break;
			}
		}
	}

	private void wordGameChoose() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("\n--- ����/�İ� ���� ---\n");
			System.out.println("1.����");
			System.out.println("2.�İ�");
			System.out.print("���� > ");
			int sel = sc.nextInt();
			switch(sel) {
			case 1:
				wordGame(0);
				break;
			case 2:
				wordGame(1);
				break;
			default:
				System.out.println("1~2 ���� ���� �Է�. ���θ޴��� ���ư�");
				return;
			}
		}
	}

	private void wordGame(int i) {
		// TODO Auto-generated method stub
		while(true) {
			if(i%2==0) {
				while(btemp) {					
					System.out.print("[USER] : ");
					String user = sc.next();					
					btemp = GameLogic(user,i);
					/*
					for(String str : words) {
						if(str.equals(user)) {
							btemp = false;
						}
					}
					*/
				}
			}else {
				while(btemp) {
					int index = (int)(Math.random()*words.size());
					String com = words.get(index);					
					btemp = GameLogic(com,i);
					if(btemp==false) {
						System.out.print("[COMPUTER] : "+com);
					}
				}
			}
			System.out.println();
			btemp = true;
			i++;
		}
	}

	private boolean GameLogic(String str,int i) {
		if(str.equals("gg")) {
			gameEnd();
		}
		//�����ձ�ϱ� ���� ���� ������ ��
		ch1 = ch;
		ch = str.charAt(0);
		if(ch1==' ') {
			return false;
		}else {
			if(i%2==0) {
				if(str.length()<2) {
					count++;
					System.out.println("�ùٸ��� ���� �ܾ��Դϴ�. �ٽ� �Է����ּ���.");			
					if(count==3) {
						gameEnd();
					}
				}else {
					if(str.charAt(0)!=ch1) {
						count++;
						System.out.println("�ùٸ��� ���� �ܾ��Դϴ�. �ٽ� �Է����ּ���.");			
						if(count==3) {
							gameEnd();
						}
					}
					return true;
				}
			}else {
				if(str.charAt(0)!=ch1) {
					return true;
				}
			}
		}
		return true;
	}
	
	private void gameEnd() {
		count=0;
		System.out.println("�й�");
		l++;
		main();
	}
}
