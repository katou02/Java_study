import java.awt.*;
import javax.swing.*;

class Shoshiki extends JFrame {

  JLabel labelShouhin;

  JTextField textShouhin;

  JButton buttonOk;

  JPanel panelShouhin;

  Shoshiki() {
    setBounds(100, 100, 500, 300);//位置とサイズ

    setTitle("書式");//タイトル

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//終了ボタン

    Container cont = getContentPane();

    cont.setLayout(new GridLayout(1, 1));//1行1列

    labelShouhin = new JLabel("商品名");//ラベル

    textShouhin = new JTextField(10);//テキストフィールド

    Font fontText = new Font("Serif", Font.BOLD, 20); //フォントボールド サイズは20

    textShouhin.setFont(fontText);//テキストフィールドにフォントを設定

    textShouhin.setForeground(Color.RED); //テキストの色

    textShouhin.setBackground(Color.YELLOW); //背景色

    buttonOk = new JButton("OK");//OKボタン

    panelShouhin = new JPanel();
//パネルの表示
    panelShouhin.add(labelShouhin);
    panelShouhin.add(textShouhin);
    panelShouhin.add(buttonOk);

    cont.add(panelShouhin);

    setVisible(true);
  }

  public static void main(String args[]) {
    Shoshiki shoshiki = new Shoshiki();
  }
}
