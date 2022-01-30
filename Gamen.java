import java.awt.*;
import javax.swing.*;

class Gamen extends JFrame {

  Gamen() {
    setBounds(100, 100, 500, 300); //位置とサイズ

    setTitle("画面"); //タイトル

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //閉じるボタンで終了

    Container cont = getContentPane(); //コンテナを作成

    cont.setLayout(new GridLayout(3, 1)); //3行1列のグリッドレイアウト

    setVisible(true); //画面に表示
  }

  public static void main(String args[]) {
    Gamen gamen = new Gamen();
  }
}
