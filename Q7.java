import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Calculator extends JFrame implements ActionListener{
Container c;
JLabel l1,l2,l3;
JButton add,sub,mul,div,mod,clr;
JTextField t1,t2;
Calculator(){
c = getContentPane();
FlowLayout l=new FlowLayout();
l.setHgap(5000);
c.setLayout(l);
l1 = new JLabel("First Number:\t");
t1 = new JTextField("0");
t1.setPreferredSize(new Dimension(100,20));
l2 = new JLabel("Second Number:\t");
t2 = new JTextField("0");
t2.setPreferredSize(new Dimension(100,20));
l3 = new JLabel("Output:\t\t");
add = new JButton("+");
sub = new JButton("-");
mul = new JButton("*");
div = new JButton("/");
mod = new JButton("%");
clr = new JButton("CLEAR");
c.add(l1);
c.add(t1);
c.add(l2);
c.add(t2);
c.add(l3);
c.add(add);
c.add(sub);
c.add(mul);
c.add(div);
c.add(mod);
c.add(clr);
add.addActionListener(this);
sub.addActionListener(this);
mul.addActionListener(this);
div.addActionListener(this);
mod.addActionListener(this);
clr.addActionListener(this);
}
public void actionPerformed(ActionEvent e){
int num1,num2;
double out;
num1 = Integer.parseInt(t1.getText());
num2 = Integer.parseInt(t2.getText());
if(e.getSource()==add){
out=num1+num2;
l3.setText("Output:\t\t"+out);
}
if(e.getSource()==sub){
out=num1-num2;
l3.setText("Output:\t\t"+out);
}
if(e.getSource()==mul){
out=num1*num2;
l3.setText("Output:\t\t"+out);
}
if(e.getSource()==div){
out=(double)(num1)/num2;
l3.setText("Output:\t\t"+out);
}
if(e.getSource()==mod){
out=num1%num2;
l3.setText("Output:\t\t"+out);
}
if(e.getSource()==clr){
t1.setText("");
t2.setText("");
l3.setText("Output:\t\t");
}
}
public static void main(String[] args) {
Calculator c = new Calculator();
c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
c.setBounds(500, 500, 500, 500);
c.setVisible(true);
c.setTitle("Calculator");
}
}