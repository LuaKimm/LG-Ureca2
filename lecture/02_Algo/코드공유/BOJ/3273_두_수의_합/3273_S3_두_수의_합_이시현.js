const fs = require("fs");
const path = require("path");

const filePath =
  process.platform === "linux"
    ? "/dev/stdin"
    : path.join(__dirname, "input.txt");
let input = fs.readFileSync(filePath).toString().trim().split("\n");

const n = parseInt(input[0]);
const arr = input[1].split(" ").map(Number);
const x = parseInt(input[2]);

let end = 0,
  count = 0;
let sum = 0;

for (let start = 0; start < n; start++) {
  end = start + 1;
  while (end < n) {
    sum = arr[start];
    sum += arr[end];
    if (sum === x) count++;
    end++;
  }
}

console.log(count);
