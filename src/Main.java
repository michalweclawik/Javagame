import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Start Game

        System.out.println(GameLogic.word);
//Play
        while (GameLogic.won && LostGame.lostGame())
        {
        GameLogic.validateWords();

        GameLogic.userInput();
        }
//when win
        if (FinishGame.finishGame()){
            System.out.println("Correct the word was :  " + GameLogic.word);
            System.out.println("you Won");
        }
// when lost
        if (!LostGame.lostGame()){
            System.out.println("You lost game");
        }

    }
}