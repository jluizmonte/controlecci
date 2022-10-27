package com.controlecci.view;

import com.controlecci.model.SessaoUsuarioModel;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Instrutores
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public TelaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setarData();
        setarValores();
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
        jLabel2 = new javax.swing.JLabel();
        jLabe1 = new javax.swing.JLabel();
        jLabe3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jlUsuario = new javax.swing.JLabel();
        jlData = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiRegistroAluno = new javax.swing.JMenuItem();
        jmiConsulta = new javax.swing.JMenuItem();
        jmiCadastroCurso = new javax.swing.JMenuItem();
        jmiCadastroAluno = new javax.swing.JMenuItem();
        jmiEncerrar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiGerarRelatorio = new javax.swing.JMenuItem();
        jmiCertifcadosEntregues = new javax.swing.JMenuItem();
        jmiGerarCertificado = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SSCI CADASTRO E CONTROLE DE ALUNOS");
        setAlwaysOnTop(true);

        jPanel1.setBackground(new java.awt.Color(28, 89, 124));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FUNÇÕES BÁSICAS DISPONÍVEIS:");

        jLabe1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabe1.setForeground(new java.awt.Color(255, 255, 255));
        jLabe1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabe1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/actions/adicionar.png"))); // NOI18N
        jLabe1.setText("1- INSERIR UM NOVO REGISTRO (F1)");

        jLabe3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabe3.setForeground(new java.awt.Color(255, 255, 255));
        jLabe3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabe3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/actions/pesquisar.png"))); // NOI18N
        jLabe3.setText("2 - CONSULTAR REGISTROS (F2)");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/actions/livro.png"))); // NOI18N
        jLabel4.setText("3 - CADASTRAR CURSO (F3)");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/actions/locador.png"))); // NOI18N
        jLabel5.setText("4 - CADASTRAR ALUNO (F4)");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/actions/exit.png"))); // NOI18N
        jLabel7.setText("5 - ENCERRAR SISTEMA (F5)");

        jPanel2.setBackground(new java.awt.Color(253, 253, 253));

        jlUsuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlUsuario.setText("$usuario");

        jlData.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlData.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlData.setText("$dd/mm/yyyy hh:mm:ss");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(28, 89, 124));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("CCI CENTRAL DE CURSOS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jlData, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jlUsuario)
                .addComponent(jlData)
                .addComponent(jLabel9))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FUNÇÕES EXTRAS:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/actions/changelog.png"))); // NOI18N
        jLabel3.setText("GERAR RELATÓRIO");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/actions/devolver.png"))); // NOI18N
        jLabel6.setText("VER LISTA DE CERTIFICADOS ENTREGUES");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/actions/emprestar.png"))); // NOI18N
        jLabel8.setText("GERAR CERTIFICADO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabe3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabe1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(71, 71, 71))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabe1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabe3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu1.setText("FUNÇÕES BÁSICAS");

        jmiRegistroAluno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jmiRegistroAluno.setText("REGISTRO ALUNO");
        jmiRegistroAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRegistroAlunoActionPerformed(evt);
            }
        });
        jMenu1.add(jmiRegistroAluno);

        jmiConsulta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jmiConsulta.setText("CONSULTAR REGISTROS");
        jmiConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultaActionPerformed(evt);
            }
        });
        jMenu1.add(jmiConsulta);

        jmiCadastroCurso.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jmiCadastroCurso.setText("CADASTRAR CURSO");
        jmiCadastroCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastroCursoActionPerformed(evt);
            }
        });
        jMenu1.add(jmiCadastroCurso);

        jmiCadastroAluno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jmiCadastroAluno.setText("CADASTRAR ALUNO");
        jMenu1.add(jmiCadastroAluno);

        jmiEncerrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jmiEncerrar.setText("ENCERRAR SISTEMA");
        jmiEncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEncerrarActionPerformed(evt);
            }
        });
        jMenu1.add(jmiEncerrar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("FUNÇÕES EXTRAS");

        jmiGerarRelatorio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        jmiGerarRelatorio.setText("GERAR RELATÓRIO");
        jMenu2.add(jmiGerarRelatorio);

        jmiCertifcadosEntregues.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        jmiCertifcadosEntregues.setText("CERTIFICADOS ENTREGUES");
        jMenu2.add(jmiCertifcadosEntregues);

        jmiGerarCertificado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, 0));
        jmiGerarCertificado.setText("GERAR CERTIFICADO");
        jMenu2.add(jmiGerarCertificado);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiRegistroAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRegistroAlunoActionPerformed
        //    this.dispose();
        new RegistroAluno().setVisible(true);
    }//GEN-LAST:event_jmiRegistroAlunoActionPerformed

    private void jmiCadastroCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastroCursoActionPerformed
        new CadastroCurso().setVisible(true);
    }//GEN-LAST:event_jmiCadastroCursoActionPerformed

    private void jmiEncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEncerrarActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "O sistema será encerrado!\n Clique em OK para encerrar!", "Atenção", JOptionPane.WARNING_MESSAGE, dialogButton);
        if (dialogResult == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jmiEncerrarActionPerformed

    private void jmiConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultaActionPerformed
        new ConsultaAlunos().setVisible(true);
    }//GEN-LAST:event_jmiConsultaActionPerformed

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
        jlUsuario.setText(SessaoUsuarioModel.codigoUsuario + " - " + SessaoUsuarioModel.nomeUsuario.toUpperCase() + " " + SessaoUsuarioModel.nivelAcesso);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabe1;
    private javax.swing.JLabel jLabe3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel jlData;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JMenuItem jmiCadastroAluno;
    private javax.swing.JMenuItem jmiCadastroCurso;
    private javax.swing.JMenuItem jmiCertifcadosEntregues;
    private javax.swing.JMenuItem jmiConsulta;
    private javax.swing.JMenuItem jmiEncerrar;
    private javax.swing.JMenuItem jmiGerarCertificado;
    private javax.swing.JMenuItem jmiGerarRelatorio;
    private javax.swing.JMenuItem jmiRegistroAluno;
    // End of variables declaration//GEN-END:variables
}
