package com.controlecci.util.alerts;

import java.awt.event.KeyEvent;

import com.controlecci.util.Control;

/**
 *
 * @author joseluiz
 */
@SuppressWarnings("serial")
public class ValueInputAlert extends javax.swing.JDialog {

    /**
     * Creates new form InputAlert
     *
     * @param parent
     * @param modal
     */
    public ValueInputAlert(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        jtfInfo.setText("0");
    }

    private void initComponents() {

        rSPanelImage1 = new rojerusan.RSPanelImage();
        jLabel1 = new javax.swing.JLabel();
        jtfInfo = new javax.swing.JTextField();
        msj = new javax.swing.JLabel();
        jbOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        rSPanelImage1
                .setImagen(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/alerts/fondo.png"))); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/alerts/warning.png"))); // NOI18N

        jtfInfo.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jtfInfo.setForeground(new java.awt.Color(59, 139, 171));
        jtfInfo.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfInfoActionPerformed(evt);
            }
        });

        msj.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        msj.setForeground(new java.awt.Color(102, 102, 102));
        msj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        msj.setText("Titulo");

        jbOk.setBackground(new java.awt.Color(58, 159, 171));
        jbOk.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jbOk.setForeground(new java.awt.Color(255, 255, 255));
        jbOk.setText("OK");
        jbOk.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOkActionPerformed(evt);
            }
        });
        jbOk.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jbOkKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(rSPanelImage1Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(rSPanelImage1Layout.createSequentialGroup().addContainerGap()
                        .addGroup(rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(rSPanelImage1Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 391,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                        rSPanelImage1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jbOk, javax.swing.GroupLayout.PREFERRED_SIZE, 279,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(51, 51, 51))
                                .addComponent(msj, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                        rSPanelImage1Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jtfInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 237,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(73, 73, 73)))
                        .addContainerGap()));
        rSPanelImage1Layout
                .setVerticalGroup(rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(rSPanelImage1Layout.createSequentialGroup().addGap(9, 9, 9).addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(msj)
                                .addGap(4, 4, 4)
                                .addComponent(jtfInfo, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbOk, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(18, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(rSPanelImage1,
                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(rSPanelImage1,
                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }

    private void jbOkActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jbOkActionPerformed
        valores();
    }

    private void jtfInfoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jtfInfoActionPerformed
        valores();
    }

    private void jbOkKeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jbOkKeyTyped
        if ((evt.getKeyChar() == KeyEvent.VK_ENTER)) {
            valores();
            new Control().closeProgram();
            System.exit(0);
        }
    }

    public void valores() {
        this.setValor(jtfInfo.getText());
        this.dispose();
    }

    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbOk;
    public javax.swing.JTextField jtfInfo;
    public static javax.swing.JLabel msj;
    private rojerusan.RSPanelImage rSPanelImage1;
    public String valor;

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

}
