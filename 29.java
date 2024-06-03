import java.awt.*;
import javax.swing.*;
public class 29 {
  public static void main(String[] args) {
    JFrame frame = new JFrame("BorderL");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 300);
    JButton btnNorth = new JButton("North");
    JButton btnSouth = new JButton("South");
    JButton btnEast = new JButton("East");
    JButton btnWest = new JButton("West");
    JButton btnCenter = new JButton("Sameeksha Gupta 22BCP343");
    frame.setLayout(new BorderLayout());
    frame.add(btnNorth, BorderLayout.NORTH);
    frame.add(btnSouth, BorderLayout.SOUTH);
    frame.add(btnEast, BorderLayout.EAST);
    frame.add(btnWest, BorderLayout.WEST);
    frame.add(btnCenter, BorderLayout.CENTER);
    frame.setVisible(true);
  }
}