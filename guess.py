#!/usr/bin/python3
"""
Guess The Number
The most famous simple game written in python
For educational purposes only
"""

import random


def main():
    print("Guess the number between 1 and 100")

    number = random.randint(1, 100)
    tries = 0

    while True:
        tries += 1
        guess = int(input("nr: "))
        if guess == number:
            break
        elif guess > number:
            print("Too high!")
        else:
            print("Too low!")

    print(f"Congratulation!\nYou guess the number in: {tries} tries")


if __name__ == "__main__":
    main()
