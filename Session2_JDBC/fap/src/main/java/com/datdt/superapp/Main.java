package com.datdt.superapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Connection conn = null;
        try {

            String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=hsf302;encrypt=true;trustServerCertificate=true";
            String user = "sa";
            String pass = "1234";
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(dbURL, user, pass);
//            System.out.println("Connect to DB successfully");
            PreparedStatement pstmt = conn.prepareStatement("select * from Subject");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                String code = rs.getString("Code");
                String name = rs.getString("Name");
                int credit = rs.getInt("Credits");
                int hours = rs.getInt("StudyHours");
//                System.out.println(code + "|" + name + "|" + credit + "|" + hours);
                System.out.printf("|%10s|-%40s|%2d|%4d|\n",code,name,credit,hours);


            }
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}