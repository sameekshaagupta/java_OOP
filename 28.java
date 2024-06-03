import java.awt.*;
import javax.swing.*;
public class 28 {
  public static void main(String[] args) {
    JFrame frame = new JFrame("FlowL");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel panel = new JPanel(new FlowLayout());
    panel.add(new JButton("Sameeksha"));
    panel.add(new JButton("Gupta"));
    panel.add(new JButton("22BCP343"));
    panel.add(new JButton("Div-5"));
    panel.add(new JButton("Group-9"));
    frame.add(panel);
    frame.setSize(300, 200);
    frame.setVisible(true);
  }
}