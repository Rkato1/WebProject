package func;

import java.util.ArrayList;
import java.util.HashMap;

public class Func2 {
	//가장 좋은 해결방법은
	//LinkedList를 사용하는것	
	
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
					//전체 값에 1추가
					for(String key : cacheList.keySet()) {
						cacheList.put(key, cacheList.get(key)+1);
					}
					//현재 도시에 0 대입
					cacheList.put(cities[i].toLowerCase(), 0);					
				}else {
					totTime += 5;
					if(cacheList.size()==cacheSize) {
						//삭제될 키값 저장
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
				//캐시에 도시명이 없는경우
				if(searchResult == -1) {	
					totalTime += 5;
					//현재 캐시에 꽉차있으면 0번인덱스 삭제
					if(cache.size() == cacheSize) {
						cache.remove(0);
					}
				}
				//캐시에 도시명이 있는경우
				else {
					totalTime += 1;
					cache.remove(searchResult);				
				}
				cache.add(cities[i].toLowerCase());
			}
		}
		System.out.println("결과 : "+totalTime);
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
