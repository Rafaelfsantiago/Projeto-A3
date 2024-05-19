/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import com.mycompany.telas.TelaInicial;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author rafae
 */
public class LoginDAO {
    
    public void cadastrarUsuario(String usuario, String email, String senha) throws SQLException {
        Connection conexao = new ModConexao().getConnection();
        String sql = "INSERT INTO TB_USUARIO(usuario, email, senha) VALUES ('"+usuario+"','"+email+"','"+senha+"')";
        System.out.println(sql);
        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.execute();
        conexao.close();   
    }
     public void Login(String usuario, String senha) throws SQLException{
         Connection conexao = new ModConexao().getConnection();
        String sql = "SELECT usuario, senha FROM TB_USUARIO WHERE usuario = '"+usuario+"' AND senha = '"+senha+"'";
        System.out.println(sql);
        PreparedStatement statement = conexao.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();
        
        if(rs.next()){
            TelaInicial TelaInicial = new TelaInicial();
            TelaInicial.setVisible(true);
        }else {
            System.out.println( "Usuário ou senha incorreta");
        }
        conexao.close();   
     }
}
