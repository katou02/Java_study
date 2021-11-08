import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CheckBox extends JFrame implements ActionListener {

  JPanel panelShouhin;

  JButton buttonOk;

  JCheckBox checkShouhin;

  CheckBox() {
    setBounds(100, 100, 500, 300);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container cont = getContentPane();

    cont.setLayout(new GridLayout(1, 1));

    buttonOk = new JButton("OK");

    checkShouhin = new JCheckBox("A");

    buttonOk.addActionListener(this);

    panelShouhin = new JPanel();

    panelShouhin.add(checkShouhin);
    panelShouhin.add(buttonOk);

    cont.add(panelShouhin);

    setVisible(true);
  }

  public void actionPerformed(ActionEvent ae) {
    String strCmd = ae.getActionCommand();

    if ("OK".equals(strCmd)) {
      if (checkShouhin.isSelected()) {
        JOptionPane.showMessageDialog(
          this
        );
      } else {
        JOptionPane.showMessageDialog(
          this
        );
      }
    }
  }

  public static void main(String args[]) {
    CheckBox checkBox = new CheckBox();
  }
}
