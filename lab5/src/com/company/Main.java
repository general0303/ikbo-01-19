package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;

public class Main extends JFrame {

    private static final long serialVersionUID = 1L;

    public Main(ArrayList randomNumbers, ArrayList randomCircles) {

        setSize(new Dimension(1000, 1000));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        JPanel p = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {

                for (int i = 0; i < 20; i++) {
                    if ((int)randomNumbers.get(i) % 2 == 0 && (int)randomNumbers.get(i) % 4!=0 ) {
                        Rectangle r = new Rectangle((int) (randomNumbers.get(i)), (int) (randomNumbers.get(i + 20)), new Color((Integer) randomCircles.get(i)));
                        r.draw2(g);
                    } else {
                        if((int)randomNumbers.get(i) % 4==0){
                            Line l=new Line((int) (randomNumbers.get(i)), (int) (randomNumbers.get(i + 20)),new Color((Integer) randomCircles.get(i)));
                            l.draw2(g);
                        }
                        Circle o = new Circle((int) (randomNumbers.get(i)), (int) (randomNumbers.get(i + 20)), new Color((Integer) randomCircles.get(i)));
                        o.draw2(g);
                    }
                }
                //  setSize(1000, 1000);
            }
        };
        setTitle("Example");
        this.getContentPane().add(p);
    }
    public static void main(String arg[]) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // TODO Auto-generated method stub
                Random random = new Random();
                ArrayList randomNumbers = (ArrayList) random.ints(0, 800).distinct().limit(40).boxed().collect(Collectors.toList());
                ArrayList randomCircles = (ArrayList) random.ints(0x1000000).distinct().limit(20).boxed().collect(Collectors.toList());
                new Main(randomNumbers,randomCircles);
            }
        });
    }
}
