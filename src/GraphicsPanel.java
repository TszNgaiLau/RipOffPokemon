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
        addKeyListener(this);
        addMouseListener(this);
        setFocusable(true); // this line of code + one below makes this panel active for keylistener events
        requestFocusInWindow(); // see comment above
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);  // just do this

        g.drawImage(background, 0, 0, null);  // the order that things get "painted" matter; we put background down first

        // draw score
        g.setFont(new Font("Courier New", Font.BOLD, 24));
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

    }
}
