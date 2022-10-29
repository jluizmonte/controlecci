package com.controlecci.view;

import com.controlecci.controller.AlunoController;
import com.controlecci.controller.AulaController;
import com.controlecci.model.AlunoModel;
import com.controlecci.model.AulaModel;
import com.controlecci.util.GetDateUtil;
import com.mxrck.autocompleter.AutoCompleter;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author joseluiz
 */
public class RegistroAluno extends javax.swing.JFrame {

    private AutoCompleter ac;
    public AlunoModel alunoModel = new AlunoModel();
    AulaModel aulaModel = new AulaModel();
    public ArrayList lista = new ArrayList<>();
    AlunoController alunoController = new AlunoController();
    AulaController aulaController = new AulaController();
    public String nomeAluno;
    GetDateUtil getDateUtil = new GetDateUtil();
    MensagemConfirmação mensagemConfirmação = new MensagemConfirmação(this, true);

    /**
     * Creates new form FrmAlunos
     */
    public RegistroAluno() {

        initComponents();
        setLocationRelativeTo(null);
        carregarAlunosPrevisao();
        limparCampos();
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
        jLabel2 = new javax.swing.JLabel();
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
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jbVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BANCO DE HORAS - ALUNO CCI");

        jPanel1.setBackground(new java.awt.Color(0, 89, 124));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INSERÇÃO DAS HORAS CURSADAS DO ALUNO");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INSIRA O NOME DO ALUNO PARA PESQUISAR:");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jlNomeAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlCursoAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(147, 147, 147)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtfSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(jtfChegada)
                                        .addComponent(jtfData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(84, 84, 84))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(339, 339, 339)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbInserirHoras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(11, 11, 11)))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCursoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                            .addComponent(jtfData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGap(24, 24, 24)
                        .addComponent(jbInserirHoras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbConsulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbVoltar)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
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
        new ConsultaAlunos().setVisible(true);
    }//GEN-LAST:event_jbConsultaActionPerformed

    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbVoltarActionPerformed

    public void carregarAlunosPrevisao() {
        lista = alunoController.retornaAlunos();
        ac = new TextAutoCompleter(jtfNome);
        ac.setItems(lista);
    }

    public void autoCompletarAluno() {
        jlNomeAluno.setText(jtfNome.getText().toUpperCase());
        nomeAluno = alunoController.retornarCursoPeloAluno(jtfNome.getText()).toUpperCase();
        jlCursoAluno.setText(nomeAluno);
        jtfChegada.requestFocus();
    }

    public void limparCampos() {
        jtfChegada.setText("");
        jtfSaida.setText("");
        jtfNome.setText("");
        jtfData.setDate(getDateUtil.retornaDiaAnterior());
        jtfNome.requestFocus();
    }

    public void registrarAulaAluno() {
        alunoModel.setNome(jtfNome.getText());
        aulaModel.setDataAula(getDateUtil.recuperaDataChooser(jtfData.getDate())); // resolver a data do JDate!
        aulaModel.setChegada(jtfChegada.getText());
        aulaModel.setSaida(jtfSaida.getText());
        if (aulaController.registrarHoraAula(alunoModel, aulaModel)) {
            limparCampos();
            mensagemConfirmação.jlInfo.setText("CHEGADA: " + aulaModel.getChegada()
                    + "\n SAÍDA: " + aulaModel.getSaida()
                    + "\n Total dia: " + aulaController.retornaTotalCursadoDia(alunoModel.getNome()).toUpperCase());
            mensagemConfirmação.jlMensagem.setText("O REGISTRO DE: " + alunoModel.getNome() + " FOI INSERIDO COM SUCESSO!");
            mensagemConfirmação.fechar();
            mensagemConfirmação.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao registrar horário do aluno: " + alunoModel.getNome(), "Atenção", JOptionPane.WARNING_MESSAGE);
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
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
