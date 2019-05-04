package ifma.edu.mauro.lp3.store.pesistence.jdbc.mysql;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

public class Conexao {
    private static String url = "jdbc:mysql://localhost/store?useTimezone=true&serverTimezone=UTC";
    public static Connection getConexao() throws SQLException {
        //Class.forName("com.mysql.cj.jdbc.Driver");

        try(Connection con = DriverManager.getConnection(url,"root","pinheirom25")){
            JOptionPane.showMessageDialog(null,"Sucesso");
            return con;
        }
    }

    public static boolean findCustomer(String companyName) throws SQLException{
        try(Connection con = DriverManager.getConnection(url, "javaApp","1234")){
            try(PreparedStatement statement = con.prepareStatement("select * from customers where companyName = ?")){
                statement.setString(1,companyName);
                ResultSet result = statement.executeQuery();
                return result.next();
            }
        }
    }
}
