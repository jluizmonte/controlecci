package com.controlecci.view.SCCI;

import com.controlecci.model.SessaoUsuarioModel;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author joseluiz
 */
public class SCCI extends javax.swing.JFrame {

    /**
     * Creates new form ScciPrincipal
     */
    public SCCI() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH); // seta o tamanho da janela (maximizado) ao iniciar
        setarData();
        setarValores();
        setarNivel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        rSPanelImage1 = new rojerusan.RSPanelImage();
        jPanel1 = new javax.swing.JPanel();
        jlUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlData = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jmiCurso = new javax.swing.JMenuItem();
        jmiAluno = new javax.swing.JMenuItem();
        jmiUsuario = new javax.swing.JMenuItem();
        jmiRegistrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA DE CADASTRO E CONTROLE CCI CENTRAL DE CURSOS");

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/others/nova_logo.png"))); // NOI18N
        rSPanelImage1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        desktopPane.setLayer(rSPanelImage1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
        );

        jlUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlUsuario.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(28, 89, 124));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CCI - CENTRAL DE CURSOS");

        jlData.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlData.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jlData.setText("dd/MM/yyyy HH:mm:ss");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jlData, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jlData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        fileMenu.setMnemonic('f');
        fileMenu.setText("ARQUIVO");
        fileMenu.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Sair");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        jMenu1.setText("FUNÇÕES BÁSICAS");
        jMenu1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jmiCurso.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jmiCurso.setText("Curso");
        jmiCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCursoActionPerformed(evt);
            }
        });
        jMenu1.add(jmiCurso);

        jmiAluno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jmiAluno.setText("Aluno");
        jmiAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAlunoActionPerformed(evt);
            }
        });
        jMenu1.add(jmiAluno);

        jmiUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jmiUsuario.setText("Usuario");
        jMenu1.add(jmiUsuario);

        jmiRegistrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        jmiRegistrar.setText("Registrar Hora Aluno");
        jmiRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRegistrarActionPerformed(evt);
            }
        });
        jMenu1.add(jmiRegistrar);

        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void jmiCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCursoActionPerformed
        CursoView cursoView = new CursoView();
        desktopPane.add(cursoView);
        cursoView.setVisible(true);
        cursoView.setPosicao();
    }//GEN-LAST:event_jmiCursoActionPerformed

    private void jmiAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAlunoActionPerformed
        AlunoView alunoView = new AlunoView();
        desktopPane.add(alunoView);
        alunoView.setVisible(true);
        alunoView.setPosicao();
    }//GEN-LAST:event_jmiAlunoActionPerformed

    private void jmiRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRegistrarActionPerformed
        RegistroAluno registroAluno = new RegistroAluno();
        desktopPane.add(registroAluno);
        registroAluno.setVisible(true);
        registroAluno.setPosicao();
    }//GEN-LAST:event_jmiRegistrarActionPerformed

    private void setarNivel() {
        if (SessaoUsuarioModel.nivelAcesso.equals("COORDENAÇÃO")) {
//            jmiExtra.setEnabled(false);
//            jmiCertifcadosEntregues.setEnabled(false);
//            jmiExtra.setEnabled(false);
//            jmiGerarCertificado.setEnabled(false);
//            jmiRegistroAluno.setEnabled(false);
//            jmiConsulta.setEnabled(false);
//            jlCertificadosEntregue.setEnabled(false);
//            jlRegistrar.setEnabled(false);
//            jlConsultar.setEnabled(false);
//            jlGerarCertificado.setEnabled(false);
//            jlRelatorio.setEnabled(false);
        }
    }

    private void setarData() {
        Thread clock = new Thread() {
            @Override
            public void run() {
                for (;;) {
                    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                    LocalDateTime timepoint = LocalDateTime.now();
                    jlData.setText(timepoint.format(fmt));
                }
            }
        };
        clock.start();
    }

    private void setarValores() {
        jlUsuario.setText(SessaoUsuarioModel.codigoUsuario + " - " + SessaoUsuarioModel.nomeUsuario.toUpperCase() + " | " + SessaoUsuarioModel.nivelAcesso);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlData;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JMenuItem jmiAluno;
    private javax.swing.JMenuItem jmiCurso;
    private javax.swing.JMenuItem jmiRegistrar;
    private javax.swing.JMenuItem jmiUsuario;
    private javax.swing.JMenuBar menuBar;
    private rojerusan.RSPanelImage rSPanelImage1;
    // End of variables declaration//GEN-END:variables

}
