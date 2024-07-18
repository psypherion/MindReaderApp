import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MindReaderApp extends JFrame implements ActionListener {

    private JLabel instructionLabel;
    private JButton submitButton;
    private JPanel gridPanel;
    private char[] array = {
        '`', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '-', '=', 
        'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', '[', ']', '\\', 
        'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', ';', ',', '\'', 
        'z', 'x', 'c', 'v', 'b', 'n', 'm', '/', '~', '!', '@', '#', 
        '$', '%', '^', '&', '*', '(', ')', '_', '+', '{', '}', ':', 
        '"', '?', '>', '.'
    };
    private Map<Integer, Character> mapping;
    private char fixedChar;

    public MindReaderApp() {
        super("Mind Reader App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        // Instruction label
        instructionLabel = new JLabel("Think of any two digit number. Now reverse it and find the difference of them. " +
                "Now find the number you got and remember the symbol from the panel below. " +
                "Don't tell me, I'll read your mind! Hit the below button when you are ready to see the magic!");
        add(instructionLabel, BorderLayout.NORTH);

        // Submit button
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        add(submitButton, BorderLayout.SOUTH);

        // Grid panel
        gridPanel = new JPanel(new GridLayout(10, 10));
        Random random = new Random();
        fixedChar = array[random.nextInt(array.length)];
        mapping = new HashMap<>();
        for (int i = 0; i < 99; i++) {
            if (i == 0 || i % 9 == 0) {
                mapping.put(i, fixedChar);
            } else {
                mapping.put(i, array[random.nextInt(array.length)]);
            }
            JLabel label = new JLabel(i + ": " + mapping.get(i));
            label.setHorizontalAlignment(SwingConstants.CENTER);
            gridPanel.add(label);
        }
        add(gridPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            JOptionPane.showMessageDialog(this, "Gotcha! Here is the symbol on your mind!\n" + fixedChar);
        }
    }

    public static void main(String[] args) {
        new MindReaderApp();
    }
}