package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class AnchorPaneDemo extends Application {

    public void start(Stage stage) {
        AnchorPane layout = new AnchorPane();

        Button button1 = new Button("TOP LEFT");
        Button button2 = new Button("TOP RIGHT");
        Button button3 = new Button("BOTTOM LEFT");
        Button button4 = new Button("BOTTOM RIGHT");

        layout.getChildren().add(button1);
        layout.getChildren().add(button2);
        layout.getChildren().add(button3);
        layout.getChildren().add(button4);

        // TODO: tämä pitäisi varmaan olla setTopAnchor
        AnchorPane.setBottomAnchor(button1,0.0);
        AnchorPane.setLeftAnchor(button1, 0.0);
        //AnchorPane.setTopAnchor(button1, 0.0);
        //AnchorPane.setRightAnchor(button1, 0.0);

        AnchorPane.setTopAnchor(button2, 0.0);
        AnchorPane.setRightAnchor(button2, 0.0);

        AnchorPane.setBottomAnchor(button3, 0.0);
        AnchorPane.setLeftAnchor(button3, 0.0);

        AnchorPane.setBottomAnchor(button4, 0.0);
        AnchorPane.setRightAnchor(button4, 0.0);

        Scene view = new Scene(layout);

        stage.setMinWidth(450);
        stage.setMinHeight(200);

        stage.setTitle("Meidän mahtava anchor demo");

        stage.setScene(view);
        stage.show();
    }
}