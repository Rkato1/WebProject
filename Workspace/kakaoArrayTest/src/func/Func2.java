package func;

import java.util.ArrayList;
import java.util.HashMap;

public class Func2 {
	//���� ���� �ذ�����
	//LinkedList�� ����ϴ°�	
	
	public void map() {
		String[] cities = {"Jeju","Pangyo","Seoul","LA","Rome","Paris"};
		int cacheSize = 2;
		int totTime = 0;
		HashMap<String, Integer> cacheList = new HashMap<String, Integer>();
		if(cacheSize == 0) {
			totTime = 5*cities.length;
		}else {
			for(int i=0;i<cities.length;i++) {
				if(cacheList.containsKey(cities[i].toLowerCase())) {
					totTime += 1;
					//��ü ���� 1�߰�
					for(String key : cacheList.keySet()) {
						cacheList.put(key, cacheList.get(key)+1);
					}
					//���� ���ÿ� 0 ����
					cacheList.put(cities[i].toLowerCase(), 0);					
				}else {
					totTime += 5;
					if(cacheList.size()==cacheSize) {
						//������ Ű�� ����
						String removeKey = null;
						for(String key : cacheList.keySet()) {
							if(removeKey==null) {
								removeKey=key;
							}else {
								if(cacheList.get(removeKey)<cacheList.get(key)) {
									removeKey = key;
								}
							}
						}
						cacheList.remove(removeKey);
					}else {
						for(String key : cacheList.keySet()) {
							cacheList.put(key, cacheList.get(key)+1);
						}
						cacheList.put(cities[i].toLowerCase(), 0);
					}
				}
			}
		}
	}

	public void list() {
		String[] cities = {"Jeju","Pangyo","Seoul","NewYork","LA","SanFrancisco","Seoul","Rome","Paris","Jeju","NewYork","Rome"};
		int cacheSize = 0;
		ArrayList<String> cache = new ArrayList<>();
		int totalTime = 0;
		if(cacheSize == 0) {
			totalTime = 5*cities.length;
		}else {
			for(int i=0;i<cities.length;i++) {
				int searchResult = searchCache(cache, cities[i].toLowerCase());
				//ĳ�ÿ� ���ø��� ���°��
				if(searchResult == -1) {	
					totalTime += 5;
					//���� ĳ�ÿ� ���������� 0���ε��� ����
					if(cache.size() == cacheSize) {
						cache.remove(0);
					}
				}
				//ĳ�ÿ� ���ø��� �ִ°��
				else {
					totalTime += 1;
					cache.remove(searchResult);				
				}
				cache.add(cities[i].toLowerCase());
			}
		}
		System.out.println("��� : "+totalTime);
	}

	public int searchCache(ArrayList<String> cache, String city) {
		for(int i=0;i<cache.size();i++) {
			if(cache.get(i).equals(city)) {
				return i;
			}
		}
		return -1;
	}
}
