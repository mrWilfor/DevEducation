package homeWork.hw_8_Parth_2_07_05_2020.calc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PCalc extends JPanel {

    private JTextField textVal;

    public static int value;
    public static String operation = "";

    public PCalc() {
        setLayout(null);
        setSize(230, 290);
        this.textVal = new JTextField();

        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton tree = new JButton("3");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton nine = new JButton("9");
        JButton zero = new JButton("0");
        JButton clear = new JButton("C");
        JButton result = new JButton("=");
        JButton sum = new JButton("+");
        JButton subtraction = new JButton("-");
        JButton multiplication = new JButton("*");
        JButton division = new JButton("/");

        this.textVal.setBounds(10, 10, 200, 30);
        one.setBounds(10, 50, 40, 30);
        two.setBounds(60, 50, 40, 30);
        tree.setBounds(110, 50, 40, 30);
        sum.setBounds(160, 50, 50, 30);
        four.setBounds(10, 90, 40, 30);
        five.setBounds(60, 90, 40, 30);
        six.setBounds(110, 90, 40, 30);
        subtraction.setBounds(160, 90, 50, 30);
        seven.setBounds(10, 130, 40, 30);
        eight.setBounds(60, 130, 40, 30);
        nine.setBounds(110, 130, 40, 30);
        multiplication.setBounds(160, 130, 50, 30);
        zero.setBounds(10, 170, 40, 30);
        clear.setBounds(60, 170, 90, 30);
        division.setBounds(160, 170, 50, 30);
        result.setBounds(10, 210, 200, 30);

        one.addActionListener(new Numbers(1));
        two.addActionListener(new Numbers(2));
        tree.addActionListener(new Numbers(3));
        four.addActionListener(new Numbers(4));
        five.addActionListener(new Numbers(5));
        six.addActionListener(new Numbers(6));
        seven.addActionListener(new Numbers(7));
        eight.addActionListener(new Numbers(8));
        nine.addActionListener(new Numbers(9));
        zero.addActionListener(new Numbers(0));
        sum.addActionListener(new ArithmeticOperation("+"));
        subtraction.addActionListener(new ArithmeticOperation("-"));
        multiplication.addActionListener(new ArithmeticOperation("*"));
        division.addActionListener(new ArithmeticOperation("/"));
        result.addActionListener(new ArithmeticOperation("="));
        clear.addActionListener(new ArithmeticOperation(("C")));

        add(this.textVal);
        add(one);
        add(two);
        add(tree);
        add(four);
        add(five);
        add(six);
        add(seven);
        add(eight);
        add(nine);
        add(zero);
        add(result);
        add(sum);
        add(subtraction);
        add(multiplication);
        add(division);
        add(clear);

        setVisible(Boolean.TRUE);
    }

    private class Numbers implements ActionListener {
        private int value;

        public Numbers(int value) {
            this.value = value;
        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            textVal.setText(textVal.getText() + value);


        }
    }

    private class ArithmeticOperation implements ActionListener {
        private String operation;

        public ArithmeticOperation(String operation) {
            this.operation = operation;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Pattern pattern = Pattern.compile("[+\\-*/]");
            Matcher matcher = pattern.matcher(operation);
            int result;

            if (matcher.find()) {
                switch (PCalc.operation) {
                    case "":
                        PCalc.value = Integer.parseInt(textVal.getText());
                        PCalc.operation = this.operation;
                        textVal.setText("");
                        break;
                    case "+":
                        result = PCalc.value + Integer.parseInt(textVal.getText());
                        PCalc.value = result;
                        PCalc.operation = this.operation;
                        textVal.setText("");
                        break;
                    case "-":
                        result = PCalc.value - Integer.parseInt(textVal.getText());
                        PCalc.value = result;
                        PCalc.operation = this.operation;
                        textVal.setText("");
                        break;
                    case "*":
                        result = PCalc.value * Integer.parseInt(textVal.getText());
                        PCalc.value = result;
                        PCalc.operation = this.operation;
                        textVal.setText("");
                        break;
                    case "/":
                        result = PCalc.value / Integer.parseInt(textVal.getText());
                        PCalc.value = result;
                        PCalc.operation = this.operation;
                        textVal.setText("");
                        break;
                }
            } else if (operation.equals("=")) {
                switch (PCalc.operation) {
                    case "+":
                        result = PCalc.value + Integer.parseInt(textVal.getText());
                        textVal.setText(String.valueOf(result));
                        PCalc.value = 0;
                        PCalc.operation = "";
                        break;
                    case "-":
                        result = PCalc.value - Integer.parseInt(textVal.getText());
                        textVal.setText(String.valueOf(result));
                        PCalc.value = 0;
                        PCalc.operation = "";
                        break;
                    case "*":
                        result = PCalc.value * Integer.parseInt(textVal.getText());
                        textVal.setText(String.valueOf(result));
                        PCalc.value = 0;
                        PCalc.operation = "";
                        break;
                    case "/":
                        result = PCalc.value / Integer.parseInt(textVal.getText());
                        textVal.setText(String.valueOf(result));
                        PCalc.value = 0;
                        PCalc.operation = "";
                        break;
                }
            } else if (operation.equals("C")) {
                PCalc.value = 0;
                PCalc.operation = "";
                textVal.setText("");
            }
        }
    }
}
