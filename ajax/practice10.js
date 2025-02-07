//세 수 A, B, C를 입력 받은 다음, ( ( ( ( A XOR B ) XOR B ) XOR B ) … ) XOR B 형태로 연산을 C회 했을 때의 결과값을 출력하는 프로그램을 작성하시오.
//13 3 1


function xor(a,b,c) {
  let x = a;

  for(let i=0; i<c; i++){
    if (a == b){
      x = 0;
    }
  }
  return x;
} 
console.log(xor(13,3,1));