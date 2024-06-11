import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Bulbasaur extends Pokemon{
    private BufferedImage image;

    private String[] attackNames;

    public Bulbasaur(int level) {
        super(level,1000,1000,1000,1000, "src/Bulbasaur.png", new String[] {"Growl", "Scratch", "Ember", "DragonBreath"});
    }

    public BufferedImage getImage() {
        return image;
    }

    public void Growl(Pokemon o) {
        o.losedefense(statusDecrease(1));
    }

    public void Tackle(Pokemon o) {
        o.losehealth(damage(o,40));
    }

    public void VineWhip(Pokemon o) {
        o.losehealth(damage(o,45));
    }

    public void Growth() {
        gainAttack(statusIncrease(1));
    }


}
