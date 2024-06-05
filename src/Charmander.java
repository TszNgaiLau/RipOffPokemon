import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Charmander extends Pokemon{
    private BufferedImage image;

    private String[] attackNames;

    public Charmander(int x, int y, int level) {
        String[] attackNames = new String[];
        super(x, y, level, "src/Charmander.png", attackNames);
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

    public String getAttack1() {
        return "Growl";
    }
    public String getAttack2() {
        return "Scratch";
    }
    public String getAttack3() {
        return "Ember";
    }
    public String getAttack4() {
        return "DragonBreath";
    }

}
