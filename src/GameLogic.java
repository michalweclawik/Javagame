import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class GameLogic {

    public static final List<Character> playerGuesses = new ArrayList<>();
    static Scanner userInput = new Scanner(System.in);
    static int countLetter =0;
    static String word = Words.getRandomWord();
static boolean stopGame= true;
    static int lives =5;
    static  boolean won=true;



static void validateWords(){
     for(int i = 0; i<word.length();i++)
        {
            if (playerGuesses.contains(word.charAt(i))) {
                System.out.print(word.charAt(i));
            } else {
                System.out.print("_");
            }
//            if(word.charAt(i) != '_'){
//                System.out.println("you won ");
//won=false;



     }

        System.out.println();
         }

    static void userInput(){

       System.out.println("Please enter a letter:");
        String letterPressed =userInput.nextLine();

        if(!word.contains(letterPressed) ){
            lives--;
            System.out.println("Wrong chose!!. now you have " + lives +" lives!!!");
        }
        if(playerGuesses.contains(letterPressed.charAt(0))){
            System.out.println("You already typed in this letter");
        }
        if (word.contains(letterPressed) && !playerGuesses.contains(letterPressed.charAt(0))) {
            System.out.println(playerGuesses);
            countLetter++;
            playerGuesses.add(letterPressed.charAt(0));
            System.out.println("Good guess letter been  added ");
        }
        FinishGame.finishGame();
        LostGame.lostGame();
    }
    }






