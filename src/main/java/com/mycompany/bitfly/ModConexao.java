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

    private String usuario = "root";
    private String senha = "admin";
    private String host = "localhost";
    private String porta = "3306";
    private String bd = "TB_USUARIO";
    
    public Connection obtemConexao (){
    try{
        Connection c = DriverManager.getConnection(
        "jdbc:mysql://" + host + ":" + porta + "/" + bd,
        usuario,
        senha
    );
        return c;
    }catch (Exception e){
        e.printStackTrace();
        return null;
    }
  }
}

