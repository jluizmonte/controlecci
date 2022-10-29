package com.controlecci.util.alerts;

import java.awt.event.KeyEvent;

import com.controlecci.util.Control;

/**
 *
 * @author joseluiz
 */
@SuppressWarnings("serial")
public class InputAlert extends javax.swing.JDialog {

    /**
     * Creates new form InputAlert
     *
     * @param parent
     * @param modal
     */
    public InputAlert(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
    }

    private void initComponents() {

        rSPanelImage1 = new rojerusan.RSPanelImage();
        jLabel1 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        msj = new javax.swing.JLabel();
        jtfSenha = new javax.swing.JTextField();
        msj1 = new javax.swing.JLabel();
        jbFinalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(409, 388));

        rSPanelImage1
                .setImagen(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/alerts/fondo.png"))); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/alerts/warning.png"))); // NOI18N

        jtfNome.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jtfNome.setForeground(new java.awt.Color(59, 139, 171));
        jtfNome.addActionListener((java.awt.event.ActionEvent evt) -> {
            jtfNomeActionPerformed(evt);
        });

        msj.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        msj.setForeground(new java.awt.Color(102, 102, 102));
        msj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        msj.setText("Insira seu primeiro nome:");

        jtfSenha.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jtfSenha.setForeground(new java.awt.Color(59, 139, 171));
        jtfSenha.addActionListener((java.awt.event.ActionEvent evt) -> {
            jtfSenhaActionPerformed(evt);
        });
        msj1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        msj1.setForeground(new java.awt.Color(102, 102, 102));
        msj1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        msj1.setText("Insira uma senha de acesso:");

        jbFinalizar.setBackground(new java.awt.Color(58, 159, 171));
        jbFinalizar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jbFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        jbFinalizar.setText("FINALIZAR CRIAÇÃO DO USUÁRIO");
        jbFinalizar.addActionListener((java.awt.event.ActionEvent evt) -> {
            jbFinalizarActionPerformed(evt);
        });
        jbFinalizar.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jbFinalizarKeyTyped(evt);
            }
        });
        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(rSPanelImage1Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(rSPanelImage1Layout.createSequentialGroup().addContainerGap().addGroup(rSPanelImage1Layout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(rSPanelImage1Layout.createSequentialGroup().addGroup(rSPanelImage1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(msj, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(msj1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelImage1Layout
                                        .createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(rSPanelImage1Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 391,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                        rSPanelImage1Layout.createSequentialGroup()
                                                                .addComponent(jtfNome,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 237,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(73, 73, 73)))))
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                rSPanelImage1Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 237,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(79, 79, 79))))
                .addGroup(rSPanelImage1Layout
                        .createSequentialGroup().addGap(66, 66, 66).addComponent(jbFinalizar,
                        javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)));
        rSPanelImage1Layout
                .setVerticalGroup(rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(rSPanelImage1Layout.createSequentialGroup().addGap(21, 21, 21).addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(msj)
                                .addGap(4, 4, 4)
                                .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(msj1)
                                .addGap(4, 4, 4)
                                .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(30, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(rSPanelImage1,
                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(rSPanelImage1,
                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbFinalizarActionPerformed(java.awt.event.ActionEvent evt) {
        setarValores();
    }

    private void jtfNomeActionPerformed(java.awt.event.ActionEvent evt) {
        jtfSenha.requestFocusInWindow();
    }

    private void jtfSenhaActionPerformed(java.awt.event.ActionEvent evt) {
        setarValores();
    }

    private void jbFinalizarKeyTyped(java.awt.event.KeyEvent evt) {
        if ((evt.getKeyChar() == KeyEvent.VK_ENTER)) {
            new Control().closeProgram();
            System.exit(0);
        }
    }

    private void setarValores() {
        this.setSenhaUsuario(jtfSenha.getText());
        this.setloginUsuario(jtfNome.getText());
        this.dispose();
    }

    private javax.swing.JLabel jLabel1;
    public javax.swing.JButton jbFinalizar;
    public javax.swing.JTextField jtfNome;
    public javax.swing.JTextField jtfSenha;
    public static javax.swing.JLabel msj;
    public static javax.swing.JLabel msj1;
    private rojerusan.RSPanelImage rSPanelImage1;

    private String loginUsuario;
    private String senhaUsuario;

    public String getloginUsuario() {
        return loginUsuario;
    }

    public void setloginUsuario(String nomeUsuario) {
        this.loginUsuario = nomeUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

}
