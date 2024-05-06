/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bitfly;

import java.sql.*;

/**
 *
 * @author rafae
 */
public class ModConexao {
    
  public static Connection conector(){
    java.sql.Connection conexao = null;
    
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
         conexao = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/DB_BITFLY",
        "root", "admin");
        return conexao;
    }catch (Exception e){
        System.out.println(e);
        return null;
    }
    
  }

}

