document.querySelector("#btn")?.addEventListener("click", game);

function game(): void {
  let lotto: number[] = [];
  
  // 1~45 사이의 난수를 생성하여 배열에 추가
  while (lotto.length < 6) {
    let num: number = Math.floor(Math.random() * 45) + 1;
    if (lotto.indexOf(num) === -1) lotto.push(num);
  }

  lotto.sort((a, b) => a - b);

  let i: number = 0;
  
  // 1초 간격으로 번호 출력
  let intervalId = setInterval(function () {
    if (i === lotto.length) {
      clearInterval(intervalId);
      return;
    }

    // 요소 생성 및 추가
    let ball = document.createElement("div");
    ball.className = `ball ball${Math.floor(lotto[i] / 10)}`;
    ball.textContent = lotto[i++].toString();
 
    document.querySelector("#view")?.appendChild(ball);
  }, 1000);
}
