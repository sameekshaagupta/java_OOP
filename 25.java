import javax.swing.*;
public class 25 {
  JMenu menu, submenu;
  JMenuItem i1, i2, i3, i4, i5;
  Menu() {
    JFrame f = new JFrame("Menu and MenuItem Example");
    JMenuBar mb = new JMenuBar();
    menu = new JMenu("View");
    submenu = new JMenu("Modes");
    i1 = new JMenuItem("Full Screen");
    i2 = new JMenuItem("Windowed");
    i3 = new JMenuItem("Minimise");
    i4 = new JMenuItem("Pin");
    i5 = new JMenuItem("Sameeksha Gupta 22BCP343");
    menu.add(i1);
    menu.add(i2);
    menu.add(i3);
    submenu.add(i4);
    submenu.add(i5);
    menu.add(submenu);
    mb.add(menu);
    f.setJMenuBar(mb);
    f.setSize(500, 500);
    f.setLayout(null);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  public static void main(String[] args) {
    new Menu();
  }
}