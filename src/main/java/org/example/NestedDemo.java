package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
        import javafx.stage.Stage;
import javafx.scene.control.Label;

public class NestedDemo extends Application {

    public void start(Stage stage) {
        BorderPane layout = new BorderPane();

        HBox top = new HBox();
        top.getChildren().add(new Button("File"));
        top.getChildren().add(new Button("Edit"));
        top.getChildren().add(new Button("View"));
        layout.setTop(top);

        VBox left = new VBox();
        left.getChildren().add(new Button("A"));
        left.getChildren().add(new Button("B"));
        left.getChildren().add(new Button("C"));
        layout.setLeft(left);

        StackPane center = new StackPane();
        center.getChildren().add(new Button("CLICK!"));
        layout.setCenter(center);

        Scene view = new Scene(layout);

        stage.setScene(view);
        stage.show();
    }
}