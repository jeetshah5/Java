import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Buttons extends JFrame implements ActionListener{
    Container c;
    JButton b1,b2,b3,b4;
    JLabel l1;
    Buttons(){
        c=getContentPane();
        c.setLayout(new FlowLayout());

        b1=new JButton("Addition");
        b2=new JButton("Subtraction");
        b3=new JButton("Multiplication");
        b4=new JButton("Division");

        l1=new JLabel();
        l1.setFont(new Font("Arial",Font.ITALIC,32));

        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(l1);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            l1.setText("You selected Addition");
        }
        if(e.getSource()==b2){
            l1.setText("You selected Subtraction");
        }
        if(e.getSource()==b3){
            l1.setText("You selected Multiplication");
        }
        if(e.getSource()==b4){
            l1.setText("You selected Division");
        }
    }

    public static void main(String[] args){
        Buttons q=new Buttons();
        q.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        q.setBounds(300,300,700,350);
        q.setVisible(true);
        q.setTitle("The four buttons");
    }
}