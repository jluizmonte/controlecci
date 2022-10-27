package com.controlecci.view;

import com.controlecci.controller.UsuarioController;
import com.controlecci.model.SessaoUsuarioModel;
import com.controlecci.model.UsuarioModel;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Instrutores
 */
public class Login extends javax.swing.JFrame {

    UsuarioModel usuarioModel = new UsuarioModel();
    UsuarioController usuarioController = new UsuarioController();
    int x, y;

    /**
     * Creates new form frmLogin
     */
    public Login() {
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtfLogin = new javax.swing.JTextField();
        jpSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlSair = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jbCancelar = new javax.swing.JButton();
        jbAcessar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 55, 110));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jtfLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfLogin.setBorder(null);
        jtfLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfLoginMouseClicked(evt);
            }
        });
        jtfLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfLoginActionPerformed(evt);
            }
        });

        jpSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jpSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jpSenha.setBorder(null);
        jpSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpSenhaMouseClicked(evt);
            }
        });
        jpSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpSenhaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOGIN");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SENHA");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/others/login2.png"))); // NOI18N

        jlSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlSair.setForeground(new java.awt.Color(255, 255, 255));
        jlSair.setText("X");
        jlSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlSairMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlSairMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 242, 18));
        jLabel4.setText("ACESSO AO SISTEMA");

        jbCancelar.setBackground(new java.awt.Color(255, 0, 0));
        jbCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jbCancelar.setText("CANCELAR");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbAcessar.setBackground(new java.awt.Color(0, 153, 51));
        jbAcessar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbAcessar.setForeground(new java.awt.Color(255, 255, 255));
        jbAcessar.setText("ACESSAR");
        jbAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAcessarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jbCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbAcessar))
                            .addComponent(jtfLogin)
                            .addComponent(jpSenha)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(84, 84, 84)
                        .addComponent(jlSair)))
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlSair)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbCancelar)
                            .addComponent(jbAcessar)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        Point move = MouseInfo.getPointerInfo().getLocation();
        this.setLocation(move.x - x, move.y - y);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jtfLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfLoginMouseClicked
        jtfLogin.setText("");
    }//GEN-LAST:event_jtfLoginMouseClicked

    private void jpSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpSenhaMouseClicked
        jpSenha.setText("");
    }//GEN-LAST:event_jpSenhaMouseClicked

    private void jlSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSairMouseExited
        jlSair.setForeground(Color.WHITE);
    }//GEN-LAST:event_jlSairMouseExited

    private void jlSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSairMouseEntered
        jlSair.setForeground(Color.blue);
    }//GEN-LAST:event_jlSairMouseEntered

    private void jlSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jlSairMouseClicked

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        jtfLogin.setText("");
        jpSenha.setText("");
        jtfLogin.requestFocus();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAcessarActionPerformed
        realizarLogin();
    }//GEN-LAST:event_jbAcessarActionPerformed

    private void jtfLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfLoginActionPerformed
        jpSenha.requestFocus();
    }//GEN-LAST:event_jtfLoginActionPerformed

    private void jpSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpSenhaActionPerformed
        realizarLogin();
    }//GEN-LAST:event_jpSenhaActionPerformed

    public void realizarLogin() {
        usuarioModel.setLoginUsuario(jtfLogin.getText());
        usuarioModel.setSenhaUsuario(String.valueOf(jpSenha.getPassword()));
        try {
            if (!usuarioModel.getLoginUsuario().equals("") && !usuarioModel.getSenhaUsuario().equals("")) {
                if (usuarioController.getValidarUsuarioDAO(usuarioModel)) {
                    usuarioModel = usuarioController.getUsuarioDAO(jtfLogin.getText());
                    setSessionUser();
                    JOptionPane.showMessageDialog(this, "Bem-vindo de volta " + usuarioModel.getNomeUsuario() + "!",
                            "Sucesso!", JOptionPane.WARNING_MESSAGE);
                    new TelaPrincipal().setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Usuário ou senha inválidos!\nRevise as credenciais e tente novamente",
                            "Erro ao fazer login", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Nenhum dos campos podem ficar em branco", "Revise os dados",
                        JOptionPane.WARNING_MESSAGE);
                limparCampos();
            }
        } catch (HeadlessException e) {
        } finally {
        }
    }

    public void limparCampos() {
        jtfLogin.setText("");
        jpSenha.setText("");
        jtfLogin.requestFocus();
    }

    private void setSessionUser() {
        SessaoUsuarioModel.codigoUsuario = usuarioModel.getIdUsuario();
        SessaoUsuarioModel.nomeUsuario = usuarioModel.getNomeUsuario();
        SessaoUsuarioModel.loginUsuario = usuarioModel.getLoginUsuario();
        SessaoUsuarioModel.nivelAcesso = usuarioModel.getNivelAcessoUsuario();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAcessar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JLabel jlSair;
    private javax.swing.JPasswordField jpSenha;
    private javax.swing.JTextField jtfLogin;
    // End of variables declaration//GEN-END:variables
}