package BancoDeDados;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Registro {
    private static final String URL = "jdbc:mysql://localhost:3306/sistema_locacao"; // Atualize o nome do banco de dados
    private static final String USER = "root"; // Atualize seu usuário do banco de dados
    private static final String PASSWORD = "password"; // Atualize sua senha


    public void inserirVeiculo(int codigoVeiculo, String modelo, String placa, double valorDiaria, boolean disponibilidade) {
        String sql = "INSERT INTO veiculos (codigoVeiculo, modelo, placa, valorDiaria, disponibilidade) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, codigoVeiculo);
            stmt.setString(2, modelo);
            stmt.setString(3, placa);
            stmt.setDouble(4, valorDiaria);
            stmt.setBoolean(5, disponibilidade);
            stmt.executeUpdate();
            System.out.println("Veículo inserido com sucesso!");
        } catch (SQLException e) {
            System.err.println("Erro ao inserir veículo: " + e.getMessage());
        }
    }


    public void listarVeiculos() {
        String sql = "SELECT * FROM veiculos";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                System.out.println("Código: " + rs.getInt("codigoVeiculo"));
                System.out.println("Modelo: " + rs.getString("modelo"));
                System.out.println("Placa: " + rs.getString("placa"));
                System.out.println("Valor Diária: " + rs.getDouble("valorDiaria"));
                System.out.println("Disponibilidade: " + rs.getBoolean("disponibilidade"));
                System.out.println("-----------------------------");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar veículos: " + e.getMessage());
        }
    }


    public void atualizarDisponibilidade(int codigoVeiculo, boolean novaDisponibilidade) {
        String sql = "UPDATE veiculos SET disponibilidade = ? WHERE codigoVeiculo = ?";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setBoolean(1, novaDisponibilidade);
            stmt.setInt(2, codigoVeiculo);
            stmt.executeUpdate();
            System.out.println("Disponibilidade atualizada com sucesso!");
        } catch (SQLException e) {
            System.err.println("Erro ao atualizar disponibilidade: " + e.getMessage());
        }
    }


    public void removerVeiculo(int codigoVeiculo) {
        String sql = "DELETE FROM veiculos WHERE codigoVeiculo = ?";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, codigoVeiculo);
            stmt.executeUpdate();
            System.out.println("Veículo removido com sucesso!");
        } catch (SQLException e) {
            System.err.println("Erro ao remover veículo: " + e.getMessage());
        }
    }
}

