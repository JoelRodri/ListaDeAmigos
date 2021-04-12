package com.company;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BaseDeDatos {
    static final String url = "jdbc:sqlite:database.db";

    static BaseDeDatos instance;
    static Connection connection;

    public static BaseDeDatos get(){
        if(instance == null){
            instance = new BaseDeDatos();

            try {
                connection = DriverManager.getConnection(url);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        }
        return instance;
    }

    void deleteTables(){
        try (Statement statement = connection.createStatement()) {
            statement.execute("DROP TABLE IF EXISTS estudiantes");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    void deleteContacto(String nombre){
        String sql=("DELETE FROM estudiantes WHERE nombre=?;");
        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setString(1, nombre);
        } catch (Exception e){
            Mensaje mensaje = new Mensaje();
            mensaje.mostrarWarn("Este contacto no existe");
        }
    }

    void createTables(){
        try (Statement statement = connection.createStatement()) {
            statement.execute("CREATE TABLE IF NOT EXISTS estudiantes (nombre text, apellidos text, telefono text, correo text, discord text)");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void insertContacto(String nombre, String apellidos, String telefono, String correo, String discord) {
        String sql = "INSERT INTO estudiantes(nombre,apellidos,telefono,correo,discord) VALUES(?,?,?,?,?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, nombre);
            preparedStatement.setString(2, apellidos);
            preparedStatement.setString(3, telefono);
            preparedStatement.setString(4, correo);
            preparedStatement.setString(5, discord);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Nota> selectContacto(){
        String sql = "SELECT nombre, apellidos, telefono, correo, discord FROM estudiantes";

        List<Nota> listaEstudiantes = new ArrayList<>();
        try (PreparedStatement preparedStatement  = connection.prepareStatement(sql)){

            ResultSet resultSet  = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String nombre = resultSet.getString("nombre");
                String apellidos = resultSet.getString("apellidos");
                String telefono = resultSet.getString("telefono");
                String correo = resultSet.getString("correo");
                String discord = resultSet.getString("discord");

                listaEstudiantes.add(new Nota(nombre, apellidos, telefono, correo, discord));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return listaEstudiantes;
    }
}
