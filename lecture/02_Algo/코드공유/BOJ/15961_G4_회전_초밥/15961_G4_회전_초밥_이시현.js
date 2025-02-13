const fs = require("fs");
const path = require("path");

const filePath =
  process.platform === "linux"
    ? "/dev/stdin"
    : path.join(__dirname, "input.txt");
let input = fs.readFileSync(filePath).toString().trim().split("\n");

let [N, d, k, c] = input.shift().split(" ").map(Number);
let sushi = input.map(Number);
let checked = Array.from({ length: d + 1 }, () => 0);
let kind = 0;
let max_kind = 0;

for (let i = 0; i < k; i++) {
  if (checked[sushi[i]] === 0) {
    kind++;
  }
  checked[sushi[i]]++;
}
max_kind = checked[c] === 0 ? kind + 1 : kind;

for (let i = 0; i < N; i++) {
  let remove_idx = i; // 삭제할 초밥 인덱스
  let add_idx = (i + k) % N; // 추가할 초밥 인덱스 (원형 배열)

  checked[sushi[remove_idx]]--;

  if (checked[sushi[remove_idx]] === 0) {
    kind--;
  }

  if (checked[sushi[add_idx]] === 0) {
    kind++;
  }
  checked[sushi[add_idx]]++;

  max_kind = Math.max(max_kind, checked[c] === 0 ? kind + 1 : kind);
}

console.log(max_kind);
