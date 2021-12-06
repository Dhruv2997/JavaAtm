import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccountFrame extends JFrame
{

    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 500;
    private static final double INITIAL_BALANCE = 0;
    double result;
    private JLabel initiallabel;
    private JLabel depositlabel;
    private JLabel withdrawlabel;
    private JTextField depositfield;
    private JTextField withdrawfield;
    private JButton depositbutton;
    private JButton withdrawbutton;
    private JLabel resultlabel;
    private JPanel panel;
    private BankAccount account;

    public AccountFrame()
    {
        account = new BankAccount(INITIAL_BALANCE);

        resultlabel = new JLabel("New Balance: $" + account.getBalance());

        createTextField();
        createButton();
        createPanel();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    private void createTextField()
    {
        final int FIELD_WIDTH = 10;

        initiallabel = new JLabel("Current Balance  $" + INITIAL_BALANCE);

        depositlabel = new JLabel("Deposit: ");
        depositfield = new JTextField(FIELD_WIDTH);

        withdrawlabel = new JLabel("Withdraw: ");
        withdrawfield = new JTextField(FIELD_WIDTH);
    }

    private void createButton()
    {
        depositbutton = new JButton("Deposit");
        class DepositListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                double dp = Double.parseDouble(depositfield.getText());
                double dpamount = account.getBalance() + dp;
                account.deposit(dpamount);
                result = dpamount;
                resultlabel.setText("Balance: " + result);
            }
        }
        ActionListener d = new DepositListener();
        depositbutton.addActionListener(d);


        withdrawbutton = new JButton("Withdraw");
        class WithdrawListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                double wd = Double.parseDouble(withdrawfield.getText());
                // double wdamount = account.getBalance() - wd;
                account.withdraw(wd);
                // result = wdamount;
                resultlabel.setText("Balance: " + account.getBalance());
            }
        }
        ActionListener w = new WithdrawListener();
        withdrawbutton.addActionListener(w);

    }

    private void createPanel()
    {
        panel = new JPanel();
        panel.add(initiallabel);
        panel.add(depositlabel);
        panel.add(depositfield);
        panel.add(depositbutton);
        panel.add(withdrawlabel);
        panel.add(withdrawfield);
        panel.add(withdrawbutton);
        panel.add(resultlabel);
        add(panel);
    }
}

