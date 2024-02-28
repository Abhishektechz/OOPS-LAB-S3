import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class GUI5 extends JFrame implements ActionListener {
    JButton d1;
    JPanel p1;
    JTextField t1, t2, result1, remarks;
    JLabel l1, l2, l3, l4;

    GUI5() {
        setSize(400, 400);
        setTitle("Calc");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        d1 = new JButton("Divide");

        l1 = new JLabel("NUM1");
        t1 = new JTextField(10);

        l2 = new JLabel("NUM2");
        t2 = new JTextField(10);

        l3 = new JLabel("RESULT");
        result1 = new JTextField(10);
        result1.setEditable(false);

        l4 = new JLabel("REMARKS");
        remarks = new JTextField(10);
        remarks.setEditable(false);

        p1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(result1);
        p1.add(l4);
        p1.add(remarks);
        p1.add(d1);

        add(p1, BorderLayout.CENTER);

        d1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == d1) {
            try {
                int n1 = Integer.parseInt(t1.getText());
                int n2 = Integer.parseInt(t2.getText());

                if (n2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }

                int result = n1 / n2;
                result1.setText(Integer.toString(result));
                remarks.setText("Division success");
            } catch (NumberFormatException ex) {
                remarks.setText("Please enter integers");
            } catch (ArithmeticException ex) {
                remarks.setText("Division by zero");
            }
        }
    }

    public static void main(String[] args) {
        new GUI5();
    }
}
