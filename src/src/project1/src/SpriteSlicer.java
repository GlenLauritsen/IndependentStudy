package src.project1.src;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import src.project1.P1Driver;

/**
 * This class will slice incoming images in order to prepare them for sprite rendering.
 * @author 2015 ProLaptop
 */
public class SpriteSlicer {
    
    public static BufferedImage testSheet = createSheet("Test.jpg");
    
    public static BufferedImage createSheet(String filePath) {
        BufferedImage image = null;
        try {
            image = ImageIO.read(P1Driver.class.getResourceAsStream(filePath));
            
        } catch (IOException ioe) {
            System.out.println("Error trying to collect a file at: " + filePath);
        }
        return image;
    }
    
    private static BufferedImage getSprite(int row, int col, int ss, BufferedImage sheet) {
        return sheet.getSubimage(row*ss, col*ss, ss, ss);
    }
}
