package borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;


public class BorderPaneApplication extends Application{

    @Override
    public void start(Stage window){
        
        BorderPane control = new BorderPane();
        control.setTop(new Label("NORTH"));
        control.setRight(new Label("EAST"));
        control.setBottom(new Label("SOUTH"));
        Scene view = new Scene(control);
        
        window.setScene(view);
        window.show();
        
    }

    public static void main(String[] args) {
        launch(BorderPaneApplication.class);
    }

}
