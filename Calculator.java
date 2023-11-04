import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JTextField inputField;
    private JButton[] digitButtons;
    private JButton addButton, subtractButton, multiplyButton, divideButton, equalsButton, clearButton;

    private double currentNumber = 0;
    private String operator = "";
    private boolean isOperatorClicked = false;

    public Calculator() {
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        inputField = new JTextField();
        inputField.setHorizontalAlignment(JTextField.RIGHT);
        add(inputField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(5, 4));
        add(buttonPanel, BorderLayout.CENTER);

        digitButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            digitButtons[i] = new JButton(String.valueOf(i));
            digitButtons[i].addActionListener(new DigitButtonActionListener());
            buttonPanel.add(digitButtons[i]);
        }

        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");
        equalsButton = new JButton("=");
        clearButton = new JButton("C");

        addButton.addActionListener(new OperatorButtonActionListener());
        subtractButton.addActionListener(new OperatorButtonActionListener());
        multiplyButton.addActionListener(new OperatorButtonActionListener());
        divideButton.addActionListener(new OperatorButtonActionListener());
        equalsButton.addActionListener(new EqualsButtonActionListener());
        clearButton.addActionListener(new ClearButtonActionListener());

        buttonPanel.add(addButton);
        buttonPanel.add(subtractButton);
        buttonPanel.add(multiplyButton);
        buttonPanel.add(divideButton);
        buttonPanel.add(equalsButton);
        buttonPanel.add(clearButton);
    }

    private class DigitButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            String buttonText = source.getText();
            if (isOperatorClicked) {
                inputField.setText(buttonText);
                isOperatorClicked = false;
            } else {
                inputField.setText(inputField.getText() + buttonText);
            }
        }
    }

    private class OperatorButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            operator = source.getText();
            currentNumber = Double.parseDouble(inputField.getText());
            isOperatorClicked = true;
        }
    }

    private class EqualsButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double secondNumber = Double.parseDouble(inputField.getText());
            double result = 0;

            switch (operator) {
                case "+":
                    result = currentNumber + secondNumber;
                    break;
                case "-":
                    result = currentNumber - secondNumber;
                    break;
                case "*":
                    result = currentNumber * secondNumber;
                    break;
                case "/":
                    if (secondNumber != 0) {
                        result = currentNumber / secondNumber;
                    } else {
                        inputField.setText("Error");
                        return;
                    }
                    break;
            }

            inputField.setText(String.valueOf(result));
            isOperatorClicked = true;
        }
    }

    private class ClearButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            inputField.setText("");
            currentNumber = 0;
            operator = "";
            isOperatorClicked = false;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Calculator calculator = new Calculator();
            calculator.setVisible(true);
        });
    }
}
