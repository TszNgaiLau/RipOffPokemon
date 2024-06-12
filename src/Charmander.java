import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Charmander extends Pokemon{
    private BufferedImage image;

    private String[] attackNames;

    public Charmander(int level) {
        super(level, 39,52,43,65,"src/images/Charmander.png", new String[] {"Growl", "Scratch", "Ember", "DragonBreath"});
    }


    public void a1(Pokemon o) {
        o.losedefense(1);
    }

    public void a2(Pokemon o) {
        o.losehealth(damage(o,40));
    }

    public void a3(Pokemon o) {
        o.losehealth(damage(o,40));
    }

    public void a4(Pokemon o) {
        o.losehealth(damage(o,60));
    }


}
