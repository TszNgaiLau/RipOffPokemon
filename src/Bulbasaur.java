import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Bulbasaur extends Pokemon{
    private BufferedImage image;

    private String[] attackNames;

    public Bulbasaur(int level) {
        super(level,10000,1000,1000,1000, "src/images/Bulbasaur.png", new String[] {"Growl", "Tackle", "Vine Whip", "Growth"});
    }


    public void a1(Pokemon o) {
        o.losedefense(statusDecrease(1));
    }

    public void a2(Pokemon o) {
        o.losehealth(damage(o,40));
    }

    public void a3(Pokemon o) {
        o.losehealth(damage(o,45));
    }

    public void a4() {
        gainAttack(statusIncrease(1));
    }


}
