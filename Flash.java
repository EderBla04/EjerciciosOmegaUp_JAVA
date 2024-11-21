package NOSE;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.text.DecimalFormat;

public class Flash extends JFrame {

    JLabel triedLabel = new JLabel();
    JTextField triedTextField = new JTextField();
    JLabel correctLabel = new JLabel();
    JTextField correctTextField = new JTextField();
    JLabel problemLabel = new JLabel();
    JLabel dividerLabel = new JLabel();
    JPanel typePanel = new JPanel();
    JCheckBox[] typeCheckBox = new JCheckBox[4];
    JPanel factorPanel = new JPanel();
    ButtonGroup factorButtonGroup = new ButtonGroup();
    JRadioButton[] factorRadioButton = new JRadioButton[11];
    JPanel timerPanel = new JPanel();
    ButtonGroup timerButtonGroup = new ButtonGroup();
    JRadioButton[] timerRadioButton = new JRadioButton[3];
    JTextField timerTextField = new JTextField();
    JScrollBar timerScrollBar = new JScrollBar();
    JButton startButton = new JButton();
    JButton exitButton = new JButton();
    Timer problemsTimer;

    Font myFont = new Font("Arial", Font.PLAIN, 18);
    Color lightBlue = new Color(192, 192, 255);
    Random myRandom = new Random();

    int numberTried, numberCorrect;
    int correctAnswer, numberDigits;
    String problem;
    String yourAnswer;
    int digitNumber;
    int problemTime;

    public static void main(String[] args) {
        // Create frame
        new Flash().setVisible(true);
    }

