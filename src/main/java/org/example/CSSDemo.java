package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
        import javafx.stage.Stage;

public class CSSDemo extends Application {

    public void start(Stage stage) {
        VBox layout = new VBox();

        Button button = new Button("CLICK ME!");
        layout.getChildren().add(button);

        Scene view = new Scene(layout);

        view.getStylesheets().add("style.css");
        view.getStylesheets().add("style2.css");

        stage.setScene(view);
        stage.show();
    }
}