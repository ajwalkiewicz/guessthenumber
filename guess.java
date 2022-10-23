
/*
Guess The Number
The most famous simple game written in python
For educational purposes only
*/
import java.util.Scanner;

public class guess {
    public static void main(String[] args) {
        Scanner answer = new Scanner(System.in);

        System.out.println("Guess the number between 1 and 100");

        int number = (int) (Math.random() * 100 + 1);
        int tries = 0;
        int guess;

        while (true) {
            tries += 1;
            System.out.print("nr: ");
            guess = answer.nextInt();
            if (guess == number) {
                break;
            } else if (guess > number) {
                System.out.println("Too high!");
            } else {
                System.out.println("Too low!");
            }
        }

        System.out.println("Congratulations!\nYou guess the number in: " + tries + " tries");
    }
}