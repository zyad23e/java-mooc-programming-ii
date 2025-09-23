
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many random numbers should be printed?");
        int val = Integer.valueOf(scanner.nextLine());
        
        Random num = new Random();
        for (int i = 0; i < val; i++){
            System.out.println(num.nextInt(11));
        }
    }

}
