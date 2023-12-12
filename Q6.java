import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Adder extends JFrame implements ActionListener{
Container c;
JLabel l1, l2, l3;
JButton add, clr;
JTextField t1,t2;
Adder(){
c=getContentPane();
FlowLayout l=new FlowLayout();
l.setAlignment(FlowLayout.CENTER);
l.setHgap(10000);
c.setLayout(l);
l1 = new JLabel("Number 1: ");
l2 = new JLabel("Number 2: ");
l3 = new JLabel("Sum: ");
t1 = new JTextField();
t1.setPreferredSize(new Dimension(100,20));
t2 = new JTextField();
t2.setPreferredSize(new Dimension(100,20));
add= new JButton("+");
clr= new JButton("CLEAR");
c.add(l1);
c.add(t1);
c.add(l2);
c.add(t2);
c.add(l3);
c.add(add);
c.add(clr);
add.addActionListener(this);
clr.addActionListener(this);
}
public void actionPerformed(ActionEvent e){
if(e.getSource()==add){
int num1 = Integer.parseInt(t1.getText());
int num2 = Integer.parseInt(t2.getText());
int sum = num1+num2;
l3.setText("Sum: "+sum);
}
else if(e.getSource()==clr){
t1.setText("0");
t2.setText("0");
l3.setText("Sum: ");
}
}
public static void main(String[] args) {
Adder a = new Adder();
a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
a.setBounds(300,400,700,500);
a.setVisible(true);
a.setTitle("Adder");
}
}

