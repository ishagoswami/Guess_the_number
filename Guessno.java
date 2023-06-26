import java.util.*;
public class Guessno {

    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            int guess,attempts=1, number;
            // srand(time(0));
            number = 1 + (int)(100 * Math.random());// Generate the random number between 100 to 1
            // System.out.println("the number is "+number);
            do{
                System.out.println("Guess the number :");
                guess= sc.nextInt();

                if(guess>number){
                     System.out.println("Lower number please");
                }
                else if(guess<number){
                     System.out.println("Higher number please"); 
                }
                else{
                     System.out.println("You guessed it in"+attempts+"attempts" );
                }
                attempts++;
      }
     while(guess!=number);
        }
         
    }   
}