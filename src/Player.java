import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Player {
    private int score;
    private String name;

    private Pokemon owned;

    public Player(String name) {
        this.name = name;
        score = 0;
    }
    public void setPokemon(Pokemon o) {
        owned = o;
        owned.setxCoord(50);
        owned.setyCoord(500);
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}
