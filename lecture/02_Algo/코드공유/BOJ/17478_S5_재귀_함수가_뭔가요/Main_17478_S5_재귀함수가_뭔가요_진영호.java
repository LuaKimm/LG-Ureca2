package silver;

import java.util.Scanner;

public class Main_17478_S5_재귀함수가_뭔가요_진영호 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
		react(0, n);
		
	}
	
	public static void react(int i, int n) {
		System.out.println(bar(i) + "\"재귀함수가 뭔가요?\"");
		if (i == n) {
			System.out.println(bar(i) + "\"재귀함수는 자기 자신을 호출하는 함수라네\"");
			answer(i);
			return;
		}
		else {
			System.out.println(bar(i) + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
			System.out.println(bar(i) + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
			System.out.println(bar(i) + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
			
			react(i + 1, n);
		}
	}
	
	public static String bar(int i) {
		if (i == 0) {
			return "";
		}
		return "____" + bar(i - 1);
	}
	
	public static void answer(int i) {
		if (i < 0) {return;}
		System.out.println(bar(i) + "라고 답변하였지.");
		answer(i - 1);
	}
	
}
