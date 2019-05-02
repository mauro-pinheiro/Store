package ifma.edu.mauro.lp3.store.jdbc;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMysql {
    public static Connection getConexaoMySQL(){
        Connection conn = null;
        try {
            String driverName = "com.mysql.cj.jdbc.Driver";
            Class.forName(driverName);

            String serverName = "localhost";
            String mydatabase = "concurso";

            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;

            String username = "root";
            String password = "pinheirom25";

            conn = DriverManager.getConnection(url, username, password);

            if (conn != null) {
                JOptionPane.showMessageDialog(null, "Connectado com sucesso", "Status", JOptionPane.INFORMATION_MESSAGE);
            }
            return conn;
        } catch(ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,"O driver expecificado nao foi encontrado","Status",JOptionPane.ERROR_MESSAGE);
            return null;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Nao foi possivel conectar","Status",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public static boolean FecharConexao(){
        try{
            ConnectionMysql.getConexaoMySQL().close();
            return true;
        } catch (SQLException e){
            return false;
        }
    }
}
