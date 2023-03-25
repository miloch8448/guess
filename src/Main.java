import javafx.util.Pair;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        int tries;
        Scanner tr = new Scanner(System.in);
        System.out.println("How many tries have you got?: ");
        tries = tr.nextInt();
        Scanner k = new Scanner(System.in);
        Scanner v = new Scanner(System.in);

        System.out.println("Pass first var :");
        int first = k.nextInt();
        System.out.println("Pass second var :");
        int second = v.nextInt();
        Pair<Integer, Integer> para = new Pair<>(first, second);

        int randomNumber = (int)(Math.random()*(second-first)+first);
        System.out.println("You can start guessing now!");
        int toGuess;
        Scanner gs = new Scanner(System.in);
        while(tries!=0){
            System.out.println("Pass new variable: ");
            toGuess = gs.nextInt();
            if(toGuess>randomNumber){
                System.out.println("The number is less than yours! ");
            }else if(toGuess<randomNumber){
                System.out.println("The number is more than yours!");
            }else{
                System.out.println("!!!AM!!!");
                System.exit(0);

            }
            tries--;
        }
        System.out.println("You're not lucky.");
    }
}