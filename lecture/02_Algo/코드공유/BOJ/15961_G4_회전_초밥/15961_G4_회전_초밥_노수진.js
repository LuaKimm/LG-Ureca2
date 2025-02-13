//회전 초밥 문제
let fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().trim().split(/\s+/);

let [N, d, k, c] = input.splice(0, 4).map(Number);
let arr = input.map(Number);

arr = arr.concat(arr.slice(0, k - 1));

let isSelected = new Array(d + 1).fill(0);
isSelected[c] = 1; 
let count = 1; 

for (let i = 0; i < k; i++) {
    if (isSelected[arr[i]] === 0) count++;
    isSelected[arr[i]]++;
}

let maxCount = count;

for (let i = 1; i < N; i++) {
    let removeSushi = arr[i - 1];
    let addSushi = arr[i + k - 1];

    isSelected[removeSushi]--;
    
    if (isSelected[removeSushi] === 0) count--;
    if (isSelected[addSushi] === 0) count++;
    
    isSelected[addSushi]++;

    maxCount = Math.max(maxCount, count);
}

console.log(maxCount);
