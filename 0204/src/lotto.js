var _a;
(_a = document.querySelector("#btn")) === null || _a === void 0 ? void 0 : _a.addEventListener("click", game);
function game() {
    var lotto = [];
    // 1~45 사이의 난수를 생성하여 배열에 추가
    while (lotto.length < 6) {
        var num = Math.floor(Math.random() * 45) + 1;
        if (lotto.indexOf(num) === -1)
            lotto.push(num);
    }
    lotto.sort(function (a, b) { return a - b; });
    var i = 0;
    // 1초 간격으로 번호 출력
    var intervalId = setInterval(function () {
        var _a;
        if (i === lotto.length) {
            clearInterval(intervalId);
            return;
        }
        // 요소 생성 및 추가
        var ball = document.createElement("div");
        ball.className = "ball ball".concat(Math.floor(lotto[i] / 10));
        ball.textContent = lotto[i++].toString();
        (_a = document.querySelector("#view")) === null || _a === void 0 ? void 0 : _a.appendChild(ball);
    }, 1000);
}
