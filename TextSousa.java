//�e�L�X�g�t�B�[���h�̒l

//�p�b�P�[�W�̃C���|�[�g
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class TextSousa extends JFrame implements ActionListener{

	JPanel panelShouhin;

	JTextField textShouhin;

	JButton buttonSet, buttonGet;
		
	TextSousa() {
	  setBounds(100, 100, 500, 300);

		setTitle("�������");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container cont = getContentPane();

		cont.setLayout(new GridLayout(1,1));

		textShouhin = new JTextField(15);

		buttonSet = new JButton("�Z�b�g");
		buttonGet = new JButton("�擾");

		buttonSet.addActionListener(this);
		buttonGet.addActionListener(this);

		panelShouhin = new JPanel();

		panelShouhin.add(textShouhin);
		panelShouhin.add(buttonSet);
		panelShouhin.add(buttonGet);

		cont.add(panelShouhin);		

		setVisible(true);		

	}

	//�C�x���g
	public void actionPerformed(ActionEvent ae) {

		//�C�x���g�I�u�W�F�N�g����{�^���̕�������擾
		String strCmd = ae.getActionCommand();
		
		//�{�^���u�\���v�������ꂽ�ꍇ
		if("�Z�b�g".equals(strCmd)) {
		  textShouhin.setText("�f�X�N�g�b�v�p�\�R��");
		}
		//�{�^���u�擾�v�������ꂽ�ꍇ
		else if ("�擾".equals(strCmd)){
		  JOptionPane.showMessageDialog(this, "�e�L�X�g�t�B�[���h�̓��e�F" + textShouhin.getText());
		}
	}
	
	//main���\�b�h
	public static void main(String args[]) {

		TextSousa texttousa = new TextSousa();
	}
}
