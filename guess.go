// Guess The Number
// The most famous simple game writte in Golang
// For educational purpose only

package main

import (
	"fmt"
	"math/rand"
)

func main() {
	fmt.Println("Guess the number between 1 and 100")

	var guess, tries int
	number := rand.Intn(100) + 1

	for {
		_, err := fmt.Scan(&guess)
		if err != nil {
			fmt.Println("Unexpected error: ", err)
			continue
		}

		tries += 1

		if guess == number {
			break
		} else if guess > number {
			fmt.Println("Too high!")
		} else {
			fmt.Println("Too low!")
		}
	}

	fmt.Printf("Congratulation!\nYpu guess the number in %d tries\n", tries)
}
