package fillCell;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * NxN 배열을 위한 기지국(A)와 집(H)가에 대한 정보가 주어진다. 
 * 기지국은 상하좌우 1셀씩만 커버한다. 커버하지 못하는 집의 개수를 출력
 *
 * [제약조건]
 * N은 3~15이하
 * 
 * [입력]
 * 첫줄은 테스트 케이스 수(T)가 주어진다.
 * 두번째 줄은 배열 크기(N)이 주어지고
 * 세번째 줄부터 N개의 기지국 정보가 제공된다. 
 * 
 * [출력 결과]
 * #1 4
 * #2 5
 * #3 9
 */
public class BaseStation1 {
	//결과를 위한 변수    <= 여기서 선언하는 이유는 앞으로 많은 문제들이 함수를 통해 구현하는 경우가 많으므로 접근할 수 있도록 선언  
    static int AnswerN=0;
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/basestation1.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int test_case=1; test_case<=T; test_case++){
			//테케 마다 결과 변수를 초기해줘야 한다.  그렇지 않으면 이전 값때문에 결과가 달라진다.  
			AnswerN=0;  
			int N = Integer.parseInt(br.readLine());
			//입력 처리 
			
			//구현하기 
			//1. 기지국을 찾아 상하좌우에 커버됐다고 표시하기
				//1.1 맵 전체를 탐색하면서 
				
				//1.2 기지국(A)를 찾는다. 
			
				//2.3 기지국의 상하좌우의 좌표를 얻고 경계내에 있는지 검사
			
				//2.4 상하좌우에 커버됐다고 표시한다. 
			
			
			//2. 맵 전체를 탐색하면 커버 안된 집의 개수를 센다.  
			
			//출력 
			System.out.println("#"+test_case+" "+AnswerN);
		}
	}//end main
}//end class









