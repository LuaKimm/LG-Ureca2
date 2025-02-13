import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Main_BOJ_15961_G4_회전_초밥_허준호 {
  //회전 초밥 벨트에 놓인 접시 수: N (2 <= N <= 300만)
  //초밥 가짓수: d (2 <= d <= 3천)
  //연속해서 먹는 접시 수: k (2 <= k <= 3천)
  //쿠폰 번호: c (1 <= c <= d)

  //=> 손님이 먹을 수 있는 초밥 가짓수의 최댓값?
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //한 줄 입력 받기
    String[] input = br.readLine().split(" ");

    //각각의 변수에 할당
    int N = Integer.parseInt(input[0]);
    int d = Integer.parseInt(input[1]);
    int k = Integer.parseInt(input[2]);
    int c = Integer.parseInt(input[3]);

    int[] plates = new int[N];

    //회전 초밥 벨트에 놓인 초밥 정보 입력 받기
    for (int i = 0; i < N; i++) {
      plates[i] = Integer.parseInt(br.readLine());
    }

    // 초밥 개수를 저장하는 배열 (현재 연속으로 먹고 있는 초밥 종류 확인을 위함)
    int[] sushi_count = new int[d + 1];  // 초밥 번호는 1부터 d까지 존재 (count의 인덱스가 초밥 번호)
    Set<Integer> kindsSet = new HashSet<>(); // 

    int kinds_max = 0; //몇 가지 종류인지 저장할 것임 (최대 종류 수 저장)

    //초기 sub_plates(연속으로 먹는 경우에 대한 맨 처음 경우..)
    for (int i = 0; i < k; i++) {
      sushi_count[plates[i]]++; 
      kindsSet.add(plates[i]);
    }
    
    // 쿠폰 초밥 없으면 추가
    int kinds = kindsSet.size();
    if (sushi_count[c] == 0) { //지금 연속으로 먹고 있는 상황에서 c 초밥이 없으면
        kinds++; //먹을 수 있으니 +1
    }
    kinds_max = kinds;

    //우선 연속으로 먹는 접시 k개에서 d가지 초밥을 먹을 수 있는지 확인한다
    //일일이 sub 배열 관련해서 가짓수를 체크하면 시간 초과 우려
    //슬라이딩 윈도우 기법으로 하나씩 넣다, 뺐다를 하며 비교하는 게 나을듯
    for (int i = 0; i < N; i++) {
      // 제거할 초밥
      int remove_sushi = plates[i];
      sushi_count[remove_sushi]--; //맨 처음 초밥을 뺀다

      if (sushi_count[remove_sushi] == 0) {
        kindsSet.remove(remove_sushi);  // 더 이상 먹지 않으면 제거
      }

      // plates 배열에서 k+i번째 초밥을 뒤에 붙여준다
      int add_sushi = plates[(i + k) % N]; // 원형 배열이므로 처음으로 돌아가는 로직 필요
      sushi_count[add_sushi]++; //추가해 주었으니 +1
      kindsSet.add(add_sushi); //종류 수에도 추가

      // 현재 가짓수 계산
      kinds = kindsSet.size();
      if (sushi_count[c] == 0) {
          kinds++;
      }

      kinds_max = Math.max(kinds_max, kinds); //비교해서 최댓값 필요하면 갱신 
    }

    //결과 출력
    System.out.println(kinds_max);
  }
}
