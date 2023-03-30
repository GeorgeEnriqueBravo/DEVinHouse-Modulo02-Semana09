import java.sql.*;

public class SalvandoObjeto {
    public static void main(String[] args) {



        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/dihphilips", "admin", "dihmaior")) {

            Statement stm = connection.createStatement();

            stm.execute("INSERT INTO PRODUTOS (nome, descricao, preco, qtd_estoque) VALUES ('Curso Spring', 'Framework Java', 1000, 10)");

        } catch (SQLException e) {

            System.out.println("Ocorreu um problema ao conectar com o BD. " + e.getMessage());
        }


    }
}
