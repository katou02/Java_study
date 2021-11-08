import java.awt.*;
import javax.swing.*;

class Shoshiki extends JFrame {

  JLabel labelShouhin;

  JTextField textShouhin;

  JButton buttonOk;

  JPanel panelShouhin;

  Shoshiki() {
    setBounds(100, 100, 500, 300);

    setTitle("書式");

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container cont = getContentPane();

    cont.setLayout(new GridLayout(1, 1));

    labelShouhin = new JLabel("書式");

    textShouhin = new JTextField(10);

    Font fontText = new Font("Serif", Font.BOLD, 20);

    textShouhin.setFont(fontText);

    textShouhin.setForeground(Color.RED);

    textShouhin.setBackground(Color.YELLOW);

    buttonOk = new JButton("OK");

    panelShouhin = new JPanel();

    panelShouhin.add(labelShouhin);
    panelShouhin.add(textShouhin);
    panelShouhin.add(buttonOk);

    cont.add(panelShouhin);

    setVisible(true);
  }

  public static void main(String args[]) {
    Shoshiki shoshiki = new Shoshiki();
  }
}
