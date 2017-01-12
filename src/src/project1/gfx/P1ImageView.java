package src.project1.gfx;

import javafx.scene.layout.GridPane;

public class P1ImageView extends GridPane {
    
    private static P1ImageView instance;
    
    public P1ImageView() {
        init();
    }
    
    private void init() {
        setPrefSize(64, 64);
        setStyle("-fx-background-color: black");
    }
    
    public static P1ImageView getInstance() {
        return instance == null ? instance = new P1ImageView() : instance;
    }
    
}
