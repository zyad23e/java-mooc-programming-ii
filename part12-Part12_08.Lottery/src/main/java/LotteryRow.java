
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the random number generation here
        // the method containsNumber is probably useful
        Random picks = new Random();
        for (int i = 0; i < 7; i++){
            while(true){
                int draw = picks.nextInt(40) + 1;
                if (!(this.containsNumber(draw))){
                    this.numbers.add(draw);
                    break;
                } else {
                    continue;
                }
            }
        }
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        if (numbers.contains(number)){
            return true;
        }
        return false;
    }
}

