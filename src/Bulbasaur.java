import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Bulbasaur extends Pokemon{
    private BufferedImage image;

    private String[] attackNames;

    public Bulbasaur(int x, int y, int level) {
        super(x, y, level, "src/Bulbasaur.png", new String[] {"Growl", "Scratch", "Ember", "DragonBreath"});
    }

    public BufferedImage getImage() {
        return image;
    }

    public void Growl(Pokemon o) {
        o.losedefense(statusDecrease(1));
    }

    public void Scratch(Pokemon o) {
        o.losehealth(damage(o,40));
    }

    public void Ember(Pokemon u, Pokemon o) {
        o.losehealth(damage(o,40));
    }

    public void DragonBreath(Pokemon u, Pokemon o) {
        o.losehealth(damage(o,60));
    }


}
