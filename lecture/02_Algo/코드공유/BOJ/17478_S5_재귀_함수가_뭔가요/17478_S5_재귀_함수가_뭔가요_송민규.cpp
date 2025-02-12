#include<bits/stdc++.h>
using namespace std;

int n;

string what = "\"재귀함수가 뭔가요?\"";
string listen1 = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
string listen2 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
string listen3 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
string recursive = "\"재귀함수는 자기 자신을 호출하는 함수라네\"";
string rago = "라고 답변하였지.";

void printUnderline(int cnt){
  for(int i = 0; i < cnt; i++){
    cout << "____";
  }
  return;
}

void print(int cnt){
  printUnderline(cnt);
  cout << what << '\n';
  if(cnt == n){
    printUnderline(cnt);
    cout << recursive << '\n';
    printUnderline(cnt);
    cout << rago << '\n';
    return;
  }
  else{
    printUnderline(cnt);
    cout << listen1 << '\n';
    printUnderline(cnt);
    cout << listen2 << '\n';
    printUnderline(cnt);
    cout << listen3 << '\n';
    print(cnt + 1);
  }
  printUnderline(cnt);
  cout << rago << '\n';
  return;
}

int main(){
  cin >> n;
  cout << "어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n";
  print(0);
  return 0;
}