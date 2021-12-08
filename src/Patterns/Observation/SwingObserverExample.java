package Patterns.Observation;

import javax.swing.*;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();

    }

    private void go() {
        frame = new JFrame();
        JButton button = new JButton("Shoud I do it");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());
        frame.getGlassPane();
    }

}
