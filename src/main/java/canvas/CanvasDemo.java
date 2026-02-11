package canvas;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CanvasDemo extends Application {
    @Override
    public void start(Stage stage) {
        Canvas canvas = new Canvas();

        canvas.setHeight(400);
        canvas.setWidth(400);

        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.DARKOLIVEGREEN);
        gc.fillOval(10, 10, 30, 30);

        gc.setFill(Color.FUCHSIA);
        gc.fillOval(120, 100, 20, 50);

        gc.moveTo(0, 0);
        gc.lineTo(20, 20);

        gc.moveTo(30, 30);
        gc.lineTo(120, 120);
        gc.stroke();        // this is needed to actually draw the line

        canvas.setFocusTraversable(true);
        canvas.setOnKeyPressed(event -> {
            KeyCode keyCode = event.getCode();
            System.out.println("Key pressed: " + keyCode);
        });

        canvas.setOnMouseClicked(event -> {
            double x = event.getX();
            double y = event.getY();

            gc.setFill(Color.FIREBRICK);
            gc.fillOval(x, y - 50, 50, 50);

            // kuvan piirtäminen
            Image image = new Image("kissa.jpeg");
            gc.drawImage(image, x, y, 50, 50);
        });

        canvas.setOnMouseMoved(event -> {
            double x = event.getX();
            double y = event.getY();

            gc.setFill(Color.ROYALBLUE);
            gc.fillOval(x, y, 5, 5);

            gc.clearRect(100, 100, 400, 400);

            Image image = new Image("kissa.jpeg");
            gc.drawImage(image, x, y, 50, 50);
        });

        canvas.setOnMouseDragged(event -> {
            double x = event.getX();
            double y = event.getY();

            gc.setFill(Color.ORANGE);
            gc.fillOval(x, y, 5, 5);
        });

        //BorderPane layout = new BorderPane(canvas);
        StackPane layout = new StackPane(canvas);

        Scene scene = new Scene(layout);

        // estetään ikkunan koon vaihtaminen
        stage.setResizable(false);

        stage.setScene(scene);
        stage.show();
    }
}
