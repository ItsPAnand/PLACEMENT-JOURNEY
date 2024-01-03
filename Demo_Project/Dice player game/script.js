var randomNumber1 = Math.floor(Math.random() * 6) + 1;

var randomDiceImage1 = "./images/" + "dice" + randomNumber1 + ".png";  //./images/dice1.png

document.querySelectorAll("img")[0].setAttribute("src", randomDiceImage1);

var randomNumber2 = Math.floor(Math.random() * 6) + 1;

var randomDiceImage2 = "./images/" + "dice" + randomNumber2 + ".png";  //./images/dice1.png

document.querySelectorAll("img")[1].setAttribute("src", randomDiceImage2);

if (randomNumber1 > randomNumber2) {
    document.querySelector("h1").innerHTML = "🚩 Player 1 wins";
}
else if (randomNumber1 < randomNumber2) {
    document.querySelector("h1").innerHTML = "Player 2 wins 🚩";
}
else{
    document.querySelector("h1").innerHTML="🚩 Draw 🚩";
}

document.getElementById('myButton').addEventListener('click', function (event) {
    location.reload();
    event.preventDefault();
});

