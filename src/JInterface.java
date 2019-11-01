/*
Class will generate interface for traffic simulator

 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JInterface extends JPanel implements ActionListener, ItemListener {

    JInterface() {
        super();

        JLabel topLabel = new JLabel("Vehicle Length");
        String[] vehicleLengths = {"2","4","6","8"}; //preset values for vehicle config
        JComboBox<String> vehicleLength = new JComboBox<>(vehicleLengths);
        JPanel topPanel = new JPanel();
        topLabel.setForeground(Color.WHITE);
        topPanel.setBackground(Color.BLACK);
        topPanel.add(topLabel);

        vehicleLength.setSelectedIndex(0); //always default on "2"
        vehicleLength.addActionListener(this);
        topPanel.add(vehicleLength);

        JLabel middleLabel = new JLabel("label2");
        JPanel middlePanel = new JPanel();
        middlePanel.setLayout(new GridLayout(3,3));
        middlePanel.setBackground(Color.WHITE);
        middlePanel.add(middleLabel);

        JLabel bottomLabel = new JLabel("Stats:");
        JPanel bottomPanel = new JPanel();
        bottomLabel.setForeground(Color.WHITE);
        bottomPanel.setBackground(Color.BLACK);
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