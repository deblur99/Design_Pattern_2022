package Observer.Advanced;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample extends JFrame {
    JFrame jFrame;

    public SwingObserverExample() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingObserverExample swingObserverExample = new SwingObserverExample();
        swingObserverExample.go();
    }

    public void go() {
        jFrame = new JFrame();

        JButton jButton = new JButton("할까? 말까?");
        jButton.addActionListener(event -> System.out.println("하지 마! 아마 후회할 걸?"));
        jButton.addActionListener(event -> System.out.println("그냥 해버려!"));
        jFrame.add(jButton);

        jFrame.setSize(new Dimension(200, 200));
        jFrame.setLocation(new Point(200, 200));
        jFrame.setVisible(true);
    }

//    class AngelListener implements ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            System.out.println("하지 마! 아마 후회할 걸?");
//        }
//    }
//
//    class DevilListener implements ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            System.out.println("그냥 해버려!");
//        }
//    }
}
