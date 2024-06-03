import javax.swing.*;
public class 33 {
  public static void main(String[] args) {
    JFrame frame = new JFrame("BoxL");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 200);
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    panel.add(new JButton("Sameeksha"));
    panel.add(new JButton("Gupta"));
    panel.add(new JButton("22BCP343"));
    panel.add(new JButton("Button 4"));
    panel.add(new JButton("Button 5"));
    frame.add(panel);
    frame.setVisible(true);
  }
}