//テキストフィールドの値

//パッケージのインポート
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class TextSousa extends JFrame implements ActionListener{

	JPanel panelShouhin;

	JTextField textShouhin;

	JButton buttonSet, buttonGet;
		
	TextSousa() {
	  setBounds(100, 100, 500, 300);

		setTitle("売上入力");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container cont = getContentPane();

		cont.setLayout(new GridLayout(1,1));

		textShouhin = new JTextField(15);

		buttonSet = new JButton("セット");
		buttonGet = new JButton("取得");

		buttonSet.addActionListener(this);
		buttonGet.addActionListener(this);

		panelShouhin = new JPanel();

		panelShouhin.add(textShouhin);
		panelShouhin.add(buttonSet);
		panelShouhin.add(buttonGet);

		cont.add(panelShouhin);		

		setVisible(true);		

	}

	//イベント
	public void actionPerformed(ActionEvent ae) {

		//イベントオブジェクトからボタンの文字列を取得
		String strCmd = ae.getActionCommand();
		
		//ボタン「表示」が押された場合
		if("セット".equals(strCmd)) {
		  textShouhin.setText("デスクトップパソコン");
		}
		//ボタン「取得」が押された場合
		else if ("取得".equals(strCmd)){
		  JOptionPane.showMessageDialog(this, "テキストフィールドの内容：" + textShouhin.getText());
		}
	}
	
	//mainメソッド
	public static void main(String args[]) {

		TextSousa texttousa = new TextSousa();
	}
}
