package nhntest;

import java.util.ArrayList;

public class test2 {
	private static void solution(int day, int width, int[][] blocks) {
	    // TODO: �̰��� �ڵ带 �ۼ��ϼ���. �߰��� �ʿ��� �Լ��� ���������� �����ؼ� ����ϼŵ� �˴ϴ�.
		//���츮ã�����
		boolean isAvailable = false;
		if(day<=0 || day>100) {
			System.out.println("���� �Ⱓ �ϼ� ���� �ʰ��Դϴ�.");
		}else if(width<=0 || width>100) {
			System.out.println("�۾� ������ �ʺ� ���� �ʰ��Դϴ�.");
		}else {
			for(int i=0; i<blocks[i].length; i++) {
				if(blocks[i].length<=0 || blocks[i].length>100) {
					System.out.println("�۾� ������ �ʺ� ���� �ʰ��Դϴ�.");
				}
				for(int j=0; j<blocks[i].length; j++) {
					if(blocks[i][j]<=0 || blocks[i][j]>100) {
						System.out.println("�۾� ���� �� �� ĭ�� �Ϸ絿�� ���� ������ ���� ���� �ʰ��Դϴ�.");
					}else {
						isAvailable = true;
					}
				}
			}
		}
		
		if(isAvailable) {
			//�ø�Ʈ�� �� ��
			int cementCount = 0;
			//���츮 Ž���� ���� ������ ����Ʈ
			ArrayList<Integer> findCementList = new ArrayList<Integer>();
			//�� ������ ���� ���� �ݺ���
			for(int i=0; i<day; i++) {
				//���� ���� �ø�Ʈ�� ������ �߰��ؼ� �����ؾߵ� 2�������ʹ�
				for(int j=0; j<blocks[i].length; j++) {
					findCementList.add(j, blocks[i][j]);
				}
				//���츮 ������ ����Ʈ
				ArrayList<Integer> topList = new ArrayList<Integer>();
				//���츮Ž������
				for(int j=0; j<findCementList.size(); j++) {
					for(int k=j+1; k<findCementList.size(); k++) {
						int itemp = findCementList.get(j)-findCementList.get(k);
						topList.add(j, itemp);
					}
				}
				for(int j=1; j<topList.size(); j++) {
					//���� ���ؼ� ������������ �ȵǰ� 0�� ������ �߰����� ����� �߰�
					int itemp = topList.get(j-1) * topList.get(j);
					//�ø�Ʈ���� �þ������ ������ ������ �߰��������
					if(itemp<0) {
						if(j==1 && topList.get(j-1)>0) {
							cementCount+=topList.get(j-1);
							findCementList.set(j, findCementList.get(j)+topList.get(j-1));
						}
					}else if(itemp>0) {
						//�Ѵ� ++���� --��������
						if(topList.get(j-1)<0&&topList.get(j)<0) {
							int itemp1=0;
							for(int k=j; k>=0; k--) {
								if(topList.get(k)>0) {
									itemp1 = k;
									break;
								}
							}
							cementCount+=Math.abs(topList.get(j-1)+2*topList.get(j));
							findCementList.set(j, findCementList.get(j)+topList.get(j-1));							
						}else {
							//�� �� ++�� ���ϱ� �ջ��� �ʿ䰡 ����
						}
					}else {
						//0�ϋ� �����ε� ���� ��ٷο�
						//�� ���߿� ������ *2
						//����� 0���� �Ǻ�
						if(topList.get(j-1)==0) {
							cementCount+=2*topList.get(j-2);
						}else {
							cementCount+=2*topList.get(j+1);
						}
					}
				}
			}
			System.out.println(cementCount);
		}
	  }
}
