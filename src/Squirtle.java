import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Squirtle extends Pokemon{
    private BufferedImage image;

    private String[] attackNames;

    public Squirtle(int level) {
        super(level, 39,52,43,65,"src/images/Squirtle.png", new String[] {"Growl", "Scratch", "Ember", "DragonBreath"});
    }

    public BufferedImage getImage() {
        return image;
    }

    public void Growl(Pokemon o) {
        o.losedefense(1);
    }

    public void Scratch(Pokemon o) {
        o.losehealth(damage(o,40));
    }

    public void Ember(Pokemon o) {
        o.losehealth(damage(o,40));
    }

    public void DragonBreath(Pokemon o) {
        o.losehealth(damage(o,60));
    }


}
