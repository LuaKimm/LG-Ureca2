package boj.gold;

import java.util.HashMap;
import java.util.Scanner;

public class Main_15961_G4_회전_초밥_안민지 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 첫 번째 줄 입력
        int N = sc.nextInt(); // 접시 수
        int d = sc.nextInt(); // 초밥 가짓수 (사용 안 함)
        int k = sc.nextInt(); // 연속해서 먹는 접시 수
        int c = sc.nextInt(); // 쿠폰 번호
        
        // 초밥 종류 입력
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        
        sc.close();
        
        int max = 0;
        HashMap<Integer, Integer> eating = new HashMap<>(); // 현재 먹고 있는 초밥 종류 및 개수 (중복제거는 안함!)
        
        // 처음 k개 초밥을 먹음
        for (int i = 0; i < k; i++) {
            eating.put(nums[i], eating.getOrDefault(nums[i], 0) + 1);
        }
        
        // 쿠폰 초밥 추가하기
        eating.put(c, eating.getOrDefault(c, 0) + 1);
        max = eating.size();
        
        // 슬라이딩 윈도우 기법 적용
        for (int i = 0; i < N; i++) {
            int removeIdx = i;
            int addIdx = (i + k) % N;
            
            // 첫 번째 요소 제거
            if (eating.get(nums[removeIdx]) == 1) {
                eating.remove(nums[removeIdx]);
            } else {
                eating.put(nums[removeIdx], eating.get(nums[removeIdx]) - 1);
            }
            
            // 새로운 요소 추가
            eating.put(nums[addIdx], eating.getOrDefault(nums[addIdx], 0) + 1);
            
            max = Math.max(max, eating.size());
        }
        
        System.out.println(max);
    }
}
