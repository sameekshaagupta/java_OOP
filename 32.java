import javax.swing.*;
public class 32 {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Group");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel nameLabel = new JLabel("Name:");
    JTextField nameField = new JTextField(20);
    JLabel ageLabel = new JLabel("Age:");
    JTextField ageField = new JTextField(5);
    GroupLayout layout = new GroupLayout(frame.getContentPane());
    frame.setLayout(layout);
    layout.setAutoCreateGaps(true);
    layout.setAutoCreateContainerGaps(true);
    GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();
    hGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(nameLabel).addComponent(ageLabel));
    hGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(nameField).addComponent(ageField));
    layout.setHorizontalGroup(hGroup);
    GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();
    vGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(nameLabel).addComponent(nameField));
    vGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(ageLabel).addComponent(ageField));
    layout.setVerticalGroup(vGroup);
    frame.pack();
    frame.setVisible(true);
  }
}
}