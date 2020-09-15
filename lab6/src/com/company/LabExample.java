package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabExample extends JFrame{
    JTextField jta1 = new JTextField(10);

    JButton button = new JButton("проверить");

    JLabel jl= new JLabel("введите число");

    Font fnt = new Font("Times new roman",Font.BOLD,20);
    private int i = 0;

    LabExample()
    {
        super("Example");
        setLayout(new FlowLayout());
        setSize(550,150);
        add(jl);
        add(jta1);
        add(button);
        int m = (int)(Math.random() * 20);
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try
                {
                    Integer x1 =
                            Integer.parseInt(jta1.getText().trim());
                    if (x1<m)
                        jl.setText("ваше число больше");
                    else if (x1>m)
                        jl.setText("ваше число меньше");
                    else {
                        jl.setText("вы угадали");
                        button.setVisible(false);
                    }
                    i++;
                    if ((i==3) && (x1!=m)){
                        jl.setText("вы не угадали, число было: " + m);
                        button.setVisible(false);
                    }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, "Error in Numbers !","alert" , JOptionPane.ERROR_MESSAGE);

                }
            }
        });
        setVisible(true);
    }
}
