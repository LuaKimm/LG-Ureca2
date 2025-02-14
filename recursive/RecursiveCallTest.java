package recursive;


/*
 * 재귀함수 
 * : 함수 내에서 해당 함수를 또 호출
 * -반복의 depth를 알수 없을때 (랜덤일때) 사용 (인자 or 배열 depth를 컨드롤 한다)
 * - 기저조건 : 재귀함수를 중단하는 조건
 * 	 유도파트 : 재귀함수를 진행하는 파트
 * 
 * 	 
 * */
public class RecursiveCallTest {
	static int N = 10;
	//기저조건에서 재귀가 중단
	//Bottom -> UP
	public static int print(int n) {
	    if(n == 1) return 1;  // 예시: 기저조건에서 1 반환
	    return n + sum2(n-1);
	}

	
private static int sum2(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static int sum1(int i) {
		//기저조건 : 재귀함수를 중단하는 조건
		if(i == N) return N;
		return sum1(i+1)+i;

//		특정 조건을 만족할때 재귀가 진행되는 구조
//		bottom -> up
	}

public static void print3(int num) {
	if(num <= N) {
		System.out.println(num + " ");
		print3(num + 1);
	}
}

public static void main(String[] args) {
		print3(N);
		for (int i = 0; i <= N; i++) {
			System.out.print(i+ " ");
		}
		System.out.println();
		print(0);
		System.out.println();
//		
		for (int i = 10; i > -1; i--) {
			System.out.print(i+ " ");
		}
		System.out.println();
		print2(N);
	}
		public static void print2(int num) {
			if(num == -1) return;
			System.out.print(num + " ");
			print2(num-1);
		}
}
