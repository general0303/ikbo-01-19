package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabExample extends JFrame{


    private JButton barselona = new JButton("FC Barcelona");
    private JButton bayern = new JButton("FC Bayern Munich");

    private JLabel result = new JLabel("0 X 0");
    private JLabel scorer = new JLabel("Last Scorer: N/A");
    private JLabel winner = new JLabel("Winner: DRAW");

    private int barselona_score = 0;
    private int bayern_score = 0;

    Font fnt = new Font("Times new roman",Font.BOLD,20);

    LabExample()
    {
        super("Champions league 2020 quarterfinals");
        setLayout(new FlowLayout());
        setSize(700,150);
        add(barselona);
        add(bayern);
        add(result);
        add(scorer);
        add(winner);
        barselona.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                barselona_score++;
                scorer.setText("Last Scorer: FC Barcelona");
                result.setText(barselona_score + " X " + bayern_score);
                if (barselona_score > bayern_score) winner.setText("FC Barcelona");
                else if (barselona_score==bayern_score) winner.setText("DRAW");
                else winner.setText("FC Bayern Munich");
            }
        });
        bayern.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                bayern_score++;
                scorer.setText("Last Scorer: FC Bayern Munich");
                result.setText(barselona_score + " X " + bayern_score);
                if (barselona_score > bayern_score) winner.setText("FC Barcelona");
                else if (barselona_score == bayern_score) winner.setText("DRAW");
                else winner.setText("FC Bayern Munich");
            }
        });
        setVisible(true);
    }

}
