import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class GUI1 extends JFrame implements ActionListener
{

   JButton B1;
   JLabel l1;
   JPanel p1;
   JTextField f1;
   GUI1()
   {
      setSize(500,500);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new BorderLayout());
      setTitle("Simple GUI");

      f1 = new JTextField(20);
      l1 = new JLabel();
      B1 = new JButton("Palindrome Check");
      p1 = new JPanel();

      B1.addActionListener(this);

      p1.add(B1);
      p1.add(f1);
      p1.add(l1);

      add(p1,BorderLayout.CENTER);

   }
      public void actionPerformed(ActionEvent e)
      {
              if(e.getSource()==B1)
              {
                   String s = f1.getText();
                   int l = s.length();
                   String rev = "";
                   for(int i =l-1;i>=0;i--)
                   {
                      rev = rev + s.charAt(i);
                   }
                   if(s.equals(rev))
                   {
                      l1.setText("It is palindrome");
                      p1.setBackground(Color.BLUE);
                   }
                   else
                   {
                      l1.setText("Not a palindrome");
                      p1.setBackground(Color.GREEN);
                   }
              }         
      }


      


    


public static void main(String[]args)
{
    new GUI1();
}
}