import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Lists extends JFrame implements ActionListener{

  JPanel panelShouhin;

  JList<int> listShouhin;

  JButton buttonOk;	

  Lists() {
		
	setBounds(100, 100, 500, 300);
		
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	Container cont = getContentPane();
		
	cont.setLayout(new GridLayout(1,1));
		
	int[] h = {1,2,3};

	listShouhin = new JList<int>(h);

	buttonOk = new JButton("OK");

    buttonOk.addActionListener(this);

	panelShouhin = new JPanel();
	
	panelShouhin.add(listShouhin);

	panelShouhin.add(buttonOk);

	cont.add(panelShouhin);		

	setVisible(true);		

  }

  public void actionPerformed(ActionEvent ae) {

	String strCmd = ae.getActionCommand();

	
	int sindex = listShouhin.getSelectedIndex();

	
	String svalue = (String)listShouhin.getSelectedValue();

	if("OK".equals(strCmd)) {
    
	  JOptionPane.showMessageDialog(this,sindex +  svalue);

	}
		
  }
	
  public static void main(String args[]) {

    Lists lists = new Lists();
  }
}