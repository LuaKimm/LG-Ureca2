const fs = require('fs');
const filePath = process.platform === "linux" ? "/dev/stdin" : "Algorithm/run/input.txt";
const input = fs.readFileSync(filePath).toString().trim().split("\n");
const [n, d, k, c] = input.shift().split(" ").map(Number);
const array = input.map(Number);

const mySushi = new Array(d+1).fill(0);
let cnt = 0;
let maxSushi = 0;

for (let i = 0; i < k; i++) {
  if (mySushi[array[i]] == 0) {
    cnt++;
  }
  mySushi[array[i]]++;
}
maxSushi = cnt;
if (mySushi[c] == 0) {
  maxSushi++;
}

for (let i = 0; i < n-1; i++) {
  if (mySushi[array[i]]==1) {
    cnt--;
  }
  mySushi[array[i]]--;

  if (mySushi[array[(i+k)%n]]==0) {
    cnt++;
  }
  mySushi[array[(i+k)%n]]++;
  maxSushi = Math.max(maxSushi, cnt+(mySushi[c]===0?1:0));

  if (maxSushi == d || maxSushi == k+1) {
    break
  }
}

console.log(maxSushi);
