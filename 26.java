import javax.swing.*;
public class 26 {
  public static void main(String[] args) {
    JTextField nameField = new JTextField(10);
    JTextField ageField = new JTextField(5);
    JTextField courseField = new JTextField(10);
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
    panel.add(new JLabel("Name:"));
    panel.add(nameField);
    panel.add(new JLabel("Age:"));
    panel.add(ageField);
    panel.add(new JLabel("Course:"));
    panel.add(courseField);
    int result = JOptionPane.showConfirmDialog(null, panel, "Enter Student Information", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
    if (result == JOptionPane.OK_OPTION) {
      String name = nameField.getText();
      int age = Integer.parseInt(ageField.getText());
      String course = courseField.getText();
      JOptionPane.showMessageDialog(null, "Student Information\nName: " + name + "\nAge: " + age + "\nCourse: " + course);
    }
  }
}