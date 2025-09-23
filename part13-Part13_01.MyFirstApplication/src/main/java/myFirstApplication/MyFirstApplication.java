package myFirstApplication;

import javafx.application.Application;
import javafx.stage.Stage;

public class MyFirstApplication extends Application{

    public static void main(String[] args) {
        launch(MyFirstApplication.class);
    }

    @Override
    public void start(Stage arg0) {
        arg0.setTitle("My first application");
        arg0.show();
    }

}
