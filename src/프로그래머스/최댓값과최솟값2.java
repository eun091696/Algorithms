package 프로그래머스;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 최댓값과최솟값2 {
	public String solution(String s) {
		String answer = "";
		List<Integer> list = new ArrayList<>();
        String[] strings = s.split(" "); //공백으로 구분되어 있지만 초기에 공백으로 자르지 않음.
        
        for(int i = 0; i < strings.length; i++) {
        	list.add(Integer.parseInt(strings[i]));
        }
        answer = Collections.min(list) + " " + Collections.max(list);
        System.out.println("min: " + Collections.min(list));
        System.out.println("max: " + Collections.max(list));
        
		//Collections 클래스 정의 https://velog.io/@gillog/Collections-%ED%81%B4%EB%9E%98%EC%8A%A4
		return answer;
	}
	public static void main(String[] args) {
		최댓값과최솟값2 g = new 최댓값과최솟값2();
		System.out.println(g.solution("-1 -2 -3 -4"));

	}

}
