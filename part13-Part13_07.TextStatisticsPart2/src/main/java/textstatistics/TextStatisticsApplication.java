package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application{

    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        TextArea topText = new TextArea();
        layout.setCenter(topText);
        
        Label letters = new Label("Letters: 0");
        Label words = new Label("Words: 0");
        Label longest = new Label("The longest word is: ");

        HBox buttons = new HBox(20);
        buttons.getChildren().addAll(letters, words, longest);

        layout.setBottom(buttons);
        
        topText.textProperty().addListener((change, oldValue, newValue) -> {
            int countLetters = newValue.length();
            
            String trimmed = newValue.trim();
            int wordCount = 0;
            String longestWord = "";
            
            if (!trimmed.isEmpty()){
                String[] parts = trimmed.split("\\s+");
                wordCount = parts.length;
                
                for (String p: parts){
                    if (p.length() > longestWord.length()){
                        longestWord = p;
                    }
                }
            }
            
            letters.setText("Letters: " + countLetters);
            words.setText("Words: " + wordCount);
            longest.setText("The longest word is: " + longestWord);
        });
        

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
