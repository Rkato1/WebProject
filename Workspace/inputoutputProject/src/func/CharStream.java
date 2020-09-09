package func;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharStream {
	public void primaryStream() {
		Scanner sc = new Scanner(System.in);
		FileWriter fw = null;
		System.out.print("저장할 파일명 입력 : ");
		String fileName = sc.nextLine();
		
		try {
			fw = new FileWriter(fileName);
			System.out.println("["+ fileName+"] 파일에 저장할 내용 입력 : ");
			System.out.println("종료는 exit 입력");
			int lineNumber = 1;
			while(true) {
				System.out.print((lineNumber++)+" : ");
				String str = sc.nextLine()+"\r\n";
				if(str.equals("exit\r\n")) {
					break;
				}
				fw.write(str);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//한글도 안깨짐
	public void subStream() {
		Scanner sc = new Scanner(System.in);
		System.out.print("저장할 파일명 입력 : ");
		String fileName = sc.nextLine();
		//경로설정
		String path = "C:\\Users\\user\\Desktop\\";
		BufferedWriter bw = null;
		
		try {
			//FileWriter fw = new FileWriter(path+fileName);
			//bw = new BufferedWriter(fw);
			//합치기
			bw = new BufferedWriter(new FileWriter(path+fileName));
			System.out.println("["+ fileName+"] 파일에 저장할 내용 입력 : ");
			System.out.println("종료는 exit 입력");
			int lineNumber = 1;
			while(true) {
				System.out.print((lineNumber++)+" : ");
				String str = sc.nextLine();
				if(str.equals("exit")) {
					break;
				}
				bw.write(str);
				//줄바꿈
				bw.newLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void charStreamReader() {
		Scanner sc = new Scanner(System.in);
		System.out.print("로드할 파일명 입력 : ");
		String fileName = sc.nextLine();
		BufferedReader br = null;
		try {
			FileReader fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			while(true) {
				//br.readLine()
				//파일에서 한줄을 읽어서 line변수에 저장
				String line = br.readLine();
				//끝까지 다 읽었으면
				if(line == null) {
					break;
				}
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
}
