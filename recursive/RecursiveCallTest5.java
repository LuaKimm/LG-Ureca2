package recursive;
//// 피보나치 수열 
//N-1    +    N-2
//N-2 N-3  N-3 N-4  top down 방식 한번 수행한 결과를 메모하겠다 
//= Memorization 한번 수행한 값은 절대로 변하지 않는다.
public class RecursiveCallTest5 {
	
	
	public static void main(String[] args) {
	System.out.println(fibo(7));
}
	public static int fibo(int n) {
		if(n<=2) { return 1; }
	return	fibo(n-1) + fibo(n-2);
	}
}
