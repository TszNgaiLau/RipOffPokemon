import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Charizard extends Pokemon{
    private BufferedImage image;

    public Charizard() {
        super(20, 80,120,70,80,"src/Blaziken.png",new String[] {"Double Kick", "Growl", "QuickAttack", "Scratch"});
    }


    public void DoubleKick(Pokemon o) {
        o.losehealth(damage(o,30));
    }

    public void Growl(Pokemon o) {
        o.statusDecrease(1);
    }

    public void QuickAttack(Pokemon o) {
        o.losehealth(damage(o,40));
    }

    public void Scratch(Pokemon o) {
        o.losehealth(damage(o,40));
    }

}