package boj.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
 *  어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.
 *  
	"재귀함수가 뭔가요?"
	"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.
	마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.
	그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어."
	
	//재귀하는 부분
	____"재귀함수가 뭔가요?"
	____"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.
	____마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.
	____그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어."
	
	//재귀할때마다 ____ 증가
	________"재귀함수가 뭔가요?"
	________"재귀함수는 자기 자신을 호출하는 함수라네" //재귀의 깊이가 N에 도달하면 위 내용 반복하지 않고 해당 내용 출력
	________라고 답변하였지. //재귀를 빠져나오면서 역순으로 출력됨
	
	____라고 답변하였지.
	라고 답변하였지.
 */
public class Main_17478_S5_재귀_함수가_뭔가요_안민지 {
    public static void main(String[] args) throws Exception {
        // 1. 입력을 받는다!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 받은 입력값 저장
        // 2. 초기 질문을 출력해준다.
        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다."); //초기질문

        // 3. 재귀 함수 호출 (초기 underbar 부분에는 공백)
        recursive(N, "");
    }

    public static void recursive(int n, String underbar) {
        // 3-1.현재 depth에 맞는 들여쓰기와 함께 질문 출력
        System.out.println(underbar + "\"재귀함수가 뭔가요?\"");

        // 3-2. 종료 조건: n이 0이면 기본 답변 출력 후 종료
        if (n == 0) {
            System.out.println(underbar + "\"재귀함수는 자기 자신을 호출하는 함수라네\"");
        } else {
            // 3-3. 다음 재귀 호출 전에 출력할 이야기 부분
            System.out.println(underbar + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
            System.out.println(underbar + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
            System.out.println(underbar + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");

            // 3-4. 재귀 호출: 깊이를 하나 줄이고, underbar에 "____"를 추가
            recursive(n - 1, underbar + "____");
        }
        // 3-5. 재귀 호출이 끝난 후, 응답 출력 (빠져나오면서 역순으로 출력됨)
        System.out.println(underbar + "라고 답변하였지.");
    }
}