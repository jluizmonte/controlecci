package com.controlecci.util.alerts;

import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

/**
 *
 * @author joseluiz
 */
public class ErrorAlert extends javax.swing.JDialog {

    Timer timer = null;
    TimerTask task;
    int i = 32;

    /**
     * Creates new form Error
     *
     * @param parent
     * @param modal
     */
    public ErrorAlert(JFrame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        AWTUtilities.setOpaque(this, false);
        // localization(0);
        setLocationRelativeTo(null);
    }

    private void initComponents() {

        rSPanelImage1 = new rojerusan.RSPanelImage();
        jLabel1 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        msj = new javax.swing.JLabel();
        msj1 = new javax.swing.JLabel();
        materialButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }

            @Override
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        rSPanelImage1
                .setImagen(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/alerts/fondo.png"))); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/alerts/error.png"))); // NOI18N

        titulo.setFont(new java.awt.Font("Dejavu Sans", 1, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Título");

        msj.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        msj.setForeground(new java.awt.Color(102, 102, 102));
        msj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        msj.setText("Titulo");

        msj1.setFont(new java.awt.Font("Dejavu Sans", 1, 18)); // NOI18N
        msj1.setForeground(new java.awt.Color(102, 102, 102));
        msj1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        msj1.setText("Titulo");

        materialButton1.setBackground(new java.awt.Color(58, 159, 171));
        materialButton1.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        materialButton1.setForeground(new java.awt.Color(255, 255, 255));
        materialButton1.setText("OK");
        materialButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        materialButton1.addActionListener((java.awt.event.ActionEvent evt) -> {
            materialButton1ActionPerformed(evt);
        });
        materialButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                materialButton1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(rSPanelImage1Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(rSPanelImage1Layout.createSequentialGroup().addContainerGap(20, Short.MAX_VALUE)
                        .addGroup(rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(materialButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 366,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(rSPanelImage1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(msj1, javax.swing.GroupLayout.Alignment.LEADING,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 366,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(rSPanelImage1Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(msj, javax.swing.GroupLayout.Alignment.TRAILING,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE))
                                        .addComponent(titulo, javax.swing.GroupLayout.Alignment.LEADING,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 366,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(21, Short.MAX_VALUE)));
        rSPanelImage1Layout
                .setVerticalGroup(
                        rSPanelImage1Layout
                                .createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(rSPanelImage1Layout.createSequentialGroup().addGap(30, 30, 30)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11)
                                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 29, Short.MAX_VALUE).addComponent(msj)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19,
                                                Short.MAX_VALUE)
                                        .addComponent(msj1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 22,
                                                Short.MAX_VALUE)
                                        .addComponent(materialButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(22, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addContainerGap()
                        .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                javax.swing.GroupLayout.Alignment.TRAILING,
                layout.createSequentialGroup().addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void materialButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_materialButton1ActionPerformed
        task = new TimerTask() {
            @Override
            public void run() {
                if (i == 0) {
                    Cerrar();
                } else {
                    localization(i);
                    i -= 32;
                    Trasparencia((float) i / 352);
                }
            }
        };
        timer = new Timer();
        timer.schedule(task, 0, 2);
    }// GEN-LAST:event_materialButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowOpened
        task = new TimerTask() {
            @Override
            public void run() {
                if (i == 352) {
                    timer.cancel();
                } else {
                    localization(i);
                    i += 32;
                    Trasparencia((float) i / 352);
                }
            }
        };
        timer = new Timer();
        timer.schedule(task, 0, 2);
    }// GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowClosing
        setVisible(false);
        dispose();
    }// GEN-LAST:event_formWindowClosing

    private void materialButton1KeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_materialButton1KeyTyped
        if ((evt.getKeyChar() == KeyEvent.VK_ENTER)) {
            task = new TimerTask() {
                @Override
                public void run() {
                    if (i == 0) {
                        Cerrar();
                    } else {
                        localization(i);
                        i -= 32;
                        Trasparencia((float) i / 352);
                    }
                }
            };
            timer = new Timer();
            timer.schedule(task, 0, 2);
        }
    }// GEN-LAST:event_materialButton1KeyTyped

    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton materialButton1;
    public static javax.swing.JLabel msj;
    public static javax.swing.JLabel msj1;
    private rojerusan.RSPanelImage rSPanelImage1;
    public static javax.swing.JLabel titulo;

    private void Cerrar() {
        this.dispose();
        timer = null;
        task = null;
    }

    private void Trasparencia(float trasp) {
        AWTUtilities.setOpacity(this, trasp);
    }

    private void localization(int y) {
        this.setLocation(450, y - 120);
    }
}
