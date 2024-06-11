import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BattleOptions extends JPanel implements ActionListener {

    private JTextField textField;
    private JButton attack1;
    private JButton attack2;
    private JButton attack3;
    private JButton attack4;
    private JFrame enclosingFrame;
    private Player poke;

    public BattleOptions(JFrame frame, Pokemon o) {
        enclosingFrame = frame;
        textField = new JTextField(10);
        attack1 = new JButton(o.getAttack1());
        attack2 = new JButton(o.getAttack2());
        attack3 = new JButton(o.getAttack3());
        attack4 = new JButton(o.getAttack4());
        add(textField);  // textField doesn't need a listener since nothing needs to happen when we type in text
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
        attack1.setLocation(50, 100);
        attack2.setLocation(150, 100);
        attack3.setLocation(50,200);
        attack4.setLocation(50,200);
    }

    // ACTIONLISTENER INTERFACE METHODS
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton button = (JButton) e.getSource();
            if (button == attack1) {

                enclosingFrame.setVisible(false);
            } else {
                textField.setText("");
            }
        }
    }
}
