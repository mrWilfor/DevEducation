package homeWork.hw_8_Parth_2_07_05_2020.calc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PCalc extends JPanel {

    private BtnEqAction btnEqAction = new BtnEqAction();

    private JTextField textVal1;
    private JTextField textVal2;
    private JTextField textSign;
    private JTextField textResult;

    public PCalc() {
        setLayout(null);
        setSize(200, 400);
        this.textVal1 = new JTextField();
        this.textVal2 = new JTextField();
        this.textSign = new JTextField();
        this.textResult = new JTextField();
        JButton btnEq = new JButton("=");

        this.textVal1.setBounds(10, 10, 140, 30);
        this.textVal2.setBounds(10, 50, 140, 30);
        this.textSign.setBounds(10, 90, 140, 30);
        this.textResult.setBounds(10, 130, 140, 30);
        btnEq.setBounds(10, 170, 140, 30);

        btnEq.addActionListener(this.btnEqAction);

        add(this.textVal1);
        add(this.textVal2);
        add(this.textSign);
        add(this.textResult);
        add(btnEq);
        setVisible(Boolean.TRUE);
    }

    private class BtnEqAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            int val1 = Integer.parseInt(textVal1.getText());
            int val2 = Integer.parseInt(textVal2.getText());
            switch (textSign.getText()) {
                case "+":
                    int res = val1 + val2;
                    textResult.setText(String.valueOf(res));
                    break;
                case "-":
                    textResult.setText(String.valueOf(val1 - val2));
                    break;
                case "*":
                    textResult.setText(String.valueOf(val1 * val2));
                    break;
                case "/":
                    textResult.setText(String.valueOf(val1 / val2));
                default:
                    break;
            }
        }
    }

}
