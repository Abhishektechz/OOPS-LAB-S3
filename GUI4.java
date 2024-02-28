import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class GUI4 extends JFrame implements ActionListener
{

   JRadioButton B1,B2,B3;
   JLabel l1;
   JPanel p1;
   ButtonGroup bg;
   
   GUI4()
   {
      setSize(500,500);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new BorderLayout());
      setTitle("Simple GUI");

     
      l1 = new JLabel();
      B1 = new JRadioButton("RED");
      B2 = new JRadioButton("YELLOW");
      B3 = new JRadioButton("GREEN");
      
      p1 = new JPanel();
      p1.setBackground(Color.GRAY);
      p1.add(B1);
      p1.add(B2);
      p1.add(B3);
      p1.add(l1);


      bg = new ButtonGroup();
      bg.add(B1);
      bg.add(B2);
      bg.add(B3);

      B1.addActionListener(this);
      B2.addActionListener(this);
      B3.addActionListener(this);

      add(p1,BorderLayout.CENTER);

   }

   public void actionPerformed(ActionEvent e)
   {
      if(e.getSource()==B1)
      {
        l1.setText("stop");
        p1.setBackground(Color.RED);
      }
      else if(e.getSource()==B2)
      {
         l1.setText("WAIT");
         p1.setBackground(Color.YELLOW);
      }
      else
      {
         l1.setText("GO");
         p1.setBackground(Color.GREEN);
      }
   }

public static void main(String[] args) {
     
    new GUI4();
}

} 
