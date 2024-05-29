/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author rafae
 */
public class CadastroEventoDAO {
    
    public void cadastrarEvento(String empresa, String dia, String horario, String lugar, String cnpj) throws SQLException {
        Connection conexao = new ModConexao().getConnection();
        String sql = "INSERT INTO TB_EVENTOS(empresa, dia, horario, lugar, cnpj) VALUES ('"+empresa+"','"+dia+"','"+horario+"','"+lugar+"','"+cnpj+"')";
        System.out.println(sql);
        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.execute();  
        conexao.close();        
     } 
}
