import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class GUI7 extends JFrame implements ActionListener
{

   JRadioButton B1,B2;
   JLabel l1;
   JPanel p1;
   JTextField f1;

   GUI7()
   {

    setTitle("RADIO");
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());
    setSize(500,500);

     B1 = new JRadioButton("bit 1");
     B2 = new JRadioButton("bit 0");

    // ButtonGroup bg = new ButtonGroup();
     //bg.add(B1);
     //bg.add(B2);

     p1= new JPanel();
     l1= new JLabel();

     f1 = new JTextField(15);

     p1.add(B1);
     p1.add(B2);
     p1.add(f1);
     p1.add(l1);

     B1.addActionListener(this);
     B2.addActionListener(this);

     add(p1,BorderLayout.CENTER);
   }

   public void actionPerformed(ActionEvent e)
   {
      
     if(B1.isSelected() && B2.isSelected())
    {
       f1.setText("3");
    }
    else if(B2.isSelected())
      {
        f1.setText("1");
      }
    else if(B1.isSelected())
      {
        f1.setText("2");
      }
     
      else
      {
        f1.setText("0");
      }
   }

   public static void main(String[]args)
   {
      new GUI7();
   }

}