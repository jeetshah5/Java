import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm extends JFrame implements ActionListener {
    // Declare Swing components
    private JTextField nameField, emailField;
    private JPasswordField passwordField;
    private JButton submitButton;

    public RegistrationForm() {
        // Set JFrame properties
        setTitle("Registration Form");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel and set its layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        // Add components to the panel
        panel.add(new JLabel("Name:"));
        nameField = new JTextField();
        panel.add(nameField);

        panel.add(new JLabel("Email:"));
        emailField = new JTextField();
        panel.add(emailField);

        panel.add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        panel.add(passwordField);

        submitButton = new JButton("Submit");
        panel.add(submitButton);
        submitButton.addActionListener(this);

        // Add the panel to the JFrame
        add(panel);

        // Set the JFrame to be visible
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            // Get the entered information
            String name = nameField.getText();
            String email = emailField.getText();
            char[] passwordChars = passwordField.getPassword();
            String password = new String(passwordChars);

            // Display the information in the console
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
            System.out.println("Password: " + password);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RegistrationForm());
    }
}
