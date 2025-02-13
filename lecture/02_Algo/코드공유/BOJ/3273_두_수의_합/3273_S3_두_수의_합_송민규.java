import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] v = new int[n];
        
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        
        Arrays.sort(v);
        
        int x = sc.nextInt();
        
        int idx1 = 0, idx2 = n - 1;
        int cnt = 0;
        
        while (idx1 < idx2) {
            int sum = v[idx1] + v[idx2];
            if (sum == x) {
                cnt++;
                idx1++;
                idx2--;
            } else if (sum > x) {
                idx2--;
            } else {
                idx1++;
            }
        }
        
        System.out.println(cnt);
    }
}
