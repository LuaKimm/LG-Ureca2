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
public class RecursiveCallTest3 {
    static int N = 5;
    
    
    public static int factorial(int n) {
       
        if(n == 1) return 1;
        
        return n * factorial(n - 1);
    }
    
    public static void main(String[] args) {
        int result = factorial(N);
        System.out.println(result);
    }
}



