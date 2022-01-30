import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Combo extends JFrame implements ActionListener {

  JPanel panelShouhin;

  JComboBox<String> comboShouhin;

  JButton buttonOk;

  Combo() {
    setBounds(100, 100, 500, 300);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container cont = getContentPane();

    cont.setLayout(new GridLayout(1, 1));

    comboShouhin = new JComboBox<String>(h);

    buttonOk = new JButton("OK");

    buttonOk.addActionListener(this);

    panelShouhin = new JPanel();

    panelShouhin.add(comboShouhin);
    panelShouhin.add(buttonOk);

    cont.add(panelShouhin);

    setVisible(true);
  }

  public void actionPerformed(ActionEvent ae) {
    String strCmd = ae.getActionCommand();//イベントオブジェクトからボタンの文字列を取得

    int sindex = comboShouhin.getSelectedIndex();//コンボボックスで選択されたインデックス番号を取得

    String svalue = (String) comboShouhin.getSelectedItem();//コンボボックスで選択された値を取得

    if ("OK".equals(strCmd)) {
      JOptionPane.showMessageDialog(this,"インデックス番号" + sindex + "の" + svalue + "が選択されました。");
    }
  }

  public static void main(String args[]) {
    Combo combo = new Combo();
  }
}
