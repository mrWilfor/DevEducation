package com.github.lecture.oop.calc;

import javax.swing.*;

public class FCalc extends JFrame {

    public FCalc() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(200, 400);
        PCalc pCalc = new PCalc();
        add(pCalc);
        setVisible(Boolean.TRUE);
    }

}
