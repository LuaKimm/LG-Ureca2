import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_17478_S5_재귀함수가_뭔가요_허준호 {

  //문장 앞에 '_' 출력하는 함수
  public static void print_underBar(int i) {
    //문장 앞에 '_' 출력
    for(int iter = 0; iter<i*4; iter++)
    {
      System.out.print('_');
    }
  }

  //출력을 해줄 함수 print(재귀 호출 예정)
  //Bottom-Up 방식으로 풀어볼게요
  public static void print(int i, int N) {

    //"재귀함수가 뭔가요?"
    print_underBar(i);
    System.out.println("\"재귀함수가 뭔가요?\"");

    //재귀 호출의 끝에 도달했다면
    if(i == N) {
      //맨 끝에서의 답변 출력
      print_underBar(i);
      System.out.println("\"재귀함수는 자기 자신을 호출하는 함수라네\"");
      print_underBar(i);
      System.out.println("라고 답변하였지.");
      return;
    }

    print_underBar(i);
    System.out.println("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");

    print_underBar(i);
    System.out.println("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
  
    print_underBar(i);
    System.out.println("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");

    print(i+1, N); //재귀 호출
    print_underBar(i);
    System.out.println("라고 답변하였지.");
  }

  public static void main(String[] args) throws Exception{

    //출력을 원하는 재귀 횟수 입력 받기 (정수로 변환)
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    
    //시작~
    System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
    //출력
    print(0, N);
  }
}
