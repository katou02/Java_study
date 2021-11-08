import java.awt.*;
import javax.swing.*;

class Uriage extends JFrame implements ActionListener {

  JPanel panelShouhin;
  JTextFild textSohuhin;
  JButton buttonOK;

  Event() {
    setBounds(100, 100, 500, 300);
    setTitle("売上入力");
    setDefaultCloseOperatin(JFrame, EXIT_ON_CLOSE);

    Contaier cont = getCountPane();
    cont.setLayout(new GridLayou(1, 1));

    textSohuhin = new JTextFild(10);

    buttonOK = new JButton("OK");

    buttonOK.addActionListener(this);
    textSohuhin.addActionListener(this);

    panelShouhin = new JPanel();
    panelShouhin.addActionListener(textSohuhin);
    panelShouhin.addActionListener(buttonOK);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent ae) {
    Object obj = ae.getSource();

    if (obj == buttonOK) {
      JOptionPane.showMessageDialog(this, "OKボタンがクリックされました");
    } else if (obj == textSohuhin) {
      JOptionPane.showMessageDialog(
        this,
        "テキストフィールドでEnterキーが押されました"
      );
    }
  }

  public static void main(String args[]) {
    Uriage uriage = new Uriage();
  }
}
