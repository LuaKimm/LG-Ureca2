package BOJ;

import java.util.Scanner;

public class Main_BOJ_17478 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.print("재귀 횟수를 입력하세요: ");
        int n = scan.nextInt();
        scan.close();

        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        Main_DOG_17478(n, 0, "");
    }

    // 재귀적으로 대화 내용을 출력하는 메서드
    public static void Main_DOG_17478(int n, int current, String prefix) {
        // 현재 질문 출력
        System.out.println(prefix + "\"재귀함수가 뭔가요?\"");

        // 종료 조건: 재귀 깊이가 n에 도달했을 때
        if (current == n) {
            System.out.println(prefix + "\"재귀함수는 자기 자신을 호출하는 함수라네\"");
        } else {
            // 재귀 전 설명 출력
            System.out.println(prefix + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
            System.out.println(prefix + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
            System.out.println(prefix + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");

            // 재귀 호출 (들여쓰기 추가)
            Main_DOG_17478(n, current + 1, prefix + "____");
        }

        // 답변 출력
        System.out.println(prefix + "라고 답변하였지.");
    }
}
