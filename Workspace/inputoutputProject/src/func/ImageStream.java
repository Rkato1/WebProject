package func;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ImageStream {
	public void main() {
		//�ؽ�Ʈ�� �б� ���� ������Ʈ����ü 
		BufferedReader br = null;
		//������Ʈ�� �߰�
		BufferedOutputStream bos = null;
		//���� �������� ���� ��ü
		//FileOutputStream fos = null;
		try {
			//���� �б� ���� ���ν�Ʈ�� ����
			FileReader fr = new FileReader("quiz.txt");
			//�ӵ��� ���� ������Ʈ�� �߰�
			br = new BufferedReader(fr);
			//������ �̹��� ���·� �������� ���� ��ü
			//fos = new FileOutputStream("img.gif");
			bos = new BufferedOutputStream(new FileOutputStream("img.gif"));
			//1��¥�� �����̹Ƿ� �ѹ��� ����
			String str = br.readLine();
			//���� �������� ���ڿ� ��
			StringTokenizer sT = new StringTokenizer(str, " ");
			ArrayList<Byte> al = new ArrayList<Byte>();
			//�����ִٸ�(����������)
			while(sT.hasMoreTokens()) {
				String no = sT.nextToken();
				//16���� byte�� ��ȯ
				byte b = (byte)Integer.parseInt(no,16);
				al.add(b);
			}
			//���ϳ�������
			for(Byte by : al) {
				bos.write(by);
				//���� ���ۼ�Ʈ �ϼ������� �����ְ� �;����� ���� ����
				//System.out.println(((double)al.indexOf(by)/al.size())+"%�Ϸ�");
				//fos.write(by);
			}
			System.out.println("�Ϸ�");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
				bos.close();
				//fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
