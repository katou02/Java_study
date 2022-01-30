import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class EventA extends JFrame implements ActionListener {

  JPanel panelShouhin;

  JButton buttonOk, buttonCancel;

  EventA() {
    setBounds(100, 100, 500, 300);//位置とサイズ

    setTitle("イベント");

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//終了ボタン

    Container cont = getContentPane();

    cont.setLayout(new GridLayout(1, 1));//1行1列

    buttonOk = new JButton("OK");//OKボタン

    buttonCancel = new JButton("イベント");//イベントボタン

    buttonOk.addActionListener(this);//クリックするとイベントが発生するように設定
    buttonCancel.addActionListener(this);//クリックするとイベントが発生するように設定

    panelShouhin = new JPanel();

    panelShouhin.add(buttonOk);
    panelShouhin.add(buttonCancel);

    cont.add(panelShouhin);

    setVisible(true);
  }

  public void actionPerformed(ActionEvent ae) {//クリックされた時
    String strCmd = ae.getActionCommand();
    
    if("OK".equals(strCmd)) {
      JOptionPane.showMessageDialog(this, strCmd + "がクリックされました");
    }
    else if("キャンセル".equals(strCmd)) {
      JOptionPane.showMessageDialog(this, strCmd + "がクリックされました");
    }
  }

  public static void main(String args[]) {
    EventA eventa = new EventA();
  }
}
