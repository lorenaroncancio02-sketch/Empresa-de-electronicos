package com.mycompany.Sistemacomerci;

import java.sql.Connection;

public class Sistemacomerci {

    public static void main(String[] args) {

        try {
            Connection conexion = Conexion.conectar();

            System.out.println("CONEXION EXITOSA CON MYSQL");

            conexion.close();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}