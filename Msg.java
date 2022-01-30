import java.awt.*;
import javax.swing.*;

class Msg extends JFrame {

  Msg() {
    setBounds(100, 100, 500, 300); //位置とサイズ

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//終了ボタン

    Container cont = getContentPane();

    cont.setLayout(new GridLayout(1, 1));//1行１列

    setVisible(true);

    JOptionPane.showMessageDialog(this,"表示完了");//メッセージダイアログ
  }

  public static void main(String args[]) {
    Msg msg = new Msg();
  }
}
