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
    String strCmd = ae.getActionCommand();//イベントオブジェクトからボタンの文字列を取得

    int sindex = listShouhin.getSelectedIndex();//リストで選択されたインデックス番号を取得

    String svalue = (String) listShouhin.getSelectedValue();//リストで選択された値を取得

    if ("OK".equals(strCmd)) {
      JOptionPane.showMessageDialog(this,"インデックス番号" + sindex + "の" + svalue + "が選択されました。");
    }
  }

  public static void main(String args[]) {
    Lists lists = new Lists();
  }
}
