package org.example;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

// TODO: Huom tämä luokka on hbox luokan demo mutta nyt käyttää vboxia
public class HboxDemo extends Application {

    public void start(Stage stage) {
        VBox layout = new VBox();

        Button[] buttons = new Button[12];

        for (int i = 0; i < 12; i++) {
            buttons[i] = new Button("" + (i + 1));
            layout.getChildren().add(buttons[i]);
        }


        // alla vaihtoehtoiset ja yksinkertaisemmat tavat lisätä nappeja
        for (int i = 0; i < 12; i++) {
            Button button = new Button("" + (i + 1));
            layout.getChildren().add(button);
        }

        for (int i = 0; i < 12; i++) {
            layout.getChildren().add(new Button("" + (i + 1)));
        }

        Scene view = new Scene(layout);

        stage.setScene(view);
        stage.show();
    }
}
