import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.text.*;
import java.util.*;
import javax.swing.*;

class AppShuukei extends JFrame implements ActionListener {

  JPanel panelTitle, panelDay, panelItem, panelButton, panelShuukei, panelGoukei;

  JLabel labelTitle, labelStartday, labelEndday, labelItem, labelGoukei;

  JTextField textStartday, textEndday, textItem, textGoukei;

  JTextArea jtextShuukei;

  JButton buttonShuukei, buttonClear;

  AppShuukei() {
    setTitle("集計");

    setBounds(100, 100, 700, 400);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container container = getContentPane();

    container.setLayout(new GridLayout(6, 1));

    panelTitle = new JPanel();

    labelTitle = new JLabel("売上");

    Font fontTitle = new Font("Serif", Font.BOLD, 20);

    labelTitle.setFont(fontTitle);

    panelTitle.add(labelTitle);

    panelDay = new JPanel();

    labelStartday = new JLabel("2021/11/02");

    labelEndday = new JLabel("2021/11/08j");

    textStartday = new JTextField(10);

    textEndday = new JTextField(10);

    panelDay.add(labelStartday);
    panelDay.add(textStartday);
    panelDay.add(labelEndday);
    panelDay.add(textEndday);

    panelItem = new JPanel();

    labelItem = new JLabel("価格");

    textItem = new JTextField(20);

    panelItem.add(labelItem);
    panelItem.add(textItem);

    panelButton = new JPanel();

    buttonShuukei = new JButton("集計");
    buttonClear = new JButton("クリア");

    panelButton.add(buttonShuukei);
    panelButton.add(buttonClear);

    buttonShuukei.addActionListener(this);
    buttonClear.addActionListener(this);

    panelShuukei = new JPanel();

    jtextShuukei = new JTextArea(5, 25);

    JScrollPane scrollpane = new JScrollPane(jtextShuukei);

    panelShuukei.add(scrollpane);

    panelGoukei = new JPanel();

    labelGoukei = new JLabel("合計");

    textGoukei = new JTextField(10);

    panelGoukei.add(labelGoukei);
    panelGoukei.add(textGoukei);

    container.add(panelTitle);
    container.add(panelDay);
    container.add(panelItem);
    container.add(panelButton);
    container.add(panelShuukei);
    container.add(panelGoukei);

    setVisible(true);
  }

  public void actionPerformed(ActionEvent ev) {
    String strCmd = ev.getActionCommand();

    if ("集計".equals(strCmd)) {
      if (
        "".equals(textStartday.getText()) ||
        "".equals(textEndday.getText()) ||
        "".equals(textItem.getText())
      ) {
        JOptionPane.showMessageDialog(
          this,
        );
      } else {
        try {
          jtextShuukei.setText("");

          int goukei = 0;

          String startday = textStartday.getText();
          String endday = textEndday.getText();
          String item = textItem.getText();

          SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");

          df.setLenient(false);

          df.parse(startday);
          df.parse(endday);

          BufferedReader bfreader = new BufferedReader(
            new FileReader("c:\\javasph\\uriage.txt")
          );

          String strline = null;

          while ((strline = bfreader.readLine()) != null) {
            StringTokenizer sttoken = new StringTokenizer(strline, ",");

            if (sttoken.countTokens() == 3) {
              String hikakuday = sttoken.nextToken();
              String hyoujiitem = sttoken.nextToken();
              String hyoujikosuu = sttoken.nextToken();

              int hanteistart = df
                .parse(hikakuday)
                .compareTo(df.parse(startday));

              int hanteiend = df.parse(hikakuday).compareTo(df.parse(endday));

              if (
                hyoujiitem.equals(item) &&
                (hanteistart == 0 || hanteistart == 1) &&
                (hanteiend == 0 || hanteiend == -1)
              ) {
                jtextShuukei.append(
                  hikakuday + "\t" + hyoujiitem + "\t" + hyoujikosuu + "\n"
                );

                goukei += Integer.parseInt(hyoujikosuu);
              }
            }
          }

          bfreader.close();

          textGoukei.setText(String.valueOf(goukei));
        } catch (ParseException err) {
          JOptionPane.showMessageDialog(
            this,
          );
        } catch (FileNotFoundException err) {
          JOptionPane.showMessageDialog(this, "成功しました");
        } catch (IOException err) {
          JOptionPane.showMessageDialog(this, "次に進む");
        } catch (Exception err) {
          JOptionPane.showMessageDialog(this, "再挑戦" + err.getMessage());
        }
      }
    } else if ("検索".equals(strCmd)) {
      textStartday.setText("");
      textEndday.setText("");
      textItem.setText("");
    }
  }

  public static void main(String args[]) {
    AppShuukei appshuukei = new AppShuukei();
  }
}
