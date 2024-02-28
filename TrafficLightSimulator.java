import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrafficLightSimulator extends JFrame implements ActionListener {
    private JRadioButton redButton, yellowButton, greenButton;

    public TrafficLightSimulator() {
        setTitle("Traffic Light Simulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        redButton = new JRadioButton("Red");
        yellowButton = new JRadioButton("Yellow");
        greenButton = new JRadioButton("Green");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(redButton);
        buttonGroup.add(yellowButton);
        buttonGroup.add(greenButton);

        redButton.addActionListener(this);
        yellowButton.addActionListener(this);
        greenButton.addActionListener(this);

        add(redButton);
        add(yellowButton);
        add(greenButton);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redButton) {
            showLight("Red");
        } else if (e.getSource() == yellowButton) {
            showLight("Yellow");
        } else if (e.getSource() == greenButton) {
            showLight("Green");
        }
    }

    private void showLight(String color) {
        JOptionPane.showMessageDialog(this, "Traffic Light is " + color, "Traffic Light", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        new TrafficLightSimulator();
    }
}
