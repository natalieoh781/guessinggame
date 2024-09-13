import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[]args){
    Random rand = new Random();
        int x = rand.nextInt(100);
    
    Scanner scan = new Scanner(System.in);
    int guess;
    int count = 0;
    do {
        System.out.println("Enter your guess: ");
        guess = scan.nextInt();
        count++;

        if (guess<x) {
            System.out.println("Higher!");
        }
        
        if (guess>x) {
            System.out.println("Lower!");
        }

    } while (guess!=x);

    System.out.println("You got it! Congratulations, the number was " + x + "!");
    if (count<=7){
        System.out.println("You got the number in " + count + " guesses! You got an impossibly good score!");
    }
    if (count >= 8 & count <=10){
        System.out.println("You got the number in " + count + " guesses! Good job!");
    }
    if (count >10){
        System.out.println("You got the number in " + count + " guesses! It sure took you a while, try to divide and conquer next time!");

    }
    }

}
