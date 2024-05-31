import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Charmander extends Pokemon{
    private BufferedImage image;

    public Charmander(int x, int y, int level) {
        super(x, y, level, "src/Charmander.png");
    }

    public BufferedImage getImage() {
        return image;
    }

    public void Growl(Pokemon o) {
        o.losedefense(1);
    }

    public void Scratch(Pokemon u, Pokemon o) {
        int n =
        o.losehealth();
    }

}
