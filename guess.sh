#!/bin/bash
# Guess The Number
# The most famous simple game written in bash
# For educational purposes only

main() {
    echo "Guess the number between 1 and 100"
    
    number=$(( $RANDOM % 100 + 1 ))
    tries=0

    while true; do
        tries=$(( $tries + 1 ))
        printf "nr: "
        read guess
        if [ "0$guess" -eq $number ]; then
            break
        elif [ "0$guess" -gt $number ]; then
            echo "Too high!"
        else
            echo "Too low!"
        fi
    done

    echo -e "Congratulation!\nYou guess the number in: $tries tiries"
}

main