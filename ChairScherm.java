package ChairPackage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChairScherm {
    private JPasswordField Password;
    private JPanel MainLogin;
    private JTextField Username;
    private JButton loginButton;

    public ChairScherm() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String Login = Username.getText();
                String Wachtwoord = Password.getText();

                if (Login.equals("Emir") && Wachtwoord.equals("Erkan"));

                System.out.println("U bent ingelogd.");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ChairLogin");
        frame.setContentPane(new ChairScherm().MainLogin);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
