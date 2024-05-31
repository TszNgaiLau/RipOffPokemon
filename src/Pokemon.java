import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Pokemon {
    private int level;
    private int totalHealth;
    private int health;
    private int attack;
    private int defense;
    private int speed;

    private int xCoord;
    private int yCoord;
    private BufferedImage image;
    private String pathname;

    public Pokemon(int x, int y,int level, String pathname) {
        xCoord = x;
        yCoord = y;
        try {
            image = ImageIO.read(new File(pathname));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public int getxCoord() {
        return xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void losedefense(int n) {
        defense -= n;
    }
    public void gaindefense(int n) {
        defense += n;
    }

    public void losehealth(int n) {
        health -= n;
    }

    public void gainhealth(int n) {
        health += n;
    }
    public void gainSpeed(int n) {
        speed += n;
    }
    public void loseSpeed(int n) {
        speed -= n;
    }

    public void levelUp() {
        totalHealth += 5;
    }

    public int damage(Pokemon u, Pokemon o, int power) {
        int total = power;
        total /= o.defense;
        total += u.attack * level;
        return total;
    }

}