import java.awt.*;
import javax.swing.*;

class Component extends JFrame {

  JLabel labelShouhin;

  JTextField textShouhin;

  JButton buttonOk;

  JPanel panelShouhin;

  Component() {
    setBounds(100, 100, 500, 300);

    setTitle("コンポーネント");

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container cont = getContentPane();

    cont.setLayout(new GridLayout(1, 1));

    labelShouhin = new JLabel("コンポーネント");

    textShouhin = new JTextField(10);

    buttonOk = new JButton("OK");

    panelShouhin = new JPanel();

    panelShouhin.add(labelShouhin);
    panelShouhin.add(textShouhin);
    panelShouhin.add(buttonOk);

    cont.add(panelShouhin);

    setVisible(true);
  }

  public static void main(String args[]) {
    Component component = new Component();
  }
}
