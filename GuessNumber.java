import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(10) + 1; 
        int guess = 0;
        int i=1;

        while (guess != number && i<4) {

            System.out.print("Guess a number (1 to 10): ");
            guess = sc.nextInt();

            if (guess == number) {
                System.out.println("Congratulations! You guessed the correct number.");
            } else if (guess < number) {
                System.out.println("Too low! Try again.");
            } else if(guess>number){
                System.out.println("Too high! Try again.");
            }
            i++;
        }
        sc.close();
    }
}