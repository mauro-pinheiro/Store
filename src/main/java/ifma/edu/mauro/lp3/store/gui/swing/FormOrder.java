package ifma.edu.mauro.lp3.store.gui.swing;

import ifma.edu.mauro.lp3.store.pesistence.jdbc.mysql.Conexao;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class FormOrder extends JFrame {
    private static FormOrder outInstance = null;
    public static synchronized FormOrder getInstance(){
        if(outInstance == null)
            outInstance = new FormOrder();
        return outInstance;
    }

    private final int pad = 10;

    private JLabel lbCustomer = new JLabel("Cliente");
    private JTextField tfCustomer = new JTextField(10);

    private FormOrder() {
        setTitle("Compra");
        SpringLayout layout = new SpringLayout();
        setLayout(layout);

        this.getContentPane().add(lbCustomer);
        layout.putConstraint(SpringLayout.WEST, lbCustomer, pad, SpringLayout.WEST, this.getContentPane());
        layout.putConstraint(SpringLayout.VERTICAL_CENTER, lbCustomer, 0, SpringLayout.VERTICAL_CENTER, tfCustomer);

        this.getContentPane().add(tfCustomer);
        tfCustomer.addActionListener(e -> {
            try {
                if(Conexao.findCustomer(tfCustomer.getText())){
                    tfCustomer.setForeground(Color.RED);
                } else {
                    tfCustomer.setForeground(Color.GREEN);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        });
        layout.putConstraint(SpringLayout.NORTH, tfCustomer, pad, SpringLayout.NORTH, this.getContentPane());
        layout.putConstraint(SpringLayout.WEST, tfCustomer,pad, SpringLayout.EAST, lbCustomer);

        //Resize JFrame
        layout.putConstraint(SpringLayout.EAST, getContentPane(), pad, SpringLayout.EAST, tfCustomer);
        layout.putConstraint(SpringLayout.SOUTH, getContentPane(), pad, SpringLayout.SOUTH, tfCustomer);
        setLocationRelativeTo(null);
        pack();
        this.setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
