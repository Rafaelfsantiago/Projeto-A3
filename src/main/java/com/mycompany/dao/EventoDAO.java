/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author rafae
 */
public class EventoDAO {
    public void cadastrarEvento(String empresa, String data_evento, String horario_inicio, String horario_termino, String desc_evento) throws SQLException {
        Connection conexao = new ModConexao().getConnection();
        String sql = "INSERT INTO TB_EVENTOS(empresa, data_evento, horario_inicio, horario_termino, desc_evento) VALUES ('"+empresa+"','"+data_evento+"','"+horario_inicio+"','"+horario_termino+"','"+desc_evento+"')";
        System.out.println(sql);
        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.execute();  
        conexao.close();  
        
        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
     } 
    
    public void visualizarEvento(String empresa, String data_evento, String horario_inicio, String horario_termino, String desc_evento) throws SQLException{
        Connection conexao = new ModConexao().getConnection();
        String sql = "SELECT usuario, senha FROM TB_USUARIO WHERE '"+empresa+"', '"+data_evento+"','"+horario_inicio+"','"+horario_termino+"', '"+desc_evento+"'";
        System.out.println(sql);
        PreparedStatement statement = conexao.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();
    }
    
}
