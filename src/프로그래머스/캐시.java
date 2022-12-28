package 프로그래머스;

import java.util.ArrayList;
import java.util.List;

public class 캐시 {
	public int solution(int cacheSize, String[] cities) {
		int answer = 0;
		List<String> list = new ArrayList<>();
		for(int i = 0; i < cities.length; i++) {
			String city = cities[i].toLowerCase();
			if(list.contains(city)) {
				answer += 1;
				list.remove(city);
				list.add(city);
			}else {
				answer += 5;
				list.add(city);
				if(list.size() > cacheSize) {
					list.remove(0);
				}				
				System.out.println(list);
			}
			
		}
		return answer;
	}
	public static void main(String[] args) {
		캐시 g = new 캐시();
		String[] a = new String[] {"Jeju", "Pangyo", "NewYork", "newyork"};
		System.out.println(g.solution(3, a));

	}

}
