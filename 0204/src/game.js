var _a;
(_a = document.querySelector("#btn")) === null || _a === void 0 ? void 0 : _a.addEventListener("click", game);
function game() {
    var choices = ["가위", "바위", "보"];
    var resultElement = document.querySelector("#result");
    var round = 1;
    if (!resultElement)
        return;
    var intervalId = setInterval(function () {
        var randomIndex = Math.floor(Math.random() * choices.length);
        var choice = choices[randomIndex];
        // 결과 출력
        resultElement.innerHTML = "".concat(choice);
        round++;
        // 3라운드가 끝나면 정지
        if (round > 3) {
            clearInterval(intervalId);
            resultElement.innerHTML += "<br>게임이 종료되었습니다!";
        }
    }, 1000);
}
