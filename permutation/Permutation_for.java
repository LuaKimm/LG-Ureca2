package permutation;

import java.util.Scanner;

/*
 * 순열
 * -서로 다른 n개의 원소에서 r개를 순서를 고려해서 선택(나열)하는 것을 순열이라 한다.
 * */
public class Permutation_for {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	//원소 수
	int N = scan.nextInt();
	int [] data = new int[N];
	for(int i = 0; i < N; i++) {
		data[i] = scan.nextInt();
	}
	
	/*
	 * 중복 순열 : 중복해서 원소를 선택 nㅠr
	 * */
	int cnt = 0;
	for(int i = 0; i < N; i++) { //첫번째 원소를 반복
		for(int j =0; j<N; j++) { //두번째 원소를 반복
			for (int k = 0; k < N; k++) { //세번째 원소 반복
				cnt++;
				System.out.printf("%d %d %d", data[i], data[j], data[k]);
			}
		}
	}
	System.out.printf("%dTT3 중복 순열의 개수 %d%n", N, N, cnt);
	System.out.println("===========================순열========================");
	cnt = 0;
	for(int i = 0; i < N; i++) { //첫번째 원소를 반복
		for(int j =0; j<N; j++) {//두번째 원소를 반복
			if(i!=j) {
			for (int k = 0; k < N; k++) { //두번째 원소는 첫번째와 같으면 안됨.
				if(i!=k && j!=k) { 	//세 번째 원소 반복
					cnt++;
					System.out.printf("%d %d %dn", data[i], data[j], data[k]); //재귀로 한다
				}
				}
					}
				}
			}
	System.out.printf("%dp3 순열 개수 : %d", N, cnt);
}
}
