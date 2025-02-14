package recursive;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HanoiTest {
	
	//from 출발 : 현재 원반이 위치한 기둥
	//temp 임시 : 원반을 옮기는 과정에서 임시로 사용하는 보조 기둥
	//to 목적기둥 : 원반을 최종적으로 옮길 목표 기둥
		static StringBuilder result = new StringBuilder(100);
		static void hanoi(int cnt, int from , int temp, int to) {
			//모든 판을 다 옮긴 경우 종료
			if(cnt == 0) {
				return ; 
			}
			
			//현재 기둥에서 맨 아래 판을 뺀 나머지 (cnt-1)들을 임시 기둥(temp)에 옮겨야된다.
			hanoi(cnt-1, from, to, temp);
			//맨 아래 판을 목적 기둥 (to)에 옮겨 놓기
			result.append(cnt+" :"+from +" ->" +to + "\n");
			//나머지 판 (cnt - 1)을 기둥(to)에 옮겨 놓기
			hanoi(cnt-1, temp, from, to);
		}
		
		
		public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		hanoi(count, 1, 2, 3);
		System.out.println(result);
	}

}
