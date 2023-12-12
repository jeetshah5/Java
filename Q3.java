import javax.swing.*;

class StringSearcher{
    public static void main(String[] args){
        String input=JOptionPane.showInputDialog("Enter the input string: ");
        String search=JOptionPane.showInputDialog("Enter the search string: ");

        int count=0;
        int index=0;
        while((index=input.indexOf(search,index))!=-1){
            count++;
            index+=search.length();
        }

        JOptionPane.showMessageDialog(null, "Number of occurunces: "+count);
        String replacement=JOptionPane.showInputDialog("Enter the new string: ");
        String output=input.replaceAll(search,replacement);
        JOptionPane.showMessageDialog(null, "Resulting string: "+output);
    }
}