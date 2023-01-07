package com.controlecci.view.SCCI;

import com.controlecci.controller.UsuarioController;
import com.controlecci.model.SessaoUsuarioModel;
import com.controlecci.model.UsuarioModel;
import com.controlecci.util.LocalUtil;
import com.controlecci.util.LogCatUtil;
import com.controlecci.util.TemplateAlerts;
import com.controlecci.view.utils.TelaFundoLogin;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/**
 *
 * @author proxc
 */
public class Login extends javax.swing.JDialog {

    /**
     * instancia do model, service e sessão do usuário criação de lista de
     * usuário.
     */
    UsuarioModel usuarioModel = new UsuarioModel();
    UsuarioController usuarioController = new UsuarioController();
    TemplateAlerts templateAlerts = new TemplateAlerts();
    TelaFundoLogin telaFundoLogin = new TelaFundoLogin();
    int xy, xx;

    /**
     *
     * @param parent
     * @param modal
     */
    public Login(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setarImagem();
        dispose();
        setUndecorated(true);
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

        pnl_bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        login = new javax.swing.JPanel();
        jtfLogin = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_close = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfSenha = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jbEntrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        loader = new javax.swing.JPanel();
        img_loader = new javax.swing.JLabel();
        lbl_loader = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        pnl_bg.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.CardLayout());

