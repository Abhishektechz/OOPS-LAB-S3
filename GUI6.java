 
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class GUI6 extends JFrame implements ActionListener
{

   JButton B1,B2;
   JLabel l1;
   JPanel p1;
   JTextField f1,f2,f3,f4;
   GUI6()
   {
      setSize(500,500);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new BorderLayout());
      setTitle("Marks GUI");

      f1 = new JTextField(20);
      f2 = new JTextField(20);
      f3 = new JTextField(10);
      f4 = new JTextField(10);
      l1 = new JLabel();
      B1 = new JButton("Import Data");
      B2 = new JButton("Calculate");
      p1 = new JPanel(new FlowLayout(FlowLayout.CENTER));

      B1.addActionListener(this);
      B2.addActionListener(this);

      p1.add(B1);
      p1.add(B2);
      p1.add(f1);
      p1.add(f2);
      p1.add(f3);
      p1.add(f4);
      p1.add(l1);

      add(p1,BorderLayout.CENTER);
  
   }
      public void actionPerformed(ActionEvent e)
      {
        if(e.getSource()==B1)
        {
            try
            {
                BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\hp\\Desktop\\gui.txt"));
                BufferedWriter wr  = new BufferedWriter(new FileWriter("C:\\Users\\hp\\Desktop\\ghjh.txt"));
                StringBuilder sb = new StringBuilder();
                String s;
                while((s = br.readLine())!=null)
                {
                    sb.append(s).append("\n");
                    wr.write(sb.toString());
                    

                }
                f1.setText(sb.toString());
                System.out.println("File read succesfully");
                br.close();
                wr.close();
                System.out.println("File written");
            }catch(IOException ex)
            {
                ex.printStackTrace();
            }
        }  

                else if(e.getSource()==B2)
                {
                    try{
                    int n1 = Integer.parseInt(f3.getText());
                         int n2 = Integer.parseInt(f4.getText());

                         int total = n1+n2;

                         f2.setText(Integer.toString(total));
                    }catch(NumberFormatException ex)
                   {
                    ex.printStackTrace();
                   }
                }  

        

      }


      public static void main(String[]args)
      {
          new GUI6();
      }
    }    

