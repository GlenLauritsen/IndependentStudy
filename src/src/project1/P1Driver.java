package src.project1;

import javafx.application.Application;
import javafx.stage.Stage;
import src.project1.gfx.P1MainStage;

/**
 * This project examines the overall efficency of different measures to extract and display
 * Sprites from a master SpriteSheet in JavaFX.
 * @author 2015 ProLaptop
 */
public class P1Driver extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage = P1MainStage.getInstance();
    }
}
