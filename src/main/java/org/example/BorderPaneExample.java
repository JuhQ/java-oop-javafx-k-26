package org.example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneExample extends Application {

    @Override
    public void start(Stage stage) {
        BorderPane layout = new BorderPane();

        Button topButton = new Button("NORTH");
        Button rightButton = new Button("EAST");
        Button bottomButton = new Button("SOUTH");
        Button leftButton = new Button("WEST");
        Button centerButton = new Button("CENTER");

        layout.setTop(topButton);
        layout.setRight(rightButton);
        layout.setBottom(bottomButton);
        layout.setLeft(leftButton);
        layout.setCenter(centerButton);

        layout.setAlignment(topButton, Pos.CENTER);


        // tässä yliajetaan aikaisempi setTop() määritys
        //layout.setTop(new Button("Keskelle?"));

        // instanssi voidaan lisätä käyttöliittymään vain kerran
        // aiheuttaa virheen:  Children: duplicate children added
        // layout.setRight(leftButton);

        Scene view = new Scene(layout);

        stage.setWidth(600);
        stage.setHeight(600);
        stage.setMinHeight(400);
        stage.setMinWidth(400);
        stage.setScene(view);
        stage.show();
    }


}