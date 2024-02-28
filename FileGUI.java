import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;

class FileGUI extends JFrame implements ActionListener
{
    JButton b1,b2;
    JPanel p1;
    JLabel l1;
    JTextField t1,t2;
    JFrame frm;
    FileGUI()
    {
        frm =new JFrame("A simple GUI");
        b1 = new JButton("Import data");
        b2 = new JButton("Calculate");
        p1 = new JPanel();
        l1 = new JLabel();
        t1 = new JTextField(10);
        t2 = new JTextField(10);

        frm.setSize(500,500);
        
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setLayout(new BorderLayout());

        p1.add(b1);
        p1.add(b2);
        p1.add(l1);
        p1.add(t1);
        p1.add(t2);

        frm.add(p1,BorderLayout.CENTER);

        b1.addActionListener(this);
        frm.setVisible(true);

        
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == b1) {
                BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\hp\\Desktop\\Student.txt"));
                StringBuilder fileContent = new StringBuilder();
                String s;
                while ((s = br.readLine()) != null) {
                    fileContent.append(s).append("\n");
                }
                br.close();
                l1.setText(fileContent.toString());
            } else if (e.getSource() == b2) {
                int m1 = Integer.parseInt(t1.getText());
                int m2 = Integer.parseInt(t2.getText());
                int total = m1 + m2;
                l1.setText(Integer.toString(total));
            }
        } catch (IOException ex) {
            System.out.println(ex);
        } catch (NumberFormatException ex) {
            System.out.println(ex);
        }
    }
    

    public static void main(String[] args) {
         new FileGUI();
    }


}