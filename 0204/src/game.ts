let images: string[] = ["rock.png", "paper.png", "scissors.png"];

let choiceImage:number = 0;
document.querySelector("#btn")?.addEventListener("click", () => {
  const resultElement = document.querySelector("#result");
  const choices = ["가위", "바위", "보"];

  // if (!resultElement) return;

  // // 게임이 실행 중일 때 멈춤
  // if (isRunning) {
  //   isRunning = false;
  //   document.querySelector("#btn").innerText = "게임 시작";
  //   resultElement.innerHTML += "<br>게임이 멈췄습니다!";
  //   return;
  // }
}

    function showComputerImage() {
      if (choiceImage === state.바위) {
      choiceImage = state.가위;
    }

    const score:number[] = [0, 1, -1];
  // 게임 시작
  isRunning = true;
  document.querySelector("#btn").innerText = "멈추기";

  // 랜덤으로 가위바위보 선택 및 결과 출력
  const randomIndex = Math.floor(Math.random() * choices.length);
  const choice = choices[randomIndex];
  resultElement.innerHTML = `결과: ${choice}`;
});

