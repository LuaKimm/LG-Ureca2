const fs = require('fs');
const stdin = fs.readFileSync('/dev/stdin').toString().trim();

//입력 처리
const lines = stdin.split(`\n`)
const n = Number(lines[0])
const x = Number(lines[lines.length-1])
const arr = lines[1].split(' ').map(Number)

//오름차순 정렬
arr.sort((a,b)=>a-b)

//초기화
let p1 = 0
let p2 = n-1
let result = 0
//포인터가 교차하기 전까지 반복
while (p1<p2){
    const sumVal = arr[p1]+arr[p2]
    if(sumVal===x){
        result += 1
        p1++
        p2--
    }else if(sumVal>x){
        p2--
    }else{
        p1++
    }
}
console.log(result)