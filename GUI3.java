import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class GUI3 extends JFrame implements ActionListener
{

   JButton B1,B2;
   JLabel l1;
   JPanel p1;
   JTextField f1;
   GUI3()
   {
      setSize(500,500);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new BorderLayout());
      setTitle("Simple GUI");

      f1 = new JTextField(20);
      l1 = new JLabel();
      B1 = new JButton("Fibonacci generator");
      B2 = new JButton("Clear");
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
                   String s = f1.getText();
                   int num = Integer.parseInt(s);
                   
                   String fib = CalcFib(num);
                   l1.setText("Fib series:"+fib);
              }else if(e.getSource()==B2)
              {
                 f1.setText("");
                 l1.setText("");
              }
                     
        }
        public String CalcFib(int n)
        {
            StringBuilder sb = new StringBuilder();
            int n1 = 0,n2 = 1;
            for(int i =1;i<=n;i++)
            {
                sb.append(n1).append(" ");
            
            int nextTerm = n1+n2;
            n1 = n2;
            n2 = nextTerm;
           
           }
           return sb.toString();

        }

      


    


public static void main(String[]args)
{
    new GUI3();
}
}