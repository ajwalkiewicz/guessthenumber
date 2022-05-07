/*
Guess The Number
The most famous simple game written in C
For educational purposes only
*/

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void){
    printf("Guess the number between 1 and 100\n");

    srand(time(0));
    int number = (rand() % 100 + 1);
    int tries = 0;
    int guess;

    while(1){
        tries++;
        printf("nr: ");
        scanf("%d", &guess);
        if (guess == number){
            break;
        } else if (guess > number){
            printf("Too high!\n");
        } else {
            printf("Too low!\n");
        }
    }
    printf("Congratulation!\nYou guess the number in: %d tiries", tries);
    return 0;
}