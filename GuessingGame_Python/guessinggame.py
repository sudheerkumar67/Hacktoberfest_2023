# Game configuration
print("Guess the Number Game")
print("----------------------")

max_number = int(input("Choose maximum number: "))
max_guesses = int(input("Maximum guesses allowed: "))

# Game logic
import random

answer = random.randint(1, max_number)
guesses_left = max_guesses

while guesses_left > 0:

    print(f"Guesses left: {guesses_left}")

    guess = int(input("Enter your guess: "))

    if guess == answer:
        print("You guessed correctly!")
        break

    guesses_left -= 1

# Game over
if guesses_left == 0:
    print(f"Game over! The number was {answer}")

print("Thanks for playing!")


# API calls
import requests

url = f"http://numbersapi.com/{guess}/trivia?json"
res = requests.get(url)
data = res.json()

if guess == answer:
    print(data['text'])

# Decorations
print("\n*****")
print("\nCongratulations!")
print("\n*****")