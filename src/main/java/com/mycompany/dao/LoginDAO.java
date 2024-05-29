/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import com.mycompany.telas.TelaInicialAdmin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
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
            TelaInicialAdmin TelaInicial = new TelaInicialAdmin();
            TelaInicial.setVisible(true);
        }else {
            JOptionPane.showMessageDialog( null, "Usuário ou senha incorreta");
        }
        conexao.close(); 
     }
     
     public void cadastrarEvento(String empresa, String dia, String horario, String lugar, String cnpj) throws SQLException {
        Connection conexao = new ModConexao().getConnection();
        String sql = "INSERT INTO TB_EVENTOS(empresa, dia, horario, lugar, cnpj) VALUES ('"+empresa+"','"+dia+"','"+horario+"','"+lugar+"','"+cnpj+"')";
        System.out.println(sql);
        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.execute();  
        conexao.close();        
     } 
}
