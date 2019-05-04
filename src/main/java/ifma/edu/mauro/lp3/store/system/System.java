package ifma.edu.mauro.lp3.store.system;

import ifma.edu.mauro.lp3.store.gui.swing.FormOrder;
import ifma.edu.mauro.lp3.store.pesistence.jdbc.mysql.Conexao;

import java.sql.Connection;
import java.sql.SQLException;

public class System {
    private static System ourInstance = new System();

    public static System getInstance() {
        return ourInstance;
    }

    private System() {
    }

    public static void main(String[] args) throws SQLException {
       FormOrder.getInstance().setVisible(true);
    }
}
