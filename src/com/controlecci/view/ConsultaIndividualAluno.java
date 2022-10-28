package com.controlecci.view;

import com.controlecci.controller.AlunoController;
import com.controlecci.controller.AulaController;
import com.controlecci.controller.CursoController;
import com.controlecci.model.AlunoModel;
import com.controlecci.model.AulaModel;
import com.mxrck.autocompleter.AutoCompleter;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joseluiz
 */
public class ConsultaIndividualAluno extends javax.swing.JFrame {
    
    AlunoModel alunoModel = new AlunoModel();
    
    AlunoController alunoController = new AlunoController();
    AulaController aulaController = new AulaController();
    CursoController cursoController = new CursoController();
    
    ArrayList<AulaModel> listaAulaModels = new ArrayList<>();
    public ArrayList lista = new ArrayList<>();
    
    private AutoCompleter ac;
    MensagemConfirmação mensagemConfirmação = new MensagemConfirmação(this, true);

    /**
     * Creates new form NewJFrame
     */
    public ConsultaIndividualAluno() {
        initComponents();
        setLocationRelativeTo(null);
        autoCompletar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jlNomeAluno = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jbPesquisar = new javax.swing.JButton();
        jtfNomeAluno = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jlCurso = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jlModulos = new javax.swing.JLabel();
        jlCargaHoraria = new javax.swing.JLabel();
        jlHorasRealizadas = new javax.swing.JLabel();
        jlHorasRestantes = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jlDataInicio = new javax.swing.JLabel();
        jlDataEncerramento = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jlSituacaoAluno = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jbSuspender = new javax.swing.JToggleButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jlSituacaoHoras = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtConsulta = new javax.swing.JTable();
        jlVoltar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 84, 124));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CONSULTA DE DADOS DOS ALUNOS ALUNOS ATIVOS");

        jlNomeAluno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlNomeAluno.setForeground(new java.awt.Color(255, 255, 255));
        jlNomeAluno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlNomeAluno.setText("ALUNO NÃO ENCONTRADO OU NÃO PESQUISADO");

        jPanel4.setBackground(new java.awt.Color(250, 250, 250));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ALUNO:");

        jbPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/actions/pesquisar.png"))); // NOI18N
        jbPesquisar.setText("PESQUISAR");
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        jtfNomeAluno.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtfNomeAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNomeAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfNomeAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbPesquisar)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Aluno Selecionado:");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("CURSO:");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setText("CARGA HORÁRIA:");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setText("HORAS REALIZADAS PELO ALUNO:");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel8.setText("HORAS RESTANTES:");

        jlCurso.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlCurso.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlCurso.setText("$NOMECURSO");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel9.setText("MÓDULOS:");

        jlModulos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlModulos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlModulos.setText("$MÓDULOS");

        jlCargaHoraria.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlCargaHoraria.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlCargaHoraria.setText("$CARGA HORÁRIA");

        jlHorasRealizadas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlHorasRealizadas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlHorasRealizadas.setText("$HORAS REALIZADAS");

        jlHorasRestantes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlHorasRestantes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlHorasRestantes.setText("$HORAS RESTANTES");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel11.setText("DATA DE INÍCIO DO CURSO:");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel12.setText("DATA DE ENCERRAMENTO:");

        jlDataInicio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlDataInicio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlDataInicio.setText("$DATA INICIO");

        jlDataEncerramento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlDataEncerramento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlDataEncerramento.setText("$DATA ENCERRAMENTO");

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel13.setText("SITUAÇÃO ATUAL DO ALUNO:");

        jlSituacaoAluno.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlSituacaoAluno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlSituacaoAluno.setText("$SITUACAO");

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel14.setText("SUSPENDER CURSO:");

        jbSuspender.setText("SUSPENDER");
        jbSuspender.setToolTipText("A CONTAGEM SERÁ INTERROMPIDA, AO FINAL DO PRAZO DO ALUNO REMOVA A SUSPENSÃO");

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("A CONTAGEM SERÁ INTERROMPIDA, AO FINAL DO PRAZO DO ALUNO REMOVA A SUSPENSÃO");

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel16.setText("SITUAÇÃO HORAS:");

        jlSituacaoHoras.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlSituacaoHoras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlSituacaoHoras.setText("$SITUACAO HORAS");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 5, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlHorasRealizadas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlDataEncerramento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlDataInicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlCargaHoraria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlHorasRestantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlSituacaoHoras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlSituacaoAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSuspender)
                        .addGap(120, 120, 120))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlModulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jlCurso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jlModulos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jlCargaHoraria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jlDataInicio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jlDataEncerramento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jlHorasRealizadas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jlHorasRestantes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jlSituacaoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jlSituacaoHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(jbSuspender))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(53, 53, 53))
        );

        jtConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Data", "Chegada", "Saída", "Total(Dia)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtConsulta);

        jlVoltar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlVoltar.setForeground(new java.awt.Color(255, 255, 255));
        jlVoltar.setText("VOLTAR A TELA ANTERIOR");
        jlVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlVoltarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlVoltarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlVoltarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlVoltar)
                .addContainerGap())
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(424, 424, 424))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlVoltar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNomeAluno)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNomeAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNomeAlunoActionPerformed
        jlNomeAluno.setText(jtfNomeAluno.getText().toUpperCase());
        alunoModel.setNome(jtfNomeAluno.getText());
        carregarRegistro();
        infoCurso();
    }//GEN-LAST:event_jtfNomeAlunoActionPerformed

    private void jlVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlVoltarMouseClicked
        this.dispose();
        //  new RegistroAluno().limparCampos();
    }//GEN-LAST:event_jlVoltarMouseClicked

    private void jlVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlVoltarMouseEntered
        jlVoltar.setForeground(Color.YELLOW);
    }//GEN-LAST:event_jlVoltarMouseEntered

    private void jlVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlVoltarMouseExited
        jlVoltar.setForeground(Color.white);
    }//GEN-LAST:event_jlVoltarMouseExited

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        carregarRegistro();
    }//GEN-LAST:event_jbPesquisarActionPerformed
    
    private void autoCompletar() {
        ac = new TextAutoCompleter(jtfNomeAluno);
        lista = alunoController.retornaAlunos();
        ac.setItems(lista);
    }
    
    public void chamarJDialog() {
        mensagemConfirmação.jlMensagem.setText("FINALIZANDO O CARREGAMENTO DE DADOS");
        mensagemConfirmação.jlInfo.setText("POR FAVOR AGUARDE");
        mensagemConfirmação.fechar();
        mensagemConfirmação.setVisible(true);
    }
    
    public void carregarRegistro() {
        listaAulaModels = aulaController.getRegistroAula(alunoModel.getNome());
        DefaultTableModel modeloTabela = (DefaultTableModel) jtConsulta.getModel();
        modeloTabela.setNumRows(0);
        try {
            int cont = listaAulaModels.size();
            for (int i = 0; i < cont; i++) {
                modeloTabela.addRow(new Object[]{
                    listaAulaModels.get(i).getDataAula(),
                    listaAulaModels.get(i).getChegada(),
                    listaAulaModels.get(i).getSaida(),
                    listaAulaModels.get(i).getTotalHoraAula()});
            }
            chamarJDialog();
        } catch (Exception e) {
            e.toString();
        }
    }
    
    public void infoCurso() {
        jlCargaHoraria.setText(cursoController.retornaDadosCurso(jtfNomeAluno.getText()).getCargaHoraria());
        jlCurso.setText(cursoController.retornaDadosCurso(jtfNomeAluno.getText()).getNomeCurso().toUpperCase());
        jlModulos.setText(cursoController.retornaDadosCurso(jtfNomeAluno.getText()).getModulos());
        jlDataInicio.setText(cursoController.retornaPrimeiraData(jtfNomeAluno.getText()));
        jlDataEncerramento.setText(cursoController.retornaDataFinalCurso(jtfNomeAluno.getText()));
        jlHorasRealizadas.setText(cursoController.retornaTotalCursado(jtfNomeAluno.getText()));
        jlHorasRestantes.setText(aulaController.retornaTempoRestante(jtfNomeAluno.getText()));
        jlSituacaoAluno.setText(cursoController.retornaStatusAluno(jtfNomeAluno.getText()));
        /**/
        if (jlDataInicio.getText() == null) {
            jlDataInicio.setForeground(Color.red);
            jlHorasRealizadas.setForeground(Color.red);
            jlHorasRestantes.setForeground(Color.red);
            jlDataEncerramento.setForeground(Color.red);
            jlDataInicio.setText("NÃO INICIOU O CURSO");
            jlDataEncerramento.setText("NÃO INICIOU O CURSO");
            jlHorasRealizadas.setText("NÃO INICIOU O CURSO");
            jlHorasRestantes.setText("NÃO INICIOU O CURSO");
            
        } else {
            jlDataInicio.setForeground(Color.black);
            jlHorasRealizadas.setForeground(Color.black);
            jlHorasRestantes.setForeground(Color.black);
            jlDataEncerramento.setForeground(Color.black);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JToggleButton jbSuspender;
    private javax.swing.JLabel jlCargaHoraria;
    public javax.swing.JLabel jlCurso;
    private javax.swing.JLabel jlDataEncerramento;
    private javax.swing.JLabel jlDataInicio;
    private javax.swing.JLabel jlHorasRealizadas;
    private javax.swing.JLabel jlHorasRestantes;
    private javax.swing.JLabel jlModulos;
    private javax.swing.JLabel jlNomeAluno;
    private javax.swing.JLabel jlSituacaoAluno;
    private javax.swing.JLabel jlSituacaoHoras;
    private javax.swing.JLabel jlVoltar;
    private javax.swing.JTable jtConsulta;
    private javax.swing.JTextField jtfNomeAluno;
    // End of variables declaration//GEN-END:variables
}