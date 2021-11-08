import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class EventA extends JFrame implements ActionListener {

  JPanel panelShouhin;

  JButton buttonOk, buttonCancel;

  EventA() {
    setBounds(100, 100, 500, 300);

    setTitle("イベント");

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container cont = getContentPane();

    cont.setLayout(new GridLayout(1, 1));

    buttonOk = new JButton("OK");

    buttonCancel = new JButton("イベント");

    buttonOk.addActionListener(this);
    buttonCancel.addActionListener(this);

    panelShouhin = new JPanel();

    panelShouhin.add(buttonOk);
    panelShouhin.add(buttonCancel);

    cont.add(panelShouhin);

    setVisible(true);
  }

  public void actionPerformed(ActionEvent ae) {
    String strCmd = ae.getActionCommand();

    JOptionPane.showMessageDialog(this, strCmd);
  }

  public static void main(String args[]) {
    EventA eventa = new EventA();
  }
}
