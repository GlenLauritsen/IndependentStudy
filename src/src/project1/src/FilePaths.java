package src.project1.src;

import java.io.InputStream;
import javafx.scene.image.Image;
import src.project1.P1Driver;

public class FilePaths {
    public static InputStream testSheet = P1Driver.class.getResourceAsStream("TerrainSprites.png");
    public static Image testImage = new Image(testSheet);
}
