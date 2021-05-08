package ru.vsu.cs.gui;

import ru.vsu.cs.gui.controller.ButtonResultBuildNewArrayListener;

import javax.swing.*;

public class Frame extends JFrame {
    private JTextField enterArrayOfLogicalValues;
    private JTextField sortedArray;
    private JButton buildNewArrayButton;
    private JPanel mainPanel;
    private JTextField enterArrayOfDigits;

    public Frame() {

        setTitle("Task №4");
        setContentPane(mainPanel);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        pack();
        setBounds(500, 250, 550, 300);

        buildNewArrayButton.addActionListener(new ButtonResultBuildNewArrayListener(enterArrayOfLogicalValues, sortedArray, enterArrayOfDigits));
    }
}
