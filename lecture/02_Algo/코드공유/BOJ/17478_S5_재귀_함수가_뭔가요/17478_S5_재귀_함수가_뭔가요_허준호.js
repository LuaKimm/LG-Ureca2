const fs = require('fs') //'fs' 객체 가져오기

const filePath = process.platform === 'linux' ? '/dev/stdin' : __dirname + '/a.txt';

//N 입력 받기
const N = Number(fs.readFileSync(filePath).toString().trim());

//문장 앞에 '_' 출력하는 함수 (문장 포함)
function print_sentence(i, string) {
  //연속해서 줄바꿈 없이 출력하기 위해 이러한 방법 사용
  console.log("_".repeat(i*4)+string);
}

//출력을 해줄 함수 print(재귀 호출 예정)
//Bottom-Up 방식으로 풀어볼게요
function print(i, N) {
  print_sentence(i, "\"재귀함수가 뭔가요?\"");

  //재귀 호출의 끝에 도달했다면
  if(i == N) {
    //맨 끝에서의 답변 출력
    print_sentence(i, "\"재귀함수는 자기 자신을 호출하는 함수라네\"");
    print_sentence(i, "라고 답변하였지.");
    return;
  }

  print_sentence(i, "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
  print_sentence(i, "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
  print_sentence(i, "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
  
  print(i+1, N); //재귀 호출
  print_sentence(i, "라고 답변하였지.");
}

//시작~
console.log("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
//출력 함수 호출
print(0, N);