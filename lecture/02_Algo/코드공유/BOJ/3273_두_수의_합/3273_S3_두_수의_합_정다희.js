const fs = require('fs');
const filePath = process.platform === "linux" ? "/dev/stdin" : __dirname + "/input.txt";
const input = fs.readFileSync(filePath).toString().trim().split("\n");
const n = parseInt(input[0]);
const a = input[1].split(' ').map(Number);
const x = parseInt(input[2]);

let start = 0;
let end = n-1;
let cnt = 0;
let sum = 0;

const array = a.sort(function(a, b)  {
  return a - b;
});

while (start < end) {
  sum = array[start] + array[end]
  if (sum == x) {
    cnt += 1
    start += 1
    end -= 1
  }
  else if (sum > x) {
    end -= 1
  }
  else {
  start += 1
  }
}
console.log(cnt)
