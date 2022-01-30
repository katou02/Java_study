import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TextArea extends JFrame implements ActionListener {

  JPanel panelShouhin;

  JTextArea jtextShuukei;

  JButton buttonSet, buttonAppend, buttonGet;

  TextArea() {
    setBounds(100, 100, 600, 300);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container cont = getContentPane();

    cont.setLayout(new GridLayout(1, 1));

    jtextShuukei = new JTextArea(5, 20);

    JScrollPane scrollpane = new JScrollPane(jtextShuukei);

    buttonSet = new JButton("ボタン1");
    buttonAppend = new JButton("ボタン2");
    buttonGet = new JButton("ボタン3");

    buttonSet.addActionListener(this);
    buttonAppend.addActionListener(this);
    buttonGet.addActionListener(this);

    panelShouhin = new JPanel();

    panelShouhin.add(scrollpane);
    panelShouhin.add(buttonSet);
    panelShouhin.add(buttonAppend);
    panelShouhin.add(buttonGet);

    cont.add(panelShouhin);

    setVisible(true);
  }

  	//イベント
	public void actionPerformed(ActionEvent ae) {

		//イベントオブジェクトからボタンの文字列を取得
		String strCmd = ae.getActionCommand();

		//ボタン「セット」が押された場合
		if("セット".equals(strCmd)) {
		//テキストエリアにセットする
		  jtextShuukei.setText("デスクトップパソコン\n");
		}
		//ボタン「追記」が押された場合
		else if ("追記".equals(strCmd)){
		//テキストエリアに追記する
		  jtextShuukei.append("プリンタ\n");	
		}
		//ボタン「取得」が押された場合
		else if ("取得".equals(strCmd)){
		  JOptionPane.showMessageDialog(this, jtextShuukei.getText());
		}
	}
	
	//mainメソッド
	public static void main(String args[]) {
		TextArea textarea = new TextArea();
	}
}

