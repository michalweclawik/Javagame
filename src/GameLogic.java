import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class GameLogic {
//
//    private String randomWord;
//    char [] letters = new char[randomWord.length()];
////    get word from words
//
//
//    public void getWord(Words randomWord){
//        this.randomWord=randomWord.randomWord();
//    }
//
//
//    public   void presentTarget(){
//
//            for(int i = 0; i < randomWord.length(); i++) {
//            letters[i] = '_';
//            }
//
//            for(int i = 0; i < randomWord.length(); i++){
//            System.out.print(letters[i]);}
//    }
//
//
//
//    public void updateCharLetters(){
//         for(int i = 0; i < randomWord.length(); i++){
//                  if(randomWord.charAt(i)== letter){
//                 letters[i]=letter;
//             }
//         }
//        for (int i = 0; i < letters.length; i++) {
//            System.out.print(letters[i]);
//        }
//    }
//
//    public static String replaceLettersWithUnderScore(){
//        return Words.getRandomWord().replaceAll("[a-z/gi]","_ ");
//    }

    public static final List<Character> playerGuesses = new ArrayList<>();
    static Scanner userInput = new Scanner(System.in);
    static int countLetter =0;
    static String word = Words.getRandomWord();
static boolean stopGame= true;
    static int lives =5;


public static boolean finishGame(){
   return countLetter!=word.length();
}

public static boolean lostGame(){
    return lives!=0 ;

}
    static void validateWords(){


     for(int i = 0; i<word.length();i++)
        {
            if (playerGuesses.contains(word.charAt(i))) {
                System.out.print(word.charAt(i));

                countLetter++;
            } else {
                System.out.print("_");
            }
        }

        System.out.println();
        System.out.println(lives);

    }

   static void userInput(){

       System.out.println("Please enter a letter:");
        String letterPressed =userInput.nextLine();

        if(!word.contains(letterPressed) && !playerGuesses.contains(letterPressed)){
            lives--;
            System.out.println("letter not added ");
        }
        if (word.contains(letterPressed) && !playerGuesses.contains(letterPressed)) {
            System.out.println(playerGuesses);
            playerGuesses.add(letterPressed.charAt(0));
            System.out.println("letter added ");
        }


//        if(!playerGuesses.contains(letterPressed)){
//         playerGuesses.add(letterPressed.charAt(0));
//            System.out.println("letter added ");
//        }else {
//            System.out.println("you already pressed "+ letterPressed);
//        }

    }

    }


//while (lives > 0 && Arrays.toString(hiddenWord).contains("_"))
//        System.out.println("\n Do you want to play again? type Y or N");
//        String response = scanner.nextLine();
//        if (response.equalsIgnoreCase("Y")){
//        Main.main(args);
//        } else {
//        System.exit(0);
//
//        }







