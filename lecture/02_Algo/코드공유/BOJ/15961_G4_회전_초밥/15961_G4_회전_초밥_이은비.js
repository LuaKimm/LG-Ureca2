// 입력
const fs = require('fs');
const stdin = fs.readFileSync('/dev/stdin').toString().trim();

const lines = stdin.split("\n")
const [n,d,k,c] = lines[0].split(' ').map(Number)
const railArr = lines.slice(1).map(Number)

function main(n,d,k,c,railArr){
  let visited = new Array(d+1).fill(0) 
  let uniqueCnt = 0
  let maxVal = 0

  //초기 등록
  for(let i=0;i<k;i++){
    if(visited[railArr[i]] == 0) uniqueCnt++
    visited[railArr[i]]++
  }

  maxVal = uniqueCnt + (visited[c] === 0 ? 1 : 0);

  //슬라이딩 윈도우
  for(let i=0;i<n;i++){
    let removeIdx = railArr[i]
    let addIdx = railArr[(i+k)%n] //원형벨트 고려

    //삭제
    if(visited[removeIdx] == 1) uniqueCnt--;
    visited[removeIdx]--

    //추가
    if(visited[addIdx] == 0) uniqueCnt++; 
    visited[addIdx]++

    //쿠폰 추가
    maxVal = Math.max(maxVal, uniqueCnt + (visited[c] === 0 ? 1 : 0));
  }
  console.log(maxVal)
}
main(n,d,k,c,railArr)