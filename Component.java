import java.awt.*;
import javax.swing.*;

class Component extends JFrame {

  JLabel labelShouhin;

  JTextField textShouhin;

  JButton buttonOk;

  JPanel panelShouhin;

  Component() {
    setBounds(100, 100, 500, 300); //位置とサイズ

    setTitle("売上入力"); //タイトル

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //閉じるボタン

    Container cont = getContentPane();

    cont.setLayout(new GridLayout(1, 1)); //1行1列

    labelShouhin = new JLabel("商品名"); //ラベル

    textShouhin = new JTextField(10); //テキストフィールド 10文字まで

    buttonOk = new JButton("OK"); //ボタン

    panelShouhin = new JPanel(); //パネルの作成

    panelShouhin.add(labelShouhin); //商品名
    panelShouhin.add(textShouhin); //入力した文字
    panelShouhin.add(buttonOk);//ボタン

    cont.add(panelShouhin);

    setVisible(true);//画面に表示
  }

  public static void main(String args[]) {
    Component component = new Component();
  }
}
