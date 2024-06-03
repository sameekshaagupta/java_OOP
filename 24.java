import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
public class 24 extends JFrame implements KeyListener {
  Container c;
  JTextArea ta;
  String str = "";
  Keyboard() {
    c = getContentPane();
    ta = new JTextArea("Sameeksha Gupta 22BCP343");
    ta.setFont(new Font("Arial", Font.BOLD, 30));
    c.add(ta);
    ta.addKeyListener(this);
  }
  public void keyTyped(KeyEvent ke) {}
  public void keyPressed(KeyEvent ke) {
    int keycode = ke.getKeyCode();
    if (keycode == KeyEvent.VK_F1)
      str += "F1 Key";
    if (keycode == KeyEvent.VK_F2)
      str += "F2 Key";
    if (keycode == KeyEvent.VK_F3)
      str += "F3 Key";
    if (keycode == KeyEvent.VK_F4)
      str += "F4 Key";
    if (keycode == KeyEvent.VK_F5)
      str += "F5 Key";
    if (keycode == KeyEvent.VK_F6)
      str += "F6 Key";
    if (keycode == KeyEvent.VK_F7)
      str += "F7 Key";
    if (keycode == KeyEvent.VK_F8)
      str += "F8 Key";
    if (keycode == KeyEvent.VK_F9)
      str += "F9 Key";
    if (keycode == KeyEvent.VK_F10)
      str += "F10 Key";
    if (keycode == KeyEvent.VK_F11)
      str += "F11 Key";
    if (keycode == KeyEvent.VK_F12)
      str += "F12 Key";
    if (keycode == KeyEvent.VK_PAGE_UP)
      str += "PAGE UP";
    if (keycode == KeyEvent.VK_PAGE_DOWN)
      str += "PAGE DOWN";
    if (keycode == KeyEvent.VK_1)
      str += "1";
    if (keycode == KeyEvent.VK_2)
      str += "2";
    if (keycode == KeyEvent.VK_3)
      str += "3";
    if (keycode == KeyEvent.VK_4)
      str += "4";
    if (keycode == KeyEvent.VK_5)
      str += "5";
    if (keycode == KeyEvent.VK_6)
      str += "6";
    if (keycode == KeyEvent.VK_7)
      str += "7";
    if (keycode == KeyEvent.VK_8)
      str += "8";
    if (keycode == KeyEvent.VK_9)
      str += "9";
    if (keycode == KeyEvent.VK_HOME)
      str += "HOME";
    if (keycode == KeyEvent.VK_END) str += "END";
    ta.setText(str);
    str = ""; // reset the String
  }
  public void keyReleased(KeyEvent ke) {}
  public static void main(String[] args) {
    Keyboard kbe = new Keyboard();
    kbe.setSize(400, 400);
    kbe.setVisible(true);
    kbe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}