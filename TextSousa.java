import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TextSousa extends JFrame implements ActionListener {

  JPanel panelShouhin;

  JTextField textShouhin;

  JButton buttonSet, buttonGet;

  TextSousa() {
    setBounds(100, 100, 500, 300);

    setTitle("テキスト");

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container cont = getContentPane();

    cont.setLayout(new GridLayout(1, 1));

    textShouhin = new JTextField(15);

    buttonSet = new JButton("ボタンセット");
    buttonGet = new JButton("ボタン取得");

    buttonSet.addActionListener(this);
    buttonGet.addActionListener(this);

    panelShouhin = new JPanel();

    panelShouhin.add(textShouhin);
    panelShouhin.add(buttonSet);
    panelShouhin.add(buttonGet);

    cont.add(panelShouhin);

    setVisible(true);
  }

  public void actionPerformed(ActionEvent ae) {
    String strCmd = ae.getActionCommand();
  }

  public static void main(String args[]) {
    TextSousa texttousa = new TextSousa();
  }
}
