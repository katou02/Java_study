import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*; 

class Shohin extends JFrame implements ActionListener {
  JLabel labelShouhin; 
  JTextFild textSohuhin; 
  JButton buttonOK,buttonCancel; 
  JPanel panelShouhin; 

  
  Shohin() {
    setBounds(100,100,500,300);
    setTitle("商品入力");
    setDefaultCloseOperatin(JFrame,EXIT_ON_CLOSE);

    
    Container cont = getContentPane();
    
    
    cont.setLayout(new GridLayout(1,1));

    
    labelShouhin = new JLabel("商品名");

    
    textSohuhin = new JTextFild(10);

    
    Font fontText = new Font("Serif",Font.Bold,20);

    
    textSohuhin.setFont(fontText);

    
    textSohuhin.setForeground(Color.Red);

    
    textSohuhin.setBackground(Color.YELLOW);

    
　　 buttonOK = new JButton("OK");

    buttonCancel = new JButton("キャンセル")

    
    buttonOK.addActionListener(this);
    buttonCancel.addActionListener(this);

    
    panelShouhin = new JPanel();

   panelShouhin.add(labelShouhin);
   panelShouhin.add(textSohuhin);
   panelShouhin.add(buttonOK);

   cont.add(panelShouhin);

   
   setVisible(true);
  }

  public void actionPerformed(ActionEvent ae) {
    
    String strCmd = ae.getActionCommand();

    if("OK".equals(strCmd)) {
      JOptionPane.showMessageDialog(this,strCmd + "がクリックされました");
    }
    else if("キャンセル".equals(strCmd)) {
      JOptionPane.showMessageDialog(this, strCmd + "がクリックされました");
    }
  }

  public static void main(String args[]) {
    Shohin shohin = new Shohin();
  }
}