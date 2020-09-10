package func;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//����� �ڵ�
public class WordGame {
	Scanner sc;
	ArrayList<String> words;
	Random r;
	public WordGame() {
		super();
		// TODO Auto-generated constructor stub
		sc = new Scanner(System.in);
		r = new Random();
		words = new ArrayList<String>();
		BufferedReader br = null;
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
		System.out.println("�� "+words.size()+"�� �ܾ��Է�");
	}
	
	public void main() {
		int w=0,l=0;
		while(true) {
			System.out.println("\n----- �����ձ� -----\n");
			System.out.println("1.���� ����");
			System.out.println("2.���� Ȯ��");
			System.out.println("3.���α׷� ����");
			System.out.print("���� > ");
			int sel = sc.nextInt();
			switch(sel) {
			case 1:
				String result = startwordGame();
				if(result == null) {
					
				}else if(result.equals("win")) {
					w++;
					//System.out.println("�¸�");
				}else {
					l++;
					//System.out.println("�й�");
				}
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

	private String startwordGame() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("\n--- ����/�İ� ���� ---\n");
			System.out.println("1.����");
			System.out.println("2.�İ�");
			System.out.print("���� > ");
			int sel = sc.nextInt();
			switch(sel) {
			case 1:
				String user = userInput(null);
				if(user.equals("lose")) {
					return user;
				}else {
					String result = gameLoop(user,true);
					return result;
				}
			case 2:
				String com = comInput(null);
				String result = gameLoop(com, false);
				return result;
			default:
				System.out.println("1~2 ���� ���� �Է�. ���θ޴��� ���ư�");
				return null;
			}
		}
	}
	
	//��ǻ�� �ܾ �Ű������� �޾Ƽ� �����ܾ �Է��ϴ� �ڵ�
	public String userInput(String com) {
		//3�� �������� ����
		int count = 0;
		if(com!=null) {
			while(true) {
				System.out.print("[USER] : ");
				String user = sc.next();
				if(user.toLowerCase().equals("gg")) {
					return "lose";
				}
				count++;
				//��ǻ���� ���� �����ڿ� ������ ���� ó�� ���ڰ� �������
				if(com.charAt(com.length()-1) == user.charAt(0)) {
					int result = searchWord(user);
					if(result!=-1) {
						return user;
					}
				}
				if(count == 3) {
					return "lose";
				}
				System.out.println("�߸��� �Է�, �ٽ� �Է�,"+(3-count)+"���� ��ȸ ����");
			}
		}else {
			while(true) {
				System.out.print("[USER] : ");
				String user = sc.next();
				if(user.toLowerCase().equals("gg")) {
					return "lose";
				}
				count++;
				int result = searchWord(user);
				if(result!=-1) {
					return user;
				}
				if(count == 3) {
					return "lose";
				}
				System.out.println("�߸��� �Է�, �ٽ� �Է�,"+(3-count)+"���� ��ȸ ����");
			}
		}
	}
	
	//��ǻ�� �ܾ �Ű������� �޾Ƽ� �����ܾ �Է��ϴ� �ڵ�
	public String comInput(String user) {
		if(user!=null) {
			//������ �� ���ڷ� �����ϴ� �ܾ ���� list
			ArrayList<String> comWords = new ArrayList<String>();
			for(String str : words) {
				//�����ձ� ������ �ȴ�
				if(user.charAt(user.length()-1)==str.charAt(0)) {
					comWords.add(str);
				}
			}
			if(comWords.isEmpty()) {
				return "win";
			}
			//���� ��
//			if(comWords.size()==0) {
//				return "win";
//			}
			int random = r.nextInt(comWords.size());
			String com = comWords.get(random);
			System.out.println("[COMPUTER] : "+com);
			return com;
		}else{
			int random = r.nextInt(words.size());
			String com = words.get(random);
			System.out.println("[COMPUTER] : "+com);
			return com;
		}
	}
	
	private String gameLoop(String str, boolean b) {
		String result = str;
		//�����ΰ��
		if(b) {
			while(true) {
				result = comInput(result);
				if(result.equals("win")) {
					System.out.println("����� �¸�!");
					return result;
				}
				result = userInput(result);
				if(result.equals("lose")) {
					System.out.println("�й�");
					return result;
				}
			}
		}
		//�İ��� ���
		else {
			while(true) {
				result = userInput(result);
				if(result.equals("\"lose\"")) {
					System.out.println("�й�");
					return result;
				}
				result = userInput(result);
				if(result.equals("win")) {
					System.out.println("����� �¸�!");
					return result;
				}
			}
		}
	}

	private int searchWord(String word) {
		for(int i=0;i<words.size();i++) {
			if(words.get(i).equals(word)) {
				return i;
			}
		}
		// TODO Auto-generated method stub
		return -1;
	}
}
