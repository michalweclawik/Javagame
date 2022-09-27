import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public  class Words {

    private static final List<String > words = new ArrayList<>();
    private static final Random RANDOM = new Random();

   static {
       words.add("mouse");
       words.add("screen");
       words.add("chair");
       words.add("sky");
   }

    public static String   getRandomWord(){
        return words.get( RANDOM.nextInt( words.size()) );
    }


}

