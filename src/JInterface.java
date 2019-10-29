/*
Class will generate interface for traffic simulator

 */

import javax.swing.*;
import java.awt.event.*;

public class JInterface extends JFrame implements ActionListener, ItemListener {

    public JInterface() {
        super("Traffic Simulator");
        int width = 400;
        int height = 400;
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void itemStateChanged(ItemEvent event) {

    }

    @Override
    public void actionPerformed(ActionEvent event) {

    }
}
