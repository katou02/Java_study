import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Lists extends JFrame implements ActionListener {

  JPanel panelShouhin;

  JList<String> listShouhin;

  JButton buttonOk;

  Lists() {
    setBounds(100, 100, 500, 300);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container cont = getContentPane();

    cont.setLayout(new GridLayout(1, 1));

    listShouhin = new JList<String>(h);

    buttonOk = new JButton("OK");

    buttonOk.addActionListener(this);

    panelShouhin = new JPanel();

    panelShouhin.add(listShouhin);
    panelShouhin.add(buttonOk);

    cont.add(panelShouhin);

    setVisible(true);
  }

  public void actionPerformed(ActionEvent ae) {
    String strCmd = ae.getActionCommand();

    int sindex = listShouhin.getSelectedIndex();

    String svalue = (String) listShouhin.getSelectedValue();

    if ("OK".equals(strCmd)) {
      JOptionPane.showMessageDialog(this, sindex + svalue);
    }
  }

  public static void main(String args[]) {
    Lists lists = new Lists();
  }
}
