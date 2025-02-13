package Java0213;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_3273_S3_두_수의_합_이혜은 {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			//첫줄 N
			int N = Integer.parseInt(br.readLine());
			
			//N개의 정수.
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			//공백 구분자.
			int[] arr = new int[N];
			for(int i=0;i<N;++i) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			int M = Integer.parseInt(br.readLine());
			
			Arrays.sort(arr); //오름차순 정렬 
//			System.out.println(Arrays.toString(arr));
			
			int start = 0;
			int end = N-1;
			int cnt = 0;
			
			//만약 
			while(start < end) { //종료조건을 어떻게 작성하는 것이 나을가요 ? 일단 
				if(arr[start] + arr[end] == M) {
					cnt++;
					start++;
					end--;
//					System.out.println("cnt : " + cnt);
				}
				else if(arr[start] + arr[end] < M) {
					start++;
				}
				else if(arr[start] + arr[end] > M) {
					end--;
				}
//				System.out.println(arr[start] + " " + arr[end]);
			}
			
			System.out.println(cnt);
			
		} catch (IOException e) { e.printStackTrace(); }
		
	}

}
