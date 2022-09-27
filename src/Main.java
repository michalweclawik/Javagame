import java.util.Scanner;

public class Main {

    private static Scanner scanner;

    public static void main(String[] args) {



//Start Game
        System.out.println(" Let`s start game !! You have 3 lives");
        System.out.println(GameLogic.word);

//        Play
        while (GameLogic.finishGame() && GameLogic.lostGame())
        {

        GameLogic.validateWords();
        GameLogic.userInput();


        }
//when win
        if (!GameLogic.finishGame()){
            System.out.println("Correct the word was :  " + GameLogic.word);
            System.out.println("you Won");
        }
//        when lost
        if (!GameLogic.lostGame()){
            System.out.println("You lost game");
        }




        System.out.println(" Another try ? Y for yes N for no");
        String answer=scanner.nextLine();

        if(answer.equalsIgnoreCase("Y")){
            Main.main(args);
        }else {

            System.exit(0);
        }

//




    }
}