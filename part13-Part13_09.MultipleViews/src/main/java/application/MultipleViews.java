package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application{

    @Override
    public void start(Stage window) {
        BorderPane b = new BorderPane();
        VBox v = new VBox();
        GridPane grid = new GridPane();
        
        Label label1 = new Label("First view!");
        Button b1 = new Button("To the second view!");
        b.setTop(label1);
        b.setCenter(b1);
        
        
        Button b2 = new Button("To the third view!");
        Label label2 = new Label("Second view!");
        v.getChildren().addAll(b2, label2);
        
        Button b3 = new Button("To the first view!");
        Label label3 = new Label("Third view");
        grid.add(label3, 0, 0);
        grid.add(b3, 1, 1);
        
        
        Scene first = new Scene(b);
        Scene second = new Scene(v);
        Scene third = new Scene(grid);

        b1.setOnAction((event) -> {
            window.setScene(second);
        });
        
        b2.setOnAction((event) -> {
            window.setScene(third);
        });
        
        b3.setOnAction((event) -> {
            window.setScene(first);
        });
        
        window.setScene(first);
        window.show();
    }
    
    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

}
