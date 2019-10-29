/*
Class will generate interface for traffic simulator

 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JInterface extends JPanel implements ActionListener, ItemListener {

    public JInterface() {
        super();
        JPanel topPanel = new JPanel();
        JPanel middlePanel = new JPanel();
        JPanel bottomPanel = new JPanel();

        topPanel.setBackground(Color.BLACK);
        middlePanel.setBackground(Color.GREEN);
        bottomPanel.setBackground(Color.RED);

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