package recursive;

public class sum02 {
    static int N = 10;

    // sum2 재귀함수 구현
    public static int sum2(int n) {
        if (n == N) return n; // 기저조건: n이 N에 도달하면 n 반환
        return n + sum2(n + 1); // n부터 N까지의 합을 재귀적으로 계산
    }

    public static void print3(int num) {
        if (num <= N) {
            System.out.print(num + " "); // 개행 없이 출력
            print3(num + 1); // 1부터 N까지 증가시키며 출력
        }
    }
    //Top->Down 
    public static void print4(int num) {
    	if(num > -1) {
    		System.out.print(num + " ");
    		print4(num-1);
    	}
    }

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println("for문으로 계산한 합: " + sum);

        // sum2 함수 호출
        System.out.println("재귀함수로 계산한 합: " + sum2(1));

        // 1부터 N까지 출력
        print3(1);
    }
    

}

