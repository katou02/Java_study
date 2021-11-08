��import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.text.*;
import javax.swing.*;

class AppInput extends JFrame implements ActionListener {

  JPanel panelTitle, panelHanbaibi, panelItem, panelKosuu, panelButton;
  JLabel labelTitle, labelHanbaibi, labelItem, labelKosuu;
  JTextField textHanbaibi, textItem, textKosuu;
  JButton buttonAdd, buttonClear;

  AppInput({
    setTitle("タイトル");
    setBounds(100, 100, 500, 300);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container container = getContentPane();

    container.setLayout(new GridLayout(5, 1));

    panelTitle = new JPanel();

    labelTitle = new JLabel("テスト1");

    Font fontTitle = new Font("Serif", Font.BOLD, 20);

    labelTitle.setFont(fontTitle);

    panelTitle.add(labelTitle);

    panelHanbaibi = new JPanel();

    labelHanbaibi = new JLabel("2021/11/12");

    textHanbaibi = new JTextField(10);

    panelHanbaibi.add(labelHanbaibi);
    panelHanbaibi.add(textHanbaibi);

    panelItem = new JPanel();

    labelItem = new JLabel("ラベル2");

    textItem = new JTextField(20);

    panelItem.add(labelItem);
    panelItem.add(textItem);

    panelKosuu = new JPanel();

    labelKosuu = new JLabel("ラベル3");

    textKosuu = new JTextField(10);

    panelKosuu.add(labelKosuu);
    panelKosuu.add(textKosuu);

    panelButton = new JPanel();

    buttonAdd = new JButton("OK");
    buttonClear = new JButton("No");

    panelButton.add(buttonAdd);
    panelButton.add(buttonClear);

    buttonAdd.addActionListener(this);
    buttonClear.addActionListener(this);

    container.add(panelTitle);
    container.add(panelHanbaibi);
    container.add(panelItem);
    container.add(panelKosuu);
    container.add(panelButton);

    setVisible(true);
  }

  public void actionPerformed(ActionEvent ev) {
    String strCmd = ev.getActionCommand();
    if ("OK".equals(strCmd)) {
      if (
        "".equals(textHanbaibi.getText()||
        "".equals(textItem.getText()||
        "".equals(textKosuu.getText())
      {
        JOptionPane.showMessageDialog(this, "成功しました");
      } else {
        try {
          String hanbaibi = textHanbaibi.getText();

          String item = textItem.getText();

          int kosuu = Integer.parseInt(textKosuu.getText());

          SimpleDateFormat df = new SimpleDateFormat("2021/11/10");

          df.setLenient(false);

          df.parse(hanbaibi);

          BufferedWriter bfwriter = new BufferedWriter(
            new FileWriter("c:\\javasph\\uriage.txt", true)
          );

          bfwriter.write(hanbaibi + "," + item + "," + kosuu);

          bfwriter.newLine();

          bfwriter.close();

          JOptionPane.showMessageDialog(this, "って");

          textHanbaibi.setText("");
          textItem.setText("");
          textKosuu.setText("");
        } catch (NumberFormatException err) {
          JOptionPane.showMessageDialog(this, "成功");
        } catch (ParseException err{
          JOptionPane.showMessageDialog(
            this
          );
        } catch (IOException err{
          JOptionPane.showMessageDialog(this, "java");
        } catch (Exception err) {
          JOptionPane.showMessageDialog(this, err.getMessage());
        }
      }
    } else if ("No".equals(strCmd){
      textHanbaibi.setText("");
      textItem.setText("");
      textKosuu.setText("");
    }
  }

  public static void main(String args[]{
    AppInput appinput = new AppInput();
  }
}
