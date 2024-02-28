import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

class GUI8 extends JFrame implements ActionListener {
    JButton b1;
    JPanel p1;
    JTextField f1;

    GUI8() {
        setTitle("A simple GUI");
        setSize(400, 400);
        setLayout(new BorderLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1 = new JButton("Print");
        b1.addActionListener(this);

        f1  = new JTextField(20);
        p1 = new JPanel();
        p1.add(b1);
        p1.add(f1);

       add(p1,BorderLayout.CENTER);
        
    }

    public void actionPerformed(ActionEvent e)
    {
            if(e.getSource()==b1)
            {
                int n = Integer.parseInt(f1.getText());
                Runnable t1 = new Runnable(){

                public void run()
                {
                    try
                    {
                        for(int i = 0;i<n;i++)
                        {
                            System.out.println("KOCHI");
                            Thread.sleep(1000);
                        }
                    }catch(InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            };

                Runnable t2 = new Runnable() {
                     
                    public void run()
                    {
                        try{
                            for(int i = 0;i<n;i++)
                            {
                                System.out.println("THRIKKARA");
                                
                            }
                        }catch(IllegalStateException e)
                        {
                            e.printStackTrace();
                        }
                    }
                };
            

            Thread m1 = new Thread(t1);
            Thread m2 = new Thread(t2);
            m1.start();
            m2.start();
         }
    }


public static void main(String[]args)
{
    new GUI8();
}

}