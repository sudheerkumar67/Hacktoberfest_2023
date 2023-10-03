const secretNumber = Math.floor(Math.random() * 100) + 1;
let attempts = 0;

function checkGuess() {
    const guess = parseInt(document.getElementById('guess').value);
    attempts++;

    if (guess === secretNumber) {
        document.getElementById('message').innerHTML = `Congratulations! You guessed it in ${attempts} attempts.`;
        document.getElementById('animation').style.display = 'block';
    } else if (guess < secretNumber) {
        document.getElementById('message').innerHTML = 'Try a higher number.';
    } else {
        document.getElementById('message').innerHTML = 'Try a lower number.';
    }
}

document.getElementById('submit').addEventListener('click', checkGuess);
