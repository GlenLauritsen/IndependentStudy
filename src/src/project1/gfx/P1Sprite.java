package src.project1.gfx;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class P1Sprite extends ImageView {

    private int xCord;
    private int yCord;

    private int xSize;
    private int ySize;
    
    private Image image;
    
    public P1Sprite(int xCord, int yCord, int xSize, int ySize, Image image) {
        this.xCord = xCord;
        this.yCord = yCord;
        
        this.xSize = xSize;
        this.ySize = ySize;
        
        this.image = image;
        init();
    }
    
    private void init() {
        setImage(image);
        setViewport(new Rectangle2D(xCord, yCord, xSize, ySize));
    }
    
}
