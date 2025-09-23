package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndTextFieldApplication extends Application{

    public void start(Stage window){
        Button button = new Button("Click me!");
        TextField someText = new TextField();
        
        FlowPane control = new FlowPane();
        control.getChildren().add(button);
        control.getChildren().add(someText);
        
        Scene view = new Scene(control);
        
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

}
