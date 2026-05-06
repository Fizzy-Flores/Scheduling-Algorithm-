//EventDriven_Flores
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventDriven extends JFrame {

    
    JLabel lblFirst, lblLast, lblMiddle, lblMobile, lblEmail;
    JTextField txtFirst, txtLast, txtMiddle, txtMobile, txtEmail;
    JButton btnSubmit, btnClear;

    
    JFrame outputFrame;
    JTextArea txtOutput;
    JButton btnOkay;

    public EventDriven() {

        setTitle("INPUT");
        setSize(350,350);
        setLayout(new GridLayout(7,2,5,5));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lblFirst = new JLabel("First Name:");
        lblLast = new JLabel("Last Name:");
        lblMiddle = new JLabel("Middle Name:");
        lblMobile = new JLabel("Mobile Number:");
        lblEmail = new JLabel("Email Address:");

        txtFirst = new JTextField();
        txtLast = new JTextField();
        txtMiddle = new JTextField();
        txtMobile = new JTextField();
        txtEmail = new JTextField();

        btnSubmit = new JButton("Submit");
        btnClear = new JButton("Clear All");

        add(lblFirst); add(txtFirst);
        add(lblLast); add(txtLast);
        add(lblMiddle); add(txtMiddle);
        add(lblMobile); add(txtMobile);
        add(lblEmail); add(txtEmail);
        add(btnSubmit); add(btnClear);

        btnSubmit.addActionListener(new btnSubmit());
        btnClear.addActionListener(new btnClearAll());

        setVisible(true);
    }

    
    class btnSubmit implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            outputFrame = new JFrame("OUTPUT");
            outputFrame.setSize(300,250);
            outputFrame.setLayout(new BorderLayout());

            txtOutput = new JTextArea();
            txtOutput.setEditable(false);

            txtOutput.setText(
                    "First Name: " + txtFirst.getText() + "\n" +
                    "Last Name: " + txtLast.getText() + "\n" +
                    "Middle Name: " + txtMiddle.getText() + "\n" +
                    "Mobile No.: " + txtMobile.getText() + "\n" +
                    "Email Add.: " + txtEmail.getText()
            );

            btnOkay = new JButton("Okay");
            btnOkay.addActionListener(new btnOkay());

            outputFrame.add(txtOutput, BorderLayout.CENTER);
            outputFrame.add(btnOkay, BorderLayout.SOUTH);

            outputFrame.setVisible(true);

            btnSubmit.setEnabled(false);
        }
    }

    
    class btnClearAll implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            txtFirst.setText("");
            txtLast.setText("");
            txtMiddle.setText("");
            txtMobile.setText("");
            txtEmail.setText("");

            btnSubmit.setEnabled(true);

            if(outputFrame != null)
                outputFrame.dispose();
        }
    }

    
    class btnOkay implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            outputFrame.dispose();

            txtFirst.setText("");
            txtLast.setText("");
            txtMiddle.setText("");
            txtMobile.setText("");
            txtEmail.setText("");

            btnSubmit.setEnabled(true);
        }
    }

    public static void main(String[] args) {
        new EventDriven();
    }
}