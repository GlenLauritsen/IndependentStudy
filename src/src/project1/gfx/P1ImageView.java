package src.project1.gfx;

import javafx.scene.layout.GridPane;
import src.project1.src.FilePaths;

public class P1ImageView extends GridPane {

    private static P1ImageView instance;

    public P1ImageView() {
        init();
    }

    private void init() {
        setPrefSize(256, 256);
        setStyle("-fx-background-color: black");
        
//        Image image = new Image(FilePaths.testSheet);
//        
//        ImageView iv = new ImageView(image);
//        iv.setViewport(new Rectangle2D(0,0,64,64));
//        add(iv, 0, 0);
//        ImageView iv2 = new ImageView(image);
//        iv2.setViewport(new Rectangle2D(0,0,64,64));
//        add(iv2, 1, 0);
        
        /*
        *   NOTE: image must be static within the program in order to be shared.
        *   There appears to be no way to create multiple images of the same image
        *   and reuse the image throughout
        *
        */        
//        P1Sprite one = new P1Sprite(0,0,64,64,FilePaths.testImage);
//        P1Sprite two = new P1Sprite(64,0,64,64,FilePaths.testImage);
//        
//        add(one.getImage(), 0,0);
//        add(two.getImage(), 0,1);
        
        add(new P1Sprite(0,0,64,64,FilePaths.testImage), 0,0);
        add(new P1Sprite(0,0,64,64,FilePaths.testImage), 1,0);
    }

    public static P1ImageView getInstance() {
        return instance == null ? instance = new P1ImageView() : instance;
    }

}
