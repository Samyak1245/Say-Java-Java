import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuiPracticalApp extends JFrame implements ActionListener {
    
    private JLabel instructionLabel;
    private JLabel resultLabel;
    private JTextField inputTextField;
    private JButton reverseButton;

    public GuiPracticalApp() {
        setTitle("Java Swing Practical Exam");
        setSize(400, 200);
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 15));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        instructionLabel = new JLabel("Enter text to reverse:");
        inputTextField = new JTextField(20);
        reverseButton = new JButton("Reverse Text");
        resultLabel = new JLabel("Result: ");
        
        resultLabel.setFont(new Font("Arial", Font.BOLD, 14));
        resultLabel.setForeground(Color.BLUE);

        reverseButton.addActionListener(this);

        add(instructionLabel);
        add(inputTextField);
        add(reverseButton);
        add(resultLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String userText = inputTextField.getText();
        String reversedText = new StringBuilder(userText).reverse().toString();
        resultLabel.setText("Result: " + reversedText);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GuiPracticalApp();
            }
        });
    }
}
