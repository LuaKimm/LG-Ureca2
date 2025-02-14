package recursive;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HanoiTest2 {

	static StringBuilder result = new StringBuilder();
	static void hanoi(int cnt, int from , int temp, int to) {
		//모든 판을 다 옮긴 경우 종료
		if(cnt == 0) {
			return ; 
		}
		
		hanoi(cnt-1, from, to, temp);
		result.append(cnt+" :"+from +" ->" +to + "\n");
		hanoi(cnt-1, temp, from, to);
}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		hanoi(count, 1, 2, 3);
		System.out.println(result);
	}
}
