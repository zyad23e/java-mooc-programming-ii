package title;

import java.util.Scanner;
import javafx.application.Application;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Application.launch(UserTitle.class,
                "--organization=" + scanner.nextLine(),
                "--course=" + scanner.nextLine());

    }

}
