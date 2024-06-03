import java.awt.*;
import javax.swing.*;
public class 30 {
  public static void main(String[] args) {
    JFrame frame = new JFrame("GridL");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel panel = new JPanel(new GridLayout(3, 3, 10, 10));
    JButton butt = new JButton("Sameeksha");
    panel.add(butt);
    JButton butt1 = new JButton("Gupta");
    panel.add(butt1);
    JButton butt2 = new JButton("22BCP343");
    panel.add(butt2);
    for (int i = 1; i <= 6; i++) {
      JButton button = new JButton("Button " + i);
      panel.add(button);
    }
    frame.getContentPane().add(panel);
    frame.setSize(400, 300);
    frame.setVisible(true);
  }
}