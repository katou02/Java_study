import java.awt.*;
import javax.swing.*;

class Gamen extends JFrame {

  Gamen() {
    setBounds(100, 100, 500, 300);

    setTitle("画面");

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container cont = getContentPane();

    cont.setLayout(new GridLayout(3, 1));

    setVisible(true);
  }

  public static void main(String args[]) {
    Gamen gamen = new Gamen();
  }
}
