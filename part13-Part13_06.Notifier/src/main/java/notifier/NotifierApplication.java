package notifier;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NotifierApplication extends Application{

    @Override
    public void start(Stage window) {
        TextField topText = new TextField(); //top
        Button button = new Button("Update"); //middle
        Label output = new Label();  //bottom

        button.setOnAction((event -> {
            output.setText(topText.getText());
        }));
        
        VBox root = new VBox();
        root.getChildren().addAll(topText, button, output); //add the VBox UI component with the fields.
        

        Scene scene = new Scene(root);

        window.setScene(scene);
        window.show();
    }
    
    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

}