        login.setBackground(new java.awt.Color(255, 255, 255));
        login.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                loginMouseDragged(evt);
            }
        });
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginMousePressed(evt);
            }
        });

        jtfLogin.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jtfLogin.setForeground(new java.awt.Color(0, 0, 0));
        jtfLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfLogin.setBorder(null);
        jtfLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfLoginFocusGained(evt);
            }
        });
        jtfLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfLoginActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 112, 192));
        jSeparator1.setForeground(new java.awt.Color(0, 112, 192));

        jSeparator2.setBackground(new java.awt.Color(0, 112, 192));
        jSeparator2.setForeground(new java.awt.Color(0, 112, 192));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/others/unlock_18px.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/others/contacts_18px.png"))); // NOI18N

        lbl_close.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lbl_close.setForeground(new java.awt.Color(0, 112, 192));
        lbl_close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_close.setText("X");
        lbl_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_closeMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 112, 192));
        jLabel5.setText("Esqueceu a senha?");
        jLabel5.setToolTipText("Função ainda não implementada!");
        jLabel5.setEnabled(false);

        jtfSenha.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jtfSenha.setForeground(new java.awt.Color(102, 102, 102));
        jtfSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfSenha.setText("jPasswordField1");
        jtfSenha.setBorder(null);
        jtfSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfSenhaFocusGained(evt);
            }
        });
        jtfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSenhaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Acesso ao sistema");

        jbEntrar.setFont(new java.awt.Font("DejaVu Sans", 0, 16)); // NOI18N
        jbEntrar.setText("Login");
        jbEntrar.setToolTipText("");
        jbEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEntrarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 112, 192));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(loginLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(loginLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(loginLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(loginLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel5)
                                .addGap(135, 135, 135)
                                .addComponent(jbEntrar))))
                    .addGroup(loginLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_close, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(loginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(35, 35, 35)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel5))
                    .addComponent(jbEntrar)))
            .addComponent(lbl_close)
        );

        jPanel1.add(login, "card2");

        loader.setBackground(new java.awt.Color(255, 255, 255));

        img_loader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img_loader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/gifs/spinnerLoad.gif"))); // NOI18N

        lbl_loader.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_loader.setForeground(new java.awt.Color(0, 112, 192));
        lbl_loader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_loader.setText("Efetuando Login ...");

        javax.swing.GroupLayout loaderLayout = new javax.swing.GroupLayout(loader);
        loader.setLayout(loaderLayout);
        loaderLayout.setHorizontalGroup(
            loaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(img_loader, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
            .addComponent(lbl_loader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        loaderLayout.setVerticalGroup(
            loaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loaderLayout.createSequentialGroup()
                .addComponent(img_loader, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_loader, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(loader, "card3");

        javax.swing.GroupLayout pnl_bgLayout = new javax.swing.GroupLayout(pnl_bg);
        pnl_bg.setLayout(pnl_bgLayout);
        pnl_bgLayout.setHorizontalGroup(
            pnl_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_bgLayout.setVerticalGroup(
            pnl_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_bgLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfLoginFocusGained
        jtfLogin.setText("");
    }//GEN-LAST:event_jtfLoginFocusGained

    private void jtfSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfSenhaFocusGained
        jtfSenha.setText("");
    }//GEN-LAST:event_jtfSenhaFocusGained

    private void lbl_closeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_closeMousePressed
        System.exit(0);
    }//GEN-LAST:event_lbl_closeMousePressed

    private void loginMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_loginMouseDragged

    private void loginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_loginMousePressed

    private void jbEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEntrarActionPerformed
        loader.setVisible(true);
        login.setVisible(false);
        new java.util.Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                realizarLogin();
            }
        }, 500);
    }//GEN-LAST:event_jbEntrarActionPerformed

    private void jtfLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfLoginActionPerformed
        jtfSenha.requestFocus();
    }//GEN-LAST:event_jtfLoginActionPerformed

    private void jtfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSenhaActionPerformed
        loader.setVisible(true);
        login.setVisible(false);
        new java.util.Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                realizarLogin();
            }
        }, 500);
    }//GEN-LAST:event_jtfSenhaActionPerformed

    public void realizarLogin() {
        usuarioModel.setLoginUsuario(jtfLogin.getText());
        usuarioModel.setSenhaUsuario(String.valueOf(jtfSenha.getPassword()));
        try {
            if (!usuarioModel.getLoginUsuario().equals("") && !usuarioModel.getSenhaUsuario().equals("")) {
                if (usuarioController.getValidarUsuarioDAO(usuarioModel)) {
                    usuarioModel = usuarioController.getUsuarioDAO(jtfLogin.getText());
                    setSessionUser();

                    String sucesso = "Acesso concedido a " + usuarioModel.getNomeUsuario();

                    LocalUtil.logClass = this.getClass().getName();
                    LocalUtil.logType = templateAlerts.mensagemRegistroComum();
                    new LogCatUtil().writeFile(String.valueOf(sucesso));

                    telaFundoLogin.fechaTela();
                    this.dispose();
                    new SCCI().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, templateAlerts.erroLogar());
                    this.dispose();
                    LocalUtil.logClass = this.getClass().getName();
                    LocalUtil.logType = templateAlerts.mensagemRegsitroErro();
                    new LogCatUtil().writeFile(String.valueOf(templateAlerts.erroLogar()));
                    jtfLogin.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(this, templateAlerts.erroCamposEmBranco());
                LocalUtil.logClass = this.getClass().getName();
                LocalUtil.logType = templateAlerts.mensagemRegsitroErro();

                new LogCatUtil().writeFile(String.valueOf(templateAlerts.erroCamposEmBranco()));
                limparCampos();
            }
        } catch (HeadlessException e) {
            LocalUtil.logClass = this.getClass().getName();
            LocalUtil.logType = templateAlerts.mensagemRegsitroErro();
            new LogCatUtil().writeFile(String.valueOf(e.toString()));
        }
    }

    public void limparCampos() {
        jtfLogin.setText("");
        jtfSenha.setText("");
        jtfLogin.requestFocus();
    }

    private void setSessionUser() {
        SessaoUsuarioModel.codigoUsuario = usuarioModel.getIdUsuario();
        SessaoUsuarioModel.nomeUsuario = usuarioModel.getNomeUsuario();
        SessaoUsuarioModel.loginUsuario = usuarioModel.getLoginUsuario();
        SessaoUsuarioModel.nivelAcesso = usuarioModel.getNivelAcessoUsuario();
    }

    private void setarImagem() {
        URL caminhoImagem = this.getClass().getResource("/com/controlecci/image/others/nova_logo.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoImagem);
        setIconImage(iconeTitulo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel img_loader;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbEntrar;
    private javax.swing.JTextField jtfLogin;
    private javax.swing.JPasswordField jtfSenha;
    private javax.swing.JLabel lbl_close;
    private javax.swing.JLabel lbl_loader;
    private javax.swing.JPanel loader;
    private javax.swing.JPanel login;
    private javax.swing.JPanel pnl_bg;
    // End of variables declaration//GEN-END:variables
}
