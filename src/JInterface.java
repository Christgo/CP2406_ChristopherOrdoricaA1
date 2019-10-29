/*
Class will generate interface for traffic simulator

 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JInterface extends JPanel implements ActionListener, ItemListener {

    public JInterface() {
        super();
        JLabel topLabel = new JLabel("label1");
        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.BLACK);
        topPanel.add(topLabel);

        JLabel middleLabel = new JLabel("label2");
        JPanel middlePanel = new JPanel();
        middlePanel.setBackground(Color.GREEN);
        middlePanel.add(middleLabel);

        JLabel bottomLabel = new JLabel("label3");
        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(Color.RED);
        bottomPanel.add(bottomLabel);

//        topPanel.setPreferredSize(new Dimension(300,300));
//        middlePanel.setPreferredSize(new Dimension(300,300));
//        bottomPanel.setPreferredSize(new Dimension(300,300));

        add(topPanel);
        add(middlePanel);
        add(bottomPanel);
    }

    @Override
    public void itemStateChanged(ItemEvent event) {

    }

    @Override
    public void actionPerformed(ActionEvent event) {

    }
}