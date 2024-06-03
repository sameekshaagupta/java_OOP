import java.awt.*;
import javax.swing.*;
public class 31 {
  public static void main(String[] args) {
    JFrame frame = new JFrame("CardL");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 200);
    JPanel cardPanel = new JPanel(new CardLayout());
    JPanel panel1 = new JPanel();
    panel1.add(new JLabel("Sameeksha"));
    cardPanel.add(panel1, "panel1");
    JPanel panel2 = new JPanel();
    panel2.add(new JLabel("Gupta"));
    cardPanel.add(panel2, "panel2");
    JPanel panel3 = new JPanel();
    panel3.add(new JLabel("22BCP343"));
    cardPanel.add(panel3, "panel3");
    JButton prevButton = new JButton("Previous");
    JButton nextButton = new JButton("Next");
    prevButton.addActionListener(e -> {
      CardLayout layout = (CardLayout) cardPanel.getLayout();
      layout.previous(cardPanel);
    });
    nextButton.addActionListener(e -> {
      CardLayout layout = (CardLayout) cardPanel.getLayout();
      layout.next(cardPanel);
    });
    JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
    buttonPanel.add(prevButton);
    buttonPanel.add(nextButton);
    frame.add(cardPanel, BorderLayout.CENTER);
    frame.add(buttonPanel, BorderLayout.SOUTH);
    frame.setVisible(true);
  }