import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GraphicsPanel extends JPanel implements KeyListener, MouseListener, ActionListener {
    private BufferedImage background;

    private Player player;

    private boolean inBattle;
    private Blaziken blaziken;
    private JButton attack1;
    private JButton attack2;
    private JButton attack3;
    private JButton attack4;
    private Pokemon play;
    private Blaziken en;

    public GraphicsPanel(String name, String poke) {
        try {
            background = ImageIO.read(new File("src/images/BattleBackground.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        player = new Player(name);
        if (poke.equals("Charmander")) {
            player.setPokemon(new Charmander(1));
        } else if (poke.equals("Bulbasaur")) {
            player.setPokemon(new Bulbasaur(1));
        } else if (poke.equals("Squirtle")) {
            player.setPokemon(new Squirtle(1));
        }
        blaziken = new Blaziken();
        addKeyListener(this);
        addMouseListener(this);
        setFocusable(true);
        requestFocusInWindow();

        play = player.getPokemon();
        en = blaziken;
        attack1 = new JButton(play.getAttack1());
        attack2 = new JButton(play.getAttack2());
        attack3 = new JButton(play.getAttack3());
        attack4 = new JButton(play.getAttack4());
        add(attack1);
        add(attack2);
        add(attack3);
        add(attack4);
        attack1.addActionListener(this);
        attack2.addActionListener(this);
        attack3.addActionListener(this);
        attack4.addActionListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(background, 0, 0, null);
        g.drawImage(player.getPokemon().getImage(),player.getPokemon().getxCoord(),player.getPokemon().getyCoord(),null);
        g.drawImage(blaziken.getImage(), 700, 0, null);
        attack1.setLocation(50, 100);
        attack2.setLocation(150, 100);
        attack3.setLocation(50,200);
        attack4.setLocation(150,200);

        g.setFont(new Font("Arial", Font.BOLD, 50));
        g.setColor(Color.RED);

        if(player.getPokemon().getHealth() < 0) {
            g.drawString("You Lost!", 350,350);
        } else if (blaziken.getHealth() < 0) {
            g.drawString("You Won!",350,350);
        }
    }



    // ----- KeyListener interface methods -----
    public void keyTyped(KeyEvent e) { } // unimplemented

    public void keyPressed(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }

    // ----- MouseListener interface methods -----
    public void mouseClicked(MouseEvent e) { }  // unimplemented; if you move your mouse while clicking,
    // this method isn't called, so mouseReleased is best

    public void mousePressed(MouseEvent e) { } // unimplemented

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) { } // unimplemented

    public void mouseExited(MouseEvent e) { } // unimplemented

    // ACTIONLISTENER INTERFACE METHODS: used for buttons AND timers!
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton button = (JButton) e.getSource();
            if (button == attack1) {
                if (play instanceof Charmander) {
                    ((Charmander) play).a1(en);
                }
                if (play instanceof Bulbasaur) {
                    ((Bulbasaur) play).a1(en);
                }
                if (play instanceof Squirtle) {
                    ((Squirtle) play).a1((en));
                }
                en.DoubleKick(play);
            } else if (button == attack2) {
                if (play instanceof Charmander) {
                    ((Charmander) play).a2(en);
                }
                if (play instanceof Bulbasaur) {
                    ((Bulbasaur) play).a2(en);
                }
                if (play instanceof Squirtle) {
                    ((Squirtle) play).a2((en));
                }
                en.DoubleKick(play);
            } else if (button == attack3){
                if (play instanceof Charmander) {
                    ((Charmander) play).a3(en);
                }
                if (play instanceof Bulbasaur) {
                    ((Bulbasaur) play).a3(en);
                }
                if (play instanceof Squirtle) {
                    ((Squirtle) play).a3((en));
                }
                en.QuickAttack(play);
            } else if (button == attack4) {
                if (play instanceof Charmander) {
                    ((Charmander) play).a4(en);
                }
                if (play instanceof Bulbasaur) {
                    ((Bulbasaur) play).a4();
                }
                if (play instanceof Squirtle) {
                    ((Squirtle) play).a4((en));
                }
                en.Scratch(play);
            }
        }


    }
}
