package com.mycompany.Sistemacomerci;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static Connection conectar() throws SQLException {

        String url = "jdbc:mysql://localhost:3306/comercio_electronico";
        String usuario = "root";
        String clave = "123456";

        return DriverManager.getConnection(url, usuario, clave);
    }
}