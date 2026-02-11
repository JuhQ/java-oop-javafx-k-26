package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneExample extends Application {

    @Override
    public void start(Stage stage) {
        GridPane layout = new GridPane();

        Button button1 = new Button("TOP LEFT");
        Button button2 = new Button("TOP RIGHT rowindex 1");
        Button button3 = new Button("BOTTOM LEFT");
        Button button4 = new Button("BOTTOM RIGHT");
        Button button5 = new Button("MIDDLE (with long text)");

        // TODO: korjaa column indexit ja row indexit koska napit menee päällekkäin
        layout.add(button1, 1, 0);
        layout.add(button2, 0, 0);
        layout.add(button3, 0, 0);
        layout.add(button4, 1, 1);
        layout.add(button5, 0, 5, 1, 1);

        Scene view = new Scene(layout);

        stage.setScene(view);
        stage.show();
    }
}