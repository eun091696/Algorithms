package 프로그래머스;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 최댓값과최솟값 {
	public String solution(String s) {
		String answer = "";
        String[] sArr = s.split(" ");
        List<Integer> sInt = new ArrayList();
        
        for (int i=0; i<sArr.length; i++) {
            sInt.add(Integer.valueOf(sArr[i]));
        }
        
        Collections.sort(sInt);
        answer += Integer.valueOf(sInt.get(0));
        answer += " ";
        answer += Integer.valueOf(sInt.get(sInt.size()-1));
		//Collections 클래스 정의 https://velog.io/@gillog/Collections-%ED%81%B4%EB%9E%98%EC%8A%A4
        //풀이 참조 : https://velog.io/@__yeseul__/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%B5%9C%EB%8C%93%EA%B0%92%EA%B3%BC-%EC%B5%9C%EC%86%9F%EA%B0%92-java
		return answer;
	}
	public static void main(String[] args) {
		최댓값과최솟값 g = new 최댓값과최솟값();
		System.out.println(g.solution("1234"));

	}

}