    public Flash() {
        // Frame constructor
        setTitle("Flash Card Math");
        getContentPane().setBackground(new Color(255, 255, 192));
        setResizable(false);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                exitForm(evt);
            }
        });

        getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints gridConstraints;

        triedLabel.setText("Tried:");
        triedLabel.setFont(myFont);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 0;
        gridConstraints.anchor = GridBagConstraints.WEST;
        gridConstraints.insets = new Insets(10, 10, 0, 10);
        getContentPane().add(triedLabel, gridConstraints);

        triedTextField.setText("0");
        triedTextField.setPreferredSize(new Dimension(90, 30));
        triedTextField.setEditable(false);
        triedTextField.setBackground(Color.RED);
        triedTextField.setForeground(Color.YELLOW);
        triedTextField.setHorizontalAlignment(SwingConstants.CENTER);
        triedTextField.setFont(myFont);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 0;
        gridConstraints.insets = new Insets(10, 0, 0, 0);
        getContentPane().add(triedTextField, gridConstraints);

        correctLabel.setText("Correct:");
        correctLabel.setFont(myFont);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 2;
        gridConstraints.gridy = 0;
        gridConstraints.anchor = GridBagConstraints.EAST;
        gridConstraints.insets = new Insets(10, 10, 0, 10);
        getContentPane().add(correctLabel, gridConstraints);

        correctTextField.setText("0");
        correctTextField.setPreferredSize(new Dimension(90, 30));
        correctTextField.setEditable(false);
        correctTextField.setBackground(Color.RED);
        correctTextField.setForeground(Color.YELLOW);
        correctTextField.setHorizontalAlignment(SwingConstants.CENTER);
        correctTextField.setFont(myFont);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 3;
        gridConstraints.gridy = 0;
        gridConstraints.insets = new Insets(10, 0, 0, 0);
        getContentPane().add(correctTextField, gridConstraints);

        problemLabel.setText("");
        problemLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        problemLabel.setPreferredSize(new Dimension(450, 100));
        problemLabel.setBackground(Color.WHITE);
        problemLabel.setOpaque(true);
        problemLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 48));
        problemLabel.setHorizontalAlignment(SwingConstants.CENTER);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 1;
        gridConstraints.gridwidth = 5;
        gridConstraints.insets = new Insets(10, 10, 0, 10);
        getContentPane().add(problemLabel, gridConstraints);

        problemLabel.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                problemLabelKeyPressed(e);
            }
        });

        dividerLabel.setPreferredSize(new Dimension(450, 10));
        dividerLabel.setBackground(Color.RED);
        dividerLabel.setOpaque(true);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 2;
        gridConstraints.gridwidth = 5;
        gridConstraints.insets = new Insets(10, 10, 10, 10);
        getContentPane().add(dividerLabel, gridConstraints);

        UIManager.put("TitledBorder.font", new Font("Arial", Font.BOLD, 14));
        typePanel.setPreferredSize(new Dimension(130, 130));
        typePanel.setBorder(BorderFactory.createTitledBorder("Type:"));
        typePanel.setBackground(lightBlue);
        typePanel.setLayout(new GridBagLayout());
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 3;
        gridConstraints.gridwidth = 2;
        gridConstraints.anchor = GridBagConstraints.NORTH;
        getContentPane().add(typePanel, gridConstraints);

        for (int i = 0; i < 4; i++) {
            typeCheckBox[i] = new JCheckBox();
            typeCheckBox[i].setBackground(lightBlue);
            gridConstraints = new GridBagConstraints();
            gridConstraints.gridx = 0;
            gridConstraints.gridy = i;
            gridConstraints.anchor = GridBagConstraints.WEST;
            typePanel.add(typeCheckBox[i], gridConstraints);

            int index = i; // Create a final variable to use in the lambda
            typeCheckBox[i].addActionListener(e -> typeCheckBoxActionPerformed(index));
        }

        typeCheckBox[0].setText("Addition");
        typeCheckBox[1].setText("Subtraction");
        typeCheckBox[2].setText("Multiplication");
        typeCheckBox[3].setText("Division");
        typeCheckBox[0].setSelected(true);

        factorPanel.setPreferredSize(new Dimension(130, 130));
        factorPanel.setBorder(BorderFactory.createTitledBorder("Factor:"));
        factorPanel.setBackground(lightBlue);
        factorPanel.setLayout(new GridBagLayout());
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 2;
        gridConstraints.gridy = 3;
        gridConstraints.gridwidth = 2;
        gridConstraints.anchor = GridBagConstraints.NORTH;
        getContentPane().add(factorPanel, gridConstraints);

        int x = 0;
        int y = 0;
        for (int i = 0; i < 11; i++) {
            factorRadioButton[i] = new JRadioButton();
            factorRadioButton[i].setText(String.valueOf(i));
            factorRadioButton[i].setBackground(lightBlue);
            factorButtonGroup.add(factorRadioButton[i]);
            gridConstraints = new GridBagConstraints();
            gridConstraints.gridx = x;
            gridConstraints.gridy = y;
            gridConstraints.anchor = GridBagConstraints.WEST;
            factorPanel.add(factorRadioButton[i], gridConstraints);

            int index = i; // Create a final variable to use in the lambda
            factorRadioButton[i].addActionListener(e -> factorRadioButtonActionPerformed(index));

            x++;
            if (x > 1) {
                x = 0;
                y++;
            }
        }
        factorRadioButton[10].setText("Random");
        factorRadioButton[10].setSelected(true);

        timerPanel.setPreferredSize(new Dimension(130, 130));
        timerPanel.setBorder(BorderFactory.createTitledBorder("Timer:"));
        timerPanel.setBackground(lightBlue);
        timerPanel.setLayout(new GridBagLayout());
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 4;
        gridConstraints.gridy = 3;
        gridConstraints.insets = new Insets(0, 0, 0, 10);
        gridConstraints.anchor = GridBagConstraints.NORTH;
        getContentPane().add(timerPanel, gridConstraints);

        for (int i = 0; i < 3; i++) {
            timerRadioButton[i] = new JRadioButton();
            timerRadioButton[i].setBackground(lightBlue);
            timerButtonGroup.add(timerRadioButton[i]);
            gridConstraints = new GridBagConstraints();
            gridConstraints.gridx = 0;
            gridConstraints.gridy = i;
            gridConstraints.gridwidth = 2;
            gridConstraints.anchor = GridBagConstraints.WEST;
            timerPanel.add(timerRadioButton[i], gridConstraints);

            int index = i; // Create a final variable to use in the lambda
            timerRadioButton[i].addActionListener(e -> timerRadioButtonActionPerformed(index));
        }

        timerRadioButton[0].setText("Off");
        timerRadioButton[1].setText("On-Count Up");
        timerRadioButton[2].setText("On-Count Down");
        timerRadioButton[0].setSelected(true);

        timerTextField.setPreferredSize(new Dimension(50, 30));
        timerTextField.setEditable(false);
        timerTextField.setFont(myFont);
        timerTextField.setHorizontalAlignment(SwingConstants.CENTER);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 2;
        gridConstraints.gridy = 5;
        gridConstraints.insets = new Insets(10, 0, 0, 0);
        getContentPane().add(timerTextField, gridConstraints);

        timerScrollBar.setPreferredSize(new Dimension(90, 20));
        timerScrollBar.setMinimum(1);
        timerScrollBar.setMaximum(120);
        timerScrollBar.setValue(30);
        timerScrollBar.addAdjustmentListener(e -> timerScrollBarAdjustmentValueChanged());
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 2;
        gridConstraints.gridy = 6;
        gridConstraints.insets = new Insets(10, 0, 0, 0);
        getContentPane().add(timerScrollBar, gridConstraints);

        startButton.setText("Start");
        startButton.setPreferredSize(new Dimension(100, 40));
        startButton.setFont(myFont);
        startButton.addActionListener(e -> startButtonActionPerformed());
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 7;
        gridConstraints.insets = new Insets(10, 10, 10, 10);
        gridConstraints.anchor = GridBagConstraints.WEST;
        getContentPane().add(startButton, gridConstraints);

        exitButton.setText("Exit");
        exitButton.setPreferredSize(new Dimension(100, 40));
        exitButton.setFont(myFont);
        exitButton.addActionListener(e -> exitButtonActionPerformed());
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 4;
        gridConstraints.gridy = 7;
        gridConstraints.insets = new Insets(10, 10, 10, 10);
        gridConstraints.anchor = GridBagConstraints.EAST;
        getContentPane().add(exitButton, gridConstraints);

        pack();
    }

    private void startButtonActionPerformed() {
        // Initialize or restart the game
        numberTried = 0;
        numberCorrect = 0;
        triedTextField.setText(String.valueOf(numberTried));
        correctTextField.setText(String.valueOf(numberCorrect));

        // Other initialization code for the game
        problemTime = timerScrollBar.getValue();
        startTimer();
        generateProblem();
    }

    private void exitButtonActionPerformed() {
        System.exit(0);
    }

    private void typeCheckBoxActionPerformed(int index) {
        // Handle type checkbox changes
    }

    private void factorRadioButtonActionPerformed(int index) {
        // Handle factor radio button changes
    }

    private void timerRadioButtonActionPerformed(int index) {
        // Handle timer radio button changes
    }

    private void timerScrollBarAdjustmentValueChanged() {
        // Handle timer scrollbar adjustments
        timerTextField.setText(String.valueOf(timerScrollBar.getValue()));
    }

    private void problemLabelKeyPressed(KeyEvent e) {
        // Handle key events for answering problems
        char keyChar = e.getKeyChar();
        if (Character.isDigit(keyChar)) {
            yourAnswer = yourAnswer + keyChar;
            problemLabel.setText(yourAnswer);
        } else if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            checkAnswer();
        } else if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE && !yourAnswer.isEmpty()) {
            yourAnswer = yourAnswer.substring(0, yourAnswer.length() - 1);
            problemLabel.setText(yourAnswer);
        }
    }

    private void checkAnswer() {
        // Check the answer and update the score
        int userAnswer = Integer.parseInt(yourAnswer);
        if (userAnswer == correctAnswer) {
            numberCorrect++;
        }
        numberTried++;
        triedTextField.setText(String.valueOf(numberTried));
        correctTextField.setText(String.valueOf(numberCorrect));
        generateProblem();
    }

    private void generateProblem() {
        // Generate a new problem based on selected types and factors
        // Example code to generate a random problem
        int factor1 = myRandom.nextInt(10) + 1;
        int factor2 = myRandom.nextInt(10) + 1;
        correctAnswer = factor1 + factor2; // Assuming addition
        problem = factor1 + " + " + factor2;
        problemLabel.setText(problem);
        yourAnswer = "";
    }

    private void startTimer() {
        // Start the timer for the game
        if (problemsTimer != null) {
            problemsTimer.stop();
        }
        problemsTimer = new Timer(1000, e -> {
            // Timer event handler
            problemTime--;
            if (problemTime <= 0) {
                problemsTimer.stop();
                // Handle timer expiration
            }
        });
        problemsTimer.start();
    }

    private void exitForm(WindowEvent evt) {
        System.exit(0);
    }
}

