import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class EventB extends JFrame implements ActionListener {

  JPanel panelShouhin;

  JTextField textShouhin;

  JButton buttonOk;

  EventB() {
    setBounds(100, 100, 500, 300);

    setTitle("イベントB");

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container cont = getContentPane();

    cont.setLayout(new GridLayout(1, 1));

    textShouhin = new JTextField(10);

    buttonOk = new JButton("OK");

    buttonOk.addActionListener(this);//イベントを発生させる
    textShouhin.addActionListener(this);//イベントを発生させる

    panelShouhin = new JPanel();
//パネルにコンポーネント配置
    panelShouhin.add(textShouhin);
    panelShouhin.add(buttonOk);

    cont.add(panelShouhin);

    setVisible(true);
  }

  public void actionPerformed(ActionEvent ae) {
    Object obj = ae.getSource();

    if (obj == buttonOk) {
      JOptionPane.showMessageDialog(this, "OKが押されました");
    } else if (obj == textShouhin) {
      JOptionPane.showMessageDialog(this,"Enterが押されました");
    }
  }

  public static void main(String args[]) {
    EventB eventb = new EventB();
  }
}
