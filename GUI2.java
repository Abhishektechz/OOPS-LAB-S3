import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class GUI2 extends JFrame implements ActionListener
{

   JButton B1,B2;
   JLabel l1;
   JPanel p1;
   JTextField f1;
   GUI2()
   {
      setSize(500,500);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new BorderLayout());
      setTitle("Simple GUI");

      f1 = new JTextField(20);
      l1 = new JLabel();
      B1 = new JButton("Prime Check");
      B2 = new JButton("clear");
      p1 = new JPanel();

      B1.addActionListener(this);
      B2.addActionListener(this);

      p1.add(B1);
      p1.add(B2);
      p1.add(f1);
      p1.add(l1);

      add(p1,BorderLayout.CENTER);

   }
      public void actionPerformed(ActionEvent e)
      {
              if(e.getSource()==B1)
              {
                   int num  =Integer.parseInt(f1.getText()); 
                   boolean isPrime = true;
                   for(int i = 2;i<num;i++)
                   {
                     if(num%i==0)
                     {
                        isPrime = false;
                        break;
                    }
                   }     
                     if(num<=1)
                     {
                        l1.setText("Neither prime not composite");
                     }
                     else if(isPrime)
                     {
                        l1.setText("Prime Number");
                        
                     }
                     else
                     {
                        l1.setText("Composite Number");
                     }
                   }
                   
                   else if(e.getSource()==B2)
                   {
                      f1.setText("");
                   }
                     
      }


      


    


public static void main(String[]args)
{
    new GUI2();
}
}