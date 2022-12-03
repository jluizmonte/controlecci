package com.controlecci.view.SCCI;

import com.controlecci.controller.AlunoController;
import com.controlecci.controller.AulaController;
import com.controlecci.model.AlunoModel;
import com.controlecci.model.AulaModel;
import com.controlecci.util.GetDateUtil;
import com.controlecci.util.LocalUtil;
import com.controlecci.util.LogCatUtil;
import com.controlecci.util.TemplateAlerts;
import com.controlecci.view.utils.MensagemConfirmação;
import com.controlecci.view.utils.SelecionaAluno;
import com.mxrck.autocompleter.AutoCompleter;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.awt.Dimension;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author joseluiz
 */
public class RegistroAluno extends javax.swing.JInternalFrame {

    private AutoCompleter ac;
    public AlunoModel alunoModel = new AlunoModel();
    AulaModel aulaModel = new AulaModel();
    public ArrayList lista = new ArrayList<>();
    AlunoController alunoController = new AlunoController();
    AulaController aulaController = new AulaController();
    public String nomeAluno;
    GetDateUtil getDateUtil = new GetDateUtil();
    MensagemConfirmação mensagemConfirmação = new MensagemConfirmação(null, true);
    TemplateAlerts templateAlerts = new TemplateAlerts();

    /**
     * Creates new form FrmAlunos
     */
    public RegistroAluno() {
        initComponents();
        carregarAlunosPrevisao();
        limparCampos();
        this.setClosable(true);
        this.setIconifiable(true);
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
        jLabel1 = new javax.swing.JLabel();
        jbPesquisar = new javax.swing.JButton();
        jlNomeAluno = new javax.swing.JLabel();
        jlCursoAluno = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfChegada = new javax.swing.JFormattedTextField();
        jtfSaida = new javax.swing.JFormattedTextField();
        jbConsulta = new javax.swing.JButton();
        jbInserirHoras = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jtfData = new com.toedter.calendar.JDateChooser();
        jbVoltar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setClosable(true);
        setIconifiable(true);
        setTitle("SCCI - REGISTRO DE HORAS");

        jPanel1.setBackground(new java.awt.Color(0, 89, 124));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("INSERÇÃO DAS HORAS CURSADAS DO ALUNO INSIRA O NOME DO ALUNO PARA PESQUISAR:");

        jbPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/actions/pesquisar.png"))); // NOI18N
        jbPesquisar.setText("PESQUISAR");
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        jlNomeAluno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlNomeAluno.setForeground(new java.awt.Color(255, 255, 0));
        jlNomeAluno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlNomeAluno.setText("NOME DO ALUNO");

        jlCursoAluno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlCursoAluno.setForeground(new java.awt.Color(255, 255, 0));
        jlCursoAluno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCursoAluno.setText("CURSO DO ALUNO");

        jtfNome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtfNome.setToolTipText("Aperte o enter duas vezes para selecionar o aluno");
        jtfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNomeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CHEGADA:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SAÍDA:");

        try {
            jtfChegada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfChegada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfChegada.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtfChegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfChegadaActionPerformed(evt);
            }
        });

        try {
            jtfSaida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfSaida.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfSaida.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtfSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSaidaActionPerformed(evt);
            }
        });

        jbConsulta.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jbConsulta.setText("VER DADOS COMPLETO DO ALUNO");
        jbConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultaActionPerformed(evt);
            }
        });

        jbInserirHoras.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jbInserirHoras.setText("INSERIR HORAS ");
        jbInserirHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInserirHorasActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DATA:");

        jtfData.setDateFormatString("dd / MM / yyyy");
        jtfData.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jbVoltar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jbVoltar.setText("FECHAR ESTA JANELA");
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });

        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/actions/cancelar.png"))); // NOI18N
        jbCancelar.setText("CANCELAR");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlCursoAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jlNomeAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtfNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbPesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbCancelar)
                                .addGap(12, 12, 12)))
                        .addGap(45, 45, 45))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfSaida)
                                    .addComponent(jtfChegada)
                                    .addComponent(jtfData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(85, 85, 85))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbInserirHoras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator4))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jlNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlCursoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfData, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jtfChegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jtfSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jbInserirHoras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbConsulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbVoltar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNomeActionPerformed
        autoCompletarAluno();
    }//GEN-LAST:event_jtfNomeActionPerformed

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        autoCompletarAluno();
    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void jtfChegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfChegadaActionPerformed
        jtfSaida.requestFocus();
    }//GEN-LAST:event_jtfChegadaActionPerformed

    private void jtfSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSaidaActionPerformed
        registrarAulaAluno();
    }//GEN-LAST:event_jtfSaidaActionPerformed

    private void jbInserirHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInserirHorasActionPerformed
        registrarAulaAluno();
    }//GEN-LAST:event_jbInserirHorasActionPerformed

    private void jbConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultaActionPerformed
        ConsultarRegistro consultarRegistro = new ConsultarRegistro();
        JDesktopPane desktopPane = this.getDesktopPane();
        desktopPane.add(consultarRegistro);
        consultarRegistro.setVisible(true);
        consultarRegistro.setPosicao();
    }//GEN-LAST:event_jbConsultaActionPerformed

    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbVoltarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        limparCampos();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void carregarAlunosPrevisao() {
        lista = alunoController.retornaAlunos();
        ac = new TextAutoCompleter(jtfNome);
        ac.setItems(lista);
    }

    public void autoCompletarAluno() {
        verificarQuantidade(jtfNome.getText());
    }

    private void limparCampos() {
        jtfChegada.setText("");
        jtfSaida.setText("");
        jtfNome.setText("");
        jlCursoAluno.setText("CURSO DO ALUNO");
        jlNomeAluno.setText("NOME DO ALUNO");
        jtfData.setDate(getDateUtil.retornaDiaAnterior());
        jtfNome.requestFocus();
    }

    public void verificarQuantidade(String pAluno) {
        int qtde = alunoController.retornaQtdePorAluno(pAluno);

        if (qtde > 1) {
            SelecionaAluno selecionaAluno = new SelecionaAluno(null, true);
            selecionaAluno.carregarRegistro(pAluno);
            selecionaAluno.setVisible(true);

            jlNomeAluno.setText(AlunoModel.nomeAluno);
            nomeAluno = alunoController.retornarCursoPeloAluno(AlunoModel.nomeAluno);
            jlCursoAluno.setText(AlunoModel.cursoAluno);
            jtfChegada.requestFocus();
        } else {
            jlNomeAluno.setText(jtfNome.getText().toUpperCase());
            nomeAluno = alunoController.retornarCursoPeloAluno(jtfNome.getText()).toUpperCase();
            jlCursoAluno.setText(nomeAluno);
            jtfChegada.requestFocus();
        }
    }

    public void registrarAulaAluno() {
        alunoModel.setNome(jlNomeAluno.getText());
        aulaModel.setDataAula(getDateUtil.recuperaDataChooser(jtfData.getDate()));
        aulaModel.setChegada(jtfChegada.getText());
        aulaModel.setSaida(jtfSaida.getText());

        if (aulaController.registrarHoraAula(alunoModel, aulaModel)) {
            mensagemConfirmação.jlInfo.setText("CHEGADA: " + aulaModel.getChegada()
                    + "\n SAÍDA: " + aulaModel.getSaida()
                    + "\n Total dia: " + aulaController.retornaTotalCursadoDia(alunoModel.getNome()).toUpperCase());
            mensagemConfirmação.jlMensagem.setText("O REGISTRO DE " + alunoModel.getNome() + " FOI INSERIDO COM SUCESSO!");
            mensagemConfirmação.fechar();
            mensagemConfirmação.setVisible(true);

            LocalUtil.logClass = this.getClass().getName();
            LocalUtil.logType = templateAlerts.mensagemRegistroComum();
            new LogCatUtil().writeFile(String.valueOf("O REGISTRO DE " + alunoModel.getNome() + " FOI INSERIDO COM SUCESSO!"));

            repetirAcao();
        } else {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao registrar horário do aluno " + alunoModel.getNome(), "Atenção", JOptionPane.WARNING_MESSAGE);
            LocalUtil.logClass = this.getClass().getName();
            LocalUtil.logType = templateAlerts.mensagemRegsitroErro();
            new LogCatUtil().writeFile(String.valueOf("Ocorreu um erro ao registrar horário de " + alunoModel.getNome()));

        }
    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    private void repetirAcao() {
        jtfChegada.setText("");
        jtfSaida.setText("");

        int dialogResult = JOptionPane.showConfirmDialog(null, "Deseja registrar mais um horário deste aluno?\n Clique em Yes caso queira ou em No se deseja registrar outro", "Atenção", JOptionPane.YES_NO_OPTION);
        try {
            if (dialogResult == 0) {
                alunoModel = new AlunoModel();
                jtfChegada.setText("");
                jtfSaida.setText("");
                jtfChegada.requestFocus();

            } else {
                jtfChegada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
                jtfSaida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
                jtfNome.setText("");
                jtfNome.requestFocus();
                limparCampos();
            }
        } catch (ParseException e) {
            e.toString();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbConsulta;
    private javax.swing.JButton jbInserirHoras;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbVoltar;
    public javax.swing.JLabel jlCursoAluno;
    public javax.swing.JLabel jlNomeAluno;
    private javax.swing.JFormattedTextField jtfChegada;
    private com.toedter.calendar.JDateChooser jtfData;
    public javax.swing.JTextField jtfNome;
    private javax.swing.JFormattedTextField jtfSaida;
    // End of variables declaration//GEN-END:variables
}
