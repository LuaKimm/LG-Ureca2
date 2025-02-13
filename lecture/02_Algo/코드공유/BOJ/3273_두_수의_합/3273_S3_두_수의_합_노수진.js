let fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().trim().split(/\s+/);

let n = Number(input[0]);
let arr = input.slice(1, n+1).map(Number);
let x = Number(input[n+1]);
let count = 0;
let start = 0;
let end = n-1;
let sum = 0;

arr.sort((a, b) => a - b);

while(start < end){
    sum = arr[start] + arr[end]
    if(sum === x){
        start += 1;
        end -= 1;
        count += 1;
    }
    else if (sum > x){
        end -= 1;
    }
    else{
        start += 1;
    }
  }

console.log(count);