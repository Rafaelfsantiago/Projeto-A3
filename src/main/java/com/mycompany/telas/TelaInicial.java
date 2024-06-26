/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.telas;

import com.mycompany.dao.EventoDAO;
import com.mycompany.login.VisualizarEvento;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author rafae
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial2
     */
    
    public TelaInicial() {
        initComponents();
       setLocationRelativeTo(null);
        buscarEvento();
        jComboBox1.addActionListener((e) -> preencherCampos());
    }
    
    
     private void buscarEvento() {
        try {
            EventoDAO EventoDAO = new EventoDAO();
            VisualizarEvento[] evento = EventoDAO.obterEvento();
            jComboBox1.setModel(new DefaultComboBoxModel(evento));
            preencherCampos();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void preencherCampos() {
      VisualizarEvento selecionado = (VisualizarEvento)jComboBox1.getSelectedItem();
        if(selecionado != null) {
              lblEmpresa.setText( selecionado.getEmpresa());
              lblData_evento.setText(selecionado.getData_evento());
              lblHorario_inicio.setText(selecionado.getHorario_inicio());
              lblHorario_termino.setText(selecionado.getHorario_termino());
              lblDesc_evento.setText(selecionado.getDesc_evento());
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        lblEmpresa = new javax.swing.JLabel();
        lblData_evento = new javax.swing.JLabel();
        lblHorario_inicio = new javax.swing.JLabel();
        lblHorario_termino = new javax.swing.JLabel();
        lblDesc_evento = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        menu = new javax.swing.JMenuBar();
        menuCadEventos = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha um evento" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 83, 239, -1));

        lblEmpresa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        lblEmpresa.setText("Empresa");
        getContentPane().add(lblEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 123, 239, -1));

        lblData_evento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblData_evento.setForeground(new java.awt.Color(255, 255, 255));
        lblData_evento.setText("Data");
        getContentPane().add(lblData_evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 161, 239, -1));

        lblHorario_inicio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblHorario_inicio.setForeground(new java.awt.Color(255, 255, 255));
        lblHorario_inicio.setText("Horário de início");
        getContentPane().add(lblHorario_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 199, 239, -1));

        lblHorario_termino.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblHorario_termino.setForeground(new java.awt.Color(255, 255, 255));
        lblHorario_termino.setText("Horário de término");
        getContentPane().add(lblHorario_termino, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 237, 239, -1));

        lblDesc_evento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDesc_evento.setForeground(new java.awt.Color(255, 255, 255));
        lblDesc_evento.setText("Descrição");
        getContentPane().add(lblDesc_evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 275, 239, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Eventos");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 24, 152, -1));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 390));

        menuCadEventos.setText("Cadastro");
        menuCadEventos.setEnabled(false);

        jMenuItem1.setText("Cadastro de eventos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuCadEventos.add(jMenuItem1);

        menu.add(menuCadEventos);

        jMenu2.setText("Opções");

        jMenuItem2.setText("Sair");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        menu.add(jMenu2);

        setJMenuBar(menu);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        TelaCadastroEvento TelaCadastroEvento = new TelaCadastroEvento();
        TelaCadastroEvento.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        this.dispose();
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblData_evento;
    private javax.swing.JLabel lblDesc_evento;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JLabel lblHorario_inicio;
    private javax.swing.JLabel lblHorario_termino;
    private javax.swing.JMenuBar menu;
    public static javax.swing.JMenu menuCadEventos;
    // End of variables declaration//GEN-END:variables

 public String getLblEmpresa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getLblData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getLblHorario_inicio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getLblHorario_termino() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getLblDesc_evento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getTxtCadastroEmpresa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getTxtCadastroData_evento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getTxtCadastroHorario_inicio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getTxtCadastroHorario_termino() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getTxtCadastroDesc_evento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getlblEmpresa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
