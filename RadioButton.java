import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class RadioButton extends JFrame implements ActionListener {

  JPanel panelShouhin;

  JButton buttonOk;

  ButtonGroup bg;

  JRadioButton rb1, rb2;

  RadioButton() {
    setBounds(100, 100, 500, 300);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container cont = getContentPane();

    cont.setLayout(new GridLayout(1, 1));

    buttonOk = new JButton("OK");

    rb1 = new JRadioButton("ボタン1", true);
    rb2 = new JRadioButton("ボタン2");

    bg = new ButtonGroup();

    bg.add(rb1);
    bg.add(rb2);

    buttonOk.addActionListener(this);

    panelShouhin = new JPanel();

    panelShouhin.add(rb1);
    panelShouhin.add(rb2);
    panelShouhin.add(buttonOk);

    cont.add(panelShouhin);

    setVisible(true);
  }

  public void actionPerformed(ActionEvent ae) {
    String strCmd = ae.getActionCommand();//イベントオブジェクトからボタンの文字列を取得

    if ("OK".equals(strCmd)) {
      //一つ目のラジオボタンにチェックが入っている場合
      if (rb1.isSelected()) {
        JOptionPane.showMessageDialog(this,"会社員にチェックが入っています。");
      } else {
        JOptionPane.showMessageDialog(this,"学生にチェックが入っています。");
      }
    }
  }

  public static void main(String args[]) {
    RadioButton radiobutton = new RadioButton();
  }
}
