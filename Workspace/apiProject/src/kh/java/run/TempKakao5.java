package kh.java.run;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class TempKakao5 {
	public String solution(String play_time, String adv_time, String[] logs) {
		String answer = "";
		ArrayList<String> playtimeList = new ArrayList<String>();				
		StringTokenizer st = new StringTokenizer(play_time, ":");
		if(st.hasMoreTokens()) {
			playtimeList.add(st.nextToken());
		}
		ArrayList<String> advtimeList = new ArrayList<String>();
		st = new StringTokenizer(adv_time, ":");
		if(st.hasMoreTokens()) {
			advtimeList.add(st.nextToken());
		}
		
		if(logs.length>=1 && logs.length<=300000) {
			ArrayList<String> logtimeList = new ArrayList<String>();
			ArrayList<String> logstarttimeList = new ArrayList<String>();
			ArrayList<String> logendtimeList = new ArrayList<String>();
			for(int i=0; i<logs.length;i++) {
				st = new StringTokenizer(logs[i], "-");
				if(st.hasMoreTokens()) {
					logtimeList.add(st.nextToken());
				}
				st = new StringTokenizer(logendtimeList.get(i), ":");
				for(int j=0;j<2;j++) {
					if(j%2==0) {
						if(st.hasMoreTokens()) {					
							logstarttimeList.add(st.nextToken());
						}							
					}else {
						if(st.hasMoreTokens()) {					
							logendtimeList.add(st.nextToken());
						}
					}
				}
			}			
			int count=0;
			for(int i=0; i<playtimeList.size(); i++) {
				if(playtimeList.get(i).equals(advtimeList.get(i))) {
					count++;
				}
			}
			if(count==3) {
				answer = adv_time;
			}else {
				ArrayList<Integer> diffTimes = new ArrayList<Integer>();
				ArrayList<Integer> startTimes = new ArrayList<Integer>();
				ArrayList<Integer> endTimes = new ArrayList<Integer>();
				int time1=0,time2=0;
				for(int i=0;i<logstarttimeList.size();i++) {
					switch(i%3) {
					case 0:
						time1=0;
						time2=0;
						time1+=Integer.parseInt(logstarttimeList.get(i));
						time2+=Integer.parseInt(logendtimeList.get(i));
						break;
					case 1:
						time1+=60*Integer.parseInt(logstarttimeList.get(i));
						time2+=60*Integer.parseInt(logendtimeList.get(i));
						break;
					case 2:
						time1+=3600*Integer.parseInt(logstarttimeList.get(i));
						startTimes.add(time1);
						time2+=3600*Integer.parseInt(logendtimeList.get(i));
						endTimes.add(time2);
						int tottime = time2-time1;
						diffTimes.add(tottime);
						break;
					}
				}
				int findtime=0;
				for(int i=0;i<diffTimes.size();i++) {
					if(findtime==0) {
						findtime = diffTimes.get(i);
					}else {
						if(findtime>diffTimes.get(i)) {
							findtime = diffTimes.get(i);
						}
					}
				}
				int findstarttime=0, findendtime=0;
				if(findtime==Integer.parseInt(adv_time)) {
					for(int i=0;i<diffTimes.size();i++) {
						if(findtime==diffTimes.get(i)) {
							if(findstarttime==0) {
								findstarttime = startTimes.get(i);
								answer = logstarttimeList.get(i);
							}else {
								if(findstarttime>startTimes.get(i)) {
									answer = logstarttimeList.get(i);
								}
							}
						}
					}
				}else {
					int abstime=0;
					for(int i=0;i<diffTimes.size();i++) {
						if(abstime==0) {
							abstime = startTimes.get(i);
							answer = logstarttimeList.get(i);
						}else {
							if(abstime>startTimes.get(i)) {
								abstime = Math.abs(abstime-startTimes.get(i));
								answer = logstarttimeList.get(i);
							}
						}
					}
				}
			}
		}		
        return answer;
    }
}
