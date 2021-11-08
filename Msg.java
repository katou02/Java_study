import java.awt.*;
import javax.swing.*;

class Msg extends JFrame {

  Msg() {
    setBounds(100, 100, 500, 300);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container cont = getContentPane();

    cont.setLayout(new GridLayout(1, 1));

    setVisible(true);

    JOptionPane.showMessageDialog(this);
  }

  public static void main(String args[]) {
    Msg msg = new Msg();
  }
}
