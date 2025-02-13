const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

let lines = [];

rl.on('line', (line) => {
    lines.push(line.trim().split(" ").map(e => Number(e)));
}).on('close', () => {
    console.log(solution(lines));
    process.exit(0);
})

function solution(lines){
    let n = lines[0];
    let arr = lines[1];
    let x = lines[2];

    let count = 0;
    let end = arr.length - 1;    
    let start = 0;

    arr = arr.sort((a, b) => a - b);

    while(start != end){
        if(arr[start] + arr[end] > x){
            end--;
        }
        else if(arr[start] + arr[end] == x){
            count++;
            start++;
        } 
        else if(arr[start] + arr[end] < x){
            start++;
        }
    }

    return count;
}