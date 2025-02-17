//Generated by GuiGenie - Copyright (c) 2004 Mario Awad.
//Home Page http://guigenie.cjb.net - Check often for new versions!

import java.awt.*;
import javax.swing.*;

public class ComboBoxExample extends JPanel {
    private JComboBox jcomp1;
    private JTextField jcomp2;
    private JTextField jcomp3;
    private JTextField jcomp4;
    private JLabel jcomp5;
    private JLabel jcomp6;
    private JLabel jcomp7;
    private JTextField jcomp8;
    private JLabel jcomp9;
    private JButton jcomp10;
    private JSlider jcomp11;

    public ComboBoxExample() {


        //construct preComponents
        String[] jcomp1Items = {"Item 1", "Item 2", "Item 3"};

        //construct components
        jcomp1 = new JComboBox(jcomp1Items);
        jcomp2 = new JTextField(5);
        jcomp3 = new JTextField(5);
        jcomp4 = new JTextField(5);
        jcomp5 = new JLabel("newLabel");
        jcomp6 = new JLabel("newLabel");
        jcomp7 = new JLabel("newLabel");
        jcomp8 = new JTextField(5);
        jcomp9 = new JLabel("newLabel");
        jcomp10 = new JButton("Calculate");
        jcomp11 = new JSlider(0, 50);

        //set components properties
        jcomp11.setOrientation(JSlider.HORIZONTAL);
        jcomp11.setMinorTickSpacing(50);
        jcomp11.setMajorTickSpacing(10);
        jcomp11.setPaintTicks(true);
        jcomp11.setPaintLabels(true);

        //adjust size and set layout
        setPreferredSize(new Dimension(944, 574));
        setLayout(null);

        //add components
        add(jcomp1);
        add(jcomp2);
        add(jcomp3);
        add(jcomp4);
        add(jcomp5);
        add(jcomp6);
        add(jcomp7);
        add(jcomp8);
        add(jcomp9);
        add(jcomp10);
        add(jcomp11);

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds(50, 55, 100, 25);
        jcomp2.setBounds(180, 110, 100, 25);
        jcomp3.setBounds(180, 150, 100, 25);
        jcomp4.setBounds(180, 190, 100, 25);
        jcomp5.setBounds(55, 110, 100, 25);
        jcomp6.setBounds(55, 150, 100, 25);
        jcomp7.setBounds(55, 190, 100, 25);
        jcomp8.setBounds(180, 230, 100, 25);
        jcomp9.setBounds(55, 230, 100, 25);
        jcomp10.setBounds(55, 290, 100, 25);
        jcomp11.setBounds(180, 25, 500, 60);
    }


    public void comboBox() {
        JFrame frame = new JFrame("MyPanel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new ComboBoxExample());
        frame.pack();
        frame.setVisible(true);

        System.out.println();
    }
}