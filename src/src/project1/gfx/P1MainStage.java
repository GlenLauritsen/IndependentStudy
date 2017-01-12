package src.project1.gfx;

import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class P1MainStage extends Stage {
    
    private static P1MainStage instance;
    
    private GridPane root;
    
    public P1MainStage() {
        init();
    }
    
    private void init() {
        root = new GridPane();
        root.setPrefSize(500, 500);
        
        root.add(P1ImageView.getInstance(), 0, 0);
        
        setScene(new Scene(root));
        
        show();
    }
    
    public static P1MainStage getInstance() {
        return instance == null ? instance = new P1MainStage() : instance;
    }
    
}
