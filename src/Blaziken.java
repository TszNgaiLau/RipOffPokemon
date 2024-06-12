import java.awt.image.BufferedImage;

public class Blaziken extends Pokemon{
    private BufferedImage image;

    public Blaziken() {
        super(20, 80,40,70,80,"src/images/Blaziken.png",new String[] {"Double Kick", "Growl", "QuickAttack", "Scratch"});
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