package com.controlecci.view.SCCI;

import com.controlecci.model.AlunoModel;
import com.controlecci.model.SessaoUsuarioModel;
import com.controlecci.relatorio.RelatorioUtil;
import com.controlecci.util.LocalUtil;
import com.controlecci.util.LogCatUtil;
import com.controlecci.util.TemplateAlerts;
import com.controlecci.view.Login;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author joseluiz
 */
public class SCCI extends javax.swing.JFrame {

    TemplateAlerts templateAlerts = new TemplateAlerts();
    RelatorioUtil relatorio = new RelatorioUtil();

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

        jPanel1 = new javax.swing.JPanel();
        jlUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlData = new javax.swing.JLabel();
        desktopPane = new javax.swing.JDesktopPane();
        rSPanelImage1 = new rojerusan.RSPanelImage();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jmiCurso = new javax.swing.JMenuItem();
        jmiAluno = new javax.swing.JMenuItem();
        jmiRegistrar = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA DE CADASTRO E CONTROLE CCI CENTRAL DE CURSOS");

        jlUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlUsuario.setText("0 - USUÁRIO | NÍVEL");

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
                .addGap(12, 12, 12)
                .addComponent(jlUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(48, 48, 48)
                .addComponent(jlData, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jlData, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/others/nova_logo.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 405, Short.MAX_VALUE)
        );

        desktopPane.setLayer(rSPanelImage1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addComponent(rSPanelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        fileMenu.setMnemonic('f');
        fileMenu.setText("Arquivo");
        fileMenu.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/actions/atualizar.png"))); // NOI18N
        jMenuItem7.setText("Reiniciar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem7);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        exitMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/actions/exit.png"))); // NOI18N
        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Sair");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        jMenu1.setText("Funções Básicas");
        jMenu1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jmiCurso.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jmiCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/actions/livro.png"))); // NOI18N
        jmiCurso.setText("Curso");
        jmiCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCursoActionPerformed(evt);
            }
        });
        jMenu1.add(jmiCurso);

        jmiAluno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jmiAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/actions/locador.png"))); // NOI18N
        jmiAluno.setText("Aluno");
        jmiAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAlunoActionPerformed(evt);
            }
        });
        jMenu1.add(jmiAluno);

        jmiRegistrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        jmiRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/actions/changelog.png"))); // NOI18N
        jmiRegistrar.setText("Registrar Hora Aluno");
        jmiRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRegistrarActionPerformed(evt);
            }
        });
        jMenu1.add(jmiRegistrar);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/actions/cliente.png"))); // NOI18N
        jMenuItem1.setText("Consultar Registro de Hora");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        menuBar.add(jMenu1);

        jMenu2.setText("Funções Avançadas");
        jMenu2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/actions/emprestar.png"))); // NOI18N
        jMenuItem2.setText("Gerar Relatório");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/actions/emprestar.png"))); // NOI18N
        jMenuItem3.setText("Gerar Certificado");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/actions/locatario.png"))); // NOI18N
        jMenuItem4.setText("Ver Certificado Entregue");
        jMenu2.add(jMenuItem4);

        menuBar.add(jMenu2);

        jMenu3.setText("Configurações");
        jMenu3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/actions/configuracao.png"))); // NOI18N
        jMenu4.setText("Gerenciar");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/actions/usuario.png"))); // NOI18N
        jMenuItem5.setText("Usuario");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/actions/log.png"))); // NOI18N
        jMenuItem6.setText("Log(Registro)");
        jMenu4.add(jMenuItem6);

        jMenu3.add(jMenu4);

        menuBar.add(jMenu3);

        jMenu5.setText("F7 CONSULTAR REGISTRO | F6 REGISTRAR HORÁRIO | F4 CONSULTAR ALUNO | F3 CONSULTAR CURSO | F2 ENCERRAR SISTEMA");
        jMenu5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        menuBar.add(jMenu5);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog(this, "O sistema será encerrado!\n Clique em Yes para encerrar!", "Atenção", JOptionPane.YES_NO_OPTION);
        if (dialogResult == 0) {
            System.exit(0);
        }
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

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ConsultarRegistro consultaHorarioInidividual = new ConsultarRegistro();
        desktopPane.add(consultaHorarioInidividual);
        consultaHorarioInidividual.setVisible(true);
        consultaHorarioInidividual.setPosicao();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        UsuarioView usuarioView = new UsuarioView();
        desktopPane.add(usuarioView);
        usuarioView.setVisible(true);
        usuarioView.setPosicao();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        this.dispose();
        new Login(this, true).setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        gerarRelatorio("fichaCadastro");
    }//GEN-LAST:event_jMenuItem2ActionPerformed
    public void gerarRelatorio(String titulo) {
        try {
            relatorio.setTipoLevantamento(titulo);
            relatorio.gerarLevantamento();
        } catch (SQLException e) {
            e.toString();
            LocalUtil.logClass = this.getClass().getName();
            LocalUtil.logType = templateAlerts.mensagemRegsitroErro();
            new LogCatUtil().writeFile(String.valueOf(e));
        } finally {
            //  this.dispose();
        }
    }

    public void chamarConsulta() {
        ConsultarRegistro consultarRegistro = new ConsultarRegistro();
        desktopPane.add(consultarRegistro);
        consultarRegistro.exibirDadosAluno(AlunoModel.nomeAluno);
        consultarRegistro.setVisible(true);
    }

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
        } else if (SessaoUsuarioModel.nivelAcesso.equals("INSTRUTOR")) {
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
        } else {
//                        jmiExtra.setEnabled(false);
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
    public javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlData;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JMenuItem jmiAluno;
    private javax.swing.JMenuItem jmiCurso;
    private javax.swing.JMenuItem jmiRegistrar;
    private javax.swing.JMenuBar menuBar;
    private rojerusan.RSPanelImage rSPanelImage1;
    // End of variables declaration//GEN-END:variables

}
