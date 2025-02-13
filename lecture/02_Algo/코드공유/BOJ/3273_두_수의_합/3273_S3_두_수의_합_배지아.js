const fs = require("fs");

const input = fs.readFileSync("/dev/stdin").toString().split("\n");

const n = parseInt(input[0]);
const a = input[1].split(" ").map(Number);
const x = parseInt(input[2]);

a.sort((a, b) => a - b);

let start = 0;
let end = n - 1;
let count = 0;

while (start < end) {
  let sum = a[start] + a[end];

  if (sum === x) {
    count++;
    start++;
    end--;
  } else if (sum > x) {
    end--;
  } else {
    start++;
  }
}
console.log(count);
