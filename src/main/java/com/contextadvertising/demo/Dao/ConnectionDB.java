package com.contextadvertising.demo.Dao;

import java.sql.*;

public class ConnectionDB {
    // Блок объявления констант
    public static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";
    public static final String DB_Driver = "oracle.jdbc.OracleDriver";
    public static Connection connection;

    public static void open() {
        try {
            Class.forName(DB_Driver); //Проверяем наличие JDBC драйвера для работы с БД
            connection = DriverManager.getConnection(DB_URL, "C##LEARNINGSQL", "1234");//соединениесБД
            System.out.println("Соединение с СУБД выполнено.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // обработка ошибки  Class.forName
            System.out.println("JDBC драйвер для СУБД не найден!");
        } catch (SQLException e) {
            e.printStackTrace(); // обработка ошибок  DriverManager.getConnection
            System.out.println("Ошибка SQL !");
        }
    }
    public static void close(){
        try{
            connection.close();
            System.out.println("Соединение с СУБД закрыто.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
