import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TextArea extends JFrame implements ActionListener {

  JPanel panelShouhin;

  JTextArea jtextShuukei;

  JButton buttonSet, buttonAppend, buttonGet;

  TextArea() {
    setBounds(100, 100, 600, 300);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container cont = getContentPane();

    cont.setLayout(new GridLayout(1, 1));

    jtextShuukei = new JTextArea(5, 20);

    JScrollPane scrollpane = new JScrollPane(jtextShuukei);

    buttonSet = new JButton("ボタン1");
    buttonAppend = new JButton("ボタン2");
    buttonGet = new JButton("ボタン3");

    buttonSet.addActionListener(this);
    buttonAppend.addActionListener(this);
    buttonGet.addActionListener(this);

    panelShouhin = new JPanel();

    panelShouhin.add(scrollpane);
    panelShouhin.add(buttonSet);
    panelShouhin.add(buttonAppend);
    panelShouhin.add(buttonGet);

    cont.add(panelShouhin);

    setVisible(true);
  }

  public static void main(String args[]) {
    TextArea textarea = new TextArea();
  }
}
