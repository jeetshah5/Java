import javax.swing.*;
class Q36{
public static void main(String[] args) {
String input = JOptionPane.showInputDialog("Enter numbers separated by space: ");
String[] numbers = input.split(" ");
int a[] = new int[numbers.length];
int odd=0,even=0;
for(int i=0;i<numbers.length;i++){
a[i]= Integer.parseInt(numbers[i]);
if(a[i]%2 ==0){
even+=1;
}
else{
odd+=1;
}
}
JOptionPane.showMessageDialog(null, "Number of odd numbers: "+odd+"\nNumber of even numbers: "+even);
}
}

