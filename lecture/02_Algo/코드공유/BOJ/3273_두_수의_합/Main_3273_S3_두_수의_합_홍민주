import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_3273_S3_두_수의_합_홍민주 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); //n 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		 int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken()); 
	        }
        int x = Integer.parseInt(br.readLine());
        Arrays.sort(arr);
        //여기까지 입력관련
        
        int start = 0, end = n-1, count=0;
        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum == x) { 
                count++;
                start++; // 
                end--; // 다른조합 확인용
            } else if (sum < x) { 
                start++;
            } else { 
                end--;
            }
        }
        
         System.out.println(count);
        
	}

}
