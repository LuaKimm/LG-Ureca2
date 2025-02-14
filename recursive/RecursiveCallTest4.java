package recursive;

/*
 * 재귀함수 
 * : 함수 내에서 해당 함수를 또 호출
 * - 반복의 depth를 알 수 없을 때 (랜덤일 때) 사용 (인자나 배열의 depth를 컨트롤)
 * - 기저조건: 재귀함수를 중단하는 조건
 * - 유도파트: 재귀함수를 진행하는 파트
 */

public class RecursiveCallTest4 {
    static int fac = 5;

    public static void main(String[] args) {
        int result = 1;

        // 반복문을 이용한 팩토리얼 계산
        for (int i = 1; i <= fac; i++) {
            result *= i;
        }
        System.out.println("반복문을 이용한 팩토리얼: " + result);

        // 재귀함수를 이용한 팩토리얼 계산
        System.out.println("재귀함수 fac1을 이용한 팩토리얼: " + fac1(fac));
        System.out.println("재귀함수 fac2를 이용한 팩토리얼: " + fac2(fac));
    }

    // 재귀를 사용한 팩토리얼 계산 메소드 1
    public static int fac1(int n) {
        if (n == 1) return 1;
        return n * fac1(n - 1);
    }

    // 재귀를 사용한 팩토리얼 계산 메소드 2
    public static int fac2(int n) {
        if (n == 1) return n;
        return n * fac2(n - 1);
    }
}
