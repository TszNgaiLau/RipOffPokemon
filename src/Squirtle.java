import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Squirtle extends Pokemon{
    private BufferedImage image;

    private String[] attackNames;

    public Squirtle(int level) {
        super(level, 44,48,65,43,"src/images/Squirtle.png", new String[] {"Tackle", "Tail Whip", "Water Gun", "Withdraw"});
    }


    public void a1(Pokemon o) {
        o.losehealth(damage(o,40));;
    }

    public void a2(Pokemon o) {
        o.statusDecrease(1);
    }

    public void a3(Pokemon o) {
        o.losehealth(damage(o,40));
    }

    public void a4(Pokemon o) {
        o.losehealth(damage(o,60));
    }


}
