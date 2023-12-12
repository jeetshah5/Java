import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Counter extends JFrame implements ActionListener{
Container c;
JLabel l1,l2;
JButton inc,dec,res;
Counter(){
c=getContentPane();
c.setLayout(new FlowLayout());
inc = new JButton("+");
dec = new JButton("-");
res = new JButton("RESET");
l1 = new JLabel("Counter: ");
l2 = new JLabel("0");
c.add(l1);
c.add(l2);
c.add(inc);
c.add(dec);
c.add(res);
inc.addActionListener(this);
dec.addActionListener(this);
res.addActionListener(this);
}
public void actionPerformed(ActionEvent e){
if(e.getSource()==inc){
int c = Integer.parseInt(l2.getText());
c+=1;
l2.setText(""+c);
}
else if(e.getSource()==dec){
int c = Integer.parseInt(l2.getText());
c-=1;
l2.setText(""+c);
}
else{
l2.setText("0");
}
}
public static void main(String[] args) {
Counter c = new Counter();
c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
c.setBounds(200,300,750,500);
c.setVisible(true);
c.setTitle(" AWT Counter");
}
}