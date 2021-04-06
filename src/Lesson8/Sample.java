package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sample {

    public static void main(String[] args) {
        new SampleWindow();
    }

    static class SampleWindow extends JFrame {
        private int count = 0;
        SampleWindow(){
            setSize(800, 600);
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocation(700, 400);
            setTitle("Our Sample");
//            set

            JButton btn1 = new JButton("BUTTON1");
            JButton btn2 = new JButton("BUTTON2");
            JButton btn3 = new JButton("BUTTON3");
            JPanel panel = new JPanel();
            panel.setLayout(new FlowLayout());
            add(panel, BorderLayout.SOUTH);


//            panel.setLayout(new BoxLayout(panel, 1));
//            setLayout(new GridLayout(2, 2));
//            setLayout(new BoxLayout(this, 0));
//            btn1.setPreferredSize(new Dimension(0, 150));
//
            panel.add(btn2);
            panel.add(btn3);
            panel.add(btn1);

            btn3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    count++;
                    btn3.setText(String.valueOf(count));
                }
            });

        }

    }
}
