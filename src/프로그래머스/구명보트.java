package 프로그래머스;

import java.util.Arrays;

public class 구명보트 {
	public int soultion(int[] people, int limit) {
		int answer = 0;
		Arrays.sort(people);
	
		int min = 0;
		int max = people.length - 1;
		
		while(min <= max) {
			if(max == min) {
				answer++;
				break;
			}
			if(people[max] + people[min] <= limit) {
				min++;
				max--;
				answer++;
			}else {
				max--;
				answer++;
			}
		}

		return answer;
	}
	public static void main(String[] args) {
		구명보트 g = new 구명보트();
		int[] p = {70, 80, 50};
		int l = 100;
		System.out.println(g.soultion(p, l));

	}

}
