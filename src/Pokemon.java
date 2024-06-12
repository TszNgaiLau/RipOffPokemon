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

    private String[] attackNames;

    public Pokemon(int level, int health, int attack, int defense, int speed,String pathname, String[] attackNames) {
        this.level = level;
        this.attackNames = attackNames;
        try {
            image = ImageIO.read(new File(pathname));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void setxCoord(int x) {
        xCoord = x;
    }
    public void setyCoord(int y) {
        yCoord = y;
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
    public void gainAttack(int n){
        attack += n;
    }
    public void loseAttack(int n) {
        attack -= n;
    }

    public void levelUp() {
        totalHealth += 5;
    }

    public int damage(Pokemon o, int power) {
        int total = power;
        total /= o.defense;
        total += this.attack * level;
        return total;
    }

    public int statusDecrease(int power) {
        return level + power;
    }

    public int statusIncrease(int power) {
        return level + power;
    }

    public String getAttack1() {
        return attackNames[0];
    }
    public String getAttack2() {
        return attackNames[1];
    }
    public String getAttack3() {
        return attackNames[2];
    }
    public String getAttack4() {
        return attackNames[3];
    }

}
