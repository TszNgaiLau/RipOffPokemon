import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class WelcomePanel extends JPanel implements ActionListener {

    private JTextField textField;
    private JButton submitButton;
    private JButton clearButton;
    private JFrame enclosingFrame;
    private BufferedImage intro;


    public WelcomePanel(JFrame frame) {
        textField = new JTextField(10);
        submitButton = new JButton("Submit");
        clearButton = new JButton("Clear");
        enclosingFrame = frame;
        add(textField);  // textField doesn't need a listener since nothing needs to happen when we type in text
        add(submitButton);
        add(clearButton);
        submitButton.addActionListener(this);
        clearButton.addActionListener(this);
//        try {
//            intro = ImageIO.read(new File("src/Intro.png"));
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(intro, 0, 0, null);
        g.setFont(new Font("Arial", Font.BOLD, 16));
        g.setColor(Color.RED);
        g.drawString("Please enter your name:", 50, 30);
        textField.setLocation(50, 50);
        submitButton.setLocation(50, 100);
        clearButton.setLocation(150, 100);
    }

    // ACTIONLISTENER INTERFACE METHODS
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton button = (JButton) e.getSource();
            if (button == submitButton) {
                String playerName = textField.getText();
                MainFrame f = new MainFrame(playerName);
                enclosingFrame.setVisible(false);
            } else {
                textField.setText("");
            }
        }
    }
}
