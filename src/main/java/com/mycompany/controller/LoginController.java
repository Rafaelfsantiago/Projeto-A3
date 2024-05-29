/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controller;

import com.mycompany.dao.LoginDAO;
import com.mycompany.dao.ModConexao;
import com.mycompany.telas.TelaCadastro;
import com.mycompany.telas.TelaCadastroEvento;
import com.mycompany.telas.TelaLogin;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author rafae
 */
public class LoginController {

    public void cadastroUsuario(TelaCadastro view) throws SQLException{
        
        Connection conexao = new ModConexao().getConnection();
        LoginDAO cadastro = new LoginDAO();
        cadastro.cadastrarUsuario(view.getTxtCadastroUsuario().getText(),view.getTxtCadastroEmail().getText(), view.getTxtCadastroSenha().getText());  
  
    }
    
     public void loginUsuario(TelaLogin view) throws SQLException{
        
        Connection conexao = new ModConexao().getConnection();
        LoginDAO login = new LoginDAO();
        login.Login(view.getTxtUsuario().getText(), view.getTxtSenha().getText());
    }

    public void cadastroEvento(TelaCadastroEvento view) throws SQLException {
       Connection conexao = new ModConexao().getConnection();
       LoginDAO cadastro = new LoginDAO();
       cadastro.cadastrarEvento(view.getTxtCadastroEmpresa().getText(), view.getTxtCadastroCnpj().getText(), view.getTxtCadastroHorario().getText(), view.getTxtCadastroLugar().getText(), view.getTxtCadastroDia().getText());
      
    }
}
