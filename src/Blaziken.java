import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Blaziken extends Pokemon{
    private BufferedImage image;

    public Blaziken(int x, int y, int level) {
        super(x, y, level, "src/Blaziken.png");
    }

    public BufferedImage getImage() {
        return image;
    }

    public void Growl(Pokemon o) {
        o.losedefense(1);
    }

    public void Scratch(Pokemon u, Pokemon o) {
        o.losehealth(damage(u,o,40));
    }

    public void Ember(Pokemon u, Pokemon o) {
        o.losehealth(damage(u,o,40));
    }

    public void DragonBreath(Pokemon u, Pokemon o) {
        o.losehealth(damage(u,o,60));
    }

}