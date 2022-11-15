package com.controlecci.view.SCCI;

import com.controlecci.model.SessaoUsuarioModel;
import com.controlecci.relatorio.RelatorioUtil;
import com.controlecci.util.LocalUtil;
import com.controlecci.util.LogCatUtil;
import com.controlecci.util.TemplateAlerts;
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
        setUndecorated(true);
        initComponents();
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
        jmiReiniciar = new javax.swing.JMenuItem();
        jmiSair = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jmiCurso = new javax.swing.JMenuItem();
        jmiAluno = new javax.swing.JMenuItem();
        jmiRegistroHora = new javax.swing.JMenuItem();
        jmiConsultaRegistro = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiRelatorio = new javax.swing.JMenuItem();
        jmiCertificado = new javax.swing.JMenuItem();
        jmiCertificadosEntregues = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jmiUsuario = new javax.swing.JMenuItem();
        jmiLog = new javax.swing.JMenuItem();
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

        jmiReiniciar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiReiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/actions/atualizar.png"))); // NOI18N
        jmiReiniciar.setText("Reiniciar");
        jmiReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiReiniciarActionPerformed(evt);
            }
        });
        fileMenu.add(jmiReiniciar);

        jmiSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jmiSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/actions/exit.png"))); // NOI18N
        jmiSair.setMnemonic('x');
        jmiSair.setText("Sair");
        jmiSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSairActionPerformed(evt);
            }
        });
        fileMenu.add(jmiSair);

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

        jmiRegistroHora.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        jmiRegistroHora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/actions/changelog.png"))); // NOI18N
        jmiRegistroHora.setText("Registrar Hora Aluno");
        jmiRegistroHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRegistroHoraActionPerformed(evt);
            }
        });
        jMenu1.add(jmiRegistroHora);

        jmiConsultaRegistro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        jmiConsultaRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/actions/cliente.png"))); // NOI18N
        jmiConsultaRegistro.setText("Consultar Registro de Hora");
        jmiConsultaRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultaRegistroActionPerformed(evt);
            }
        });
        jMenu1.add(jmiConsultaRegistro);

        menuBar.add(jMenu1);

        jMenu2.setText("Funções Avançadas");
        jMenu2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jmiRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/actions/emprestar.png"))); // NOI18N
        jmiRelatorio.setText("Gerar Relatório");
        jmiRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRelatorioActionPerformed(evt);
            }
        });
        jMenu2.add(jmiRelatorio);

        jmiCertificado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/actions/emprestar.png"))); // NOI18N
        jmiCertificado.setText("Gerar Certificado");
        jMenu2.add(jmiCertificado);

        jmiCertificadosEntregues.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/actions/locatario.png"))); // NOI18N
        jmiCertificadosEntregues.setText("Ver Certificado Entregue");
        jMenu2.add(jmiCertificadosEntregues);

        menuBar.add(jMenu2);

        jMenu3.setText("Configurações");
        jMenu3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/actions/configuracao.png"))); // NOI18N
        jMenu4.setText("Gerenciar");

        jmiUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jmiUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/actions/usuario.png"))); // NOI18N
        jmiUsuario.setText("Usuario");
        jmiUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiUsuarioActionPerformed(evt);
            }
        });
        jMenu4.add(jmiUsuario);

        jmiLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/actions/log.png"))); // NOI18N
        jmiLog.setText("Log(Registro)");
        jmiLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiLogActionPerformed(evt);
            }
        });
        jMenu4.add(jmiLog);

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

    private void jmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSairActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog(this, "O sistema será encerrado!\n Clique em Yes para encerrar!", "Atenção", JOptionPane.YES_NO_OPTION);
        if (dialogResult == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jmiSairActionPerformed

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

    private void jmiRegistroHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRegistroHoraActionPerformed
        RegistroAluno registroAluno = new RegistroAluno();
        desktopPane.add(registroAluno);
        registroAluno.setVisible(true);
        registroAluno.setPosicao();
    }//GEN-LAST:event_jmiRegistroHoraActionPerformed

    private void jmiConsultaRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultaRegistroActionPerformed
        ConsultarRegistro consultaHorarioInidividual = new ConsultarRegistro();
        desktopPane.add(consultaHorarioInidividual);
        consultaHorarioInidividual.setVisible(true);
        consultaHorarioInidividual.setPosicao();
    }//GEN-LAST:event_jmiConsultaRegistroActionPerformed

    private void jmiUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiUsuarioActionPerformed
        UsuarioView usuarioView = new UsuarioView();
        desktopPane.add(usuarioView);
        usuarioView.setVisible(true);
        usuarioView.setPosicao();
    }//GEN-LAST:event_jmiUsuarioActionPerformed

    private void jmiReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiReiniciarActionPerformed
        this.dispose();
        new LoginView(this, true).setVisible(true);
    }//GEN-LAST:event_jmiReiniciarActionPerformed

    private void jmiRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRelatorioActionPerformed
        gerarRelatorio("fichaCadastro");
    }//GEN-LAST:event_jmiRelatorioActionPerformed

    private void jmiLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiLogActionPerformed
        VisualizarLog visualizarLog = new VisualizarLog();
        desktopPane.add(visualizarLog);
        visualizarLog.setVisible(true);
        visualizarLog.setPosicao();
    }//GEN-LAST:event_jmiLogActionPerformed
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

    private void setarNivel() {
        switch (SessaoUsuarioModel.nivelAcesso) {
            case "DESENVOLVEDOR" -> {
                jmiAluno.setEnabled(true);
                jmiCertificado.setEnabled(true);
                jmiCertificadosEntregues.setEnabled(true);
                jmiConsultaRegistro.setEnabled(true);
                jmiCurso.setEnabled(true);
                jmiLog.setEnabled(true);
                jmiRegistroHora.setEnabled(true);
                jmiReiniciar.setEnabled(true);
                jmiRelatorio.setEnabled(true);
                jmiSair.setEnabled(true);
                jmiUsuario.setEnabled(true);
            }
            case "INSTRUTOR" -> {
                jmiAluno.setEnabled(true);
                jmiCertificado.setEnabled(true);
                jmiCertificadosEntregues.setEnabled(true);
                jmiConsultaRegistro.setEnabled(true);
                jmiCurso.setEnabled(true);
                jmiLog.setEnabled(false);
                jmiRegistroHora.setEnabled(true);
                jmiReiniciar.setEnabled(true);
                jmiRelatorio.setEnabled(true);
                jmiSair.setEnabled(true);
                jmiUsuario.setEnabled(false);
            }
            default -> {
                jmiAluno.setEnabled(true);
                jmiCertificado.setEnabled(true);
                jmiCertificadosEntregues.setEnabled(true);
                jmiConsultaRegistro.setEnabled(true);
                jmiCurso.setEnabled(true);
                jmiLog.setEnabled(false);
                jmiRegistroHora.setEnabled(false);
                jmiReiniciar.setEnabled(true);
                jmiRelatorio.setEnabled(true);
                jmiSair.setEnabled(true);
                jmiUsuario.setEnabled(false);
            }
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
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlData;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JMenuItem jmiAluno;
    private javax.swing.JMenuItem jmiCertificado;
    private javax.swing.JMenuItem jmiCertificadosEntregues;
    private javax.swing.JMenuItem jmiConsultaRegistro;
    private javax.swing.JMenuItem jmiCurso;
    private javax.swing.JMenuItem jmiLog;
    private javax.swing.JMenuItem jmiRegistroHora;
    private javax.swing.JMenuItem jmiReiniciar;
    private javax.swing.JMenuItem jmiRelatorio;
    private javax.swing.JMenuItem jmiSair;
    private javax.swing.JMenuItem jmiUsuario;
    private javax.swing.JMenuBar menuBar;
    private rojerusan.RSPanelImage rSPanelImage1;
    // End of variables declaration//GEN-END:variables

}
