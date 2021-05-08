package ru.vsu.cs.gui.controller;

import ru.vsu.cs.ArrayUtil;
import ru.vsu.cs.common.MySelectionSort;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonResultBuildNewArrayListener implements ActionListener {
    JTextField enterArrayOfLogicalValues;
    JTextField sortedArray;
    JTextField enterArrayOfDigits;

    public ButtonResultBuildNewArrayListener(JTextField enterArrayOfLogicalValues, JTextField sortedArray, JTextField enterArrayOfDigits) {
        this.enterArrayOfDigits = enterArrayOfDigits;
        this.enterArrayOfLogicalValues = enterArrayOfLogicalValues;
        this.sortedArray = sortedArray;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Integer[] firstSourceArray = ArrayUtil.toObject(ArrayUtil.setArray(enterArrayOfDigits.getText()));
        boolean[] secondSourceArray = ArrayUtil.getFixedPosition(enterArrayOfLogicalValues.getText());
        MySelectionSort.sort(firstSourceArray, secondSourceArray);
        sortedArray.setText(ArrayUtil.toString(ArrayUtil.toPrimitive(firstSourceArray)));
    }
}