const [_, arr, x] = require("fs")
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "test/test/input.txt")
  .toString()
  .trim()
  .split("\n");

const set = new Set(arr.split(" ").map(Number));
let cnt = 0;

set.forEach((item, _, s) => {
  if (x - item !== item && s.has(x - item)) cnt++;
});

console.log(cnt / 2);
