package com.controlecci.view.SCCI;

import com.controlecci.controller.CursoController;
import com.controlecci.model.CursoModel;
import com.controlecci.util.MascarasUtil;
import com.controlecci.view.MensagemConfirmação;
import com.controlecci.view.TelaCarregamento;
import com.mxrck.autocompleter.AutoCompleter;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joseluiz
 */
public class CursoView extends javax.swing.JInternalFrame {

    CursoController cursoController = new CursoController();
    CursoModel cursoModel = new CursoModel();
    MensagemConfirmação mensagemConfirmação = new MensagemConfirmação(null, true);
    TelaCarregamento telaCarregamento = new TelaCarregamento(null, true);
    ArrayList<CursoModel> listaCursoModels = new ArrayList<>();
    private AutoCompleter ac;
    public ArrayList lista = new ArrayList<>();
    MascarasUtil mascarasUtil = new MascarasUtil();

    /**
     * Creates new form Curso
     */
    public CursoView() {
        initComponents();
        carregarRegistro();
        autoCompletar();
        habilitaDesabilitaCamposCadastro(false);
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfCadastroCurso = new javax.swing.JTextField();
        jtfCadastroModulos = new javax.swing.JTextField();
        jtfCadastroValor = new javax.swing.JTextField();
        jbCancelarCadastro = new javax.swing.JButton();
        jbSalvarCurso = new javax.swing.JButton();
        jbNovoCadastro = new javax.swing.JButton();
        jtfCadastroCargaHoraria = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jtfPequisa = new javax.swing.JTextField();
        jbPesquisar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtfCurso = new javax.swing.JTextField();
        jtfModulos = new javax.swing.JTextField();
        jtfValor = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jbAlterar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jtfCargaHoraria = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCurso = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("CURSOS");
        setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(28, 89, 124));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        jPanel6.setBackground(new java.awt.Color(28, 89, 124));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CADASTRO DE NOVO CURSO");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CURSO:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MÓDULOS");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CARGA HORÁRIA:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("VALOR:");

        jtfCadastroCurso.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtfCadastroCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCadastroCursoActionPerformed(evt);
            }
        });

        jtfCadastroModulos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtfCadastroModulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCadastroModulosActionPerformed(evt);
            }
        });

        jtfCadastroValor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtfCadastroValor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfCadastroValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCadastroValorActionPerformed(evt);
            }
        });

        jbCancelarCadastro.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jbCancelarCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/actions/cancelar.png"))); // NOI18N
        jbCancelarCadastro.setText("CANCELAR");
        jbCancelarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarCadastroActionPerformed(evt);
            }
        });

        jbSalvarCurso.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jbSalvarCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/actions/salvar.png"))); // NOI18N
        jbSalvarCurso.setText("SALVAR");
        jbSalvarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarCursoActionPerformed(evt);
            }
        });

        jbNovoCadastro.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jbNovoCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/actions/add.png"))); // NOI18N
        jbNovoCadastro.setText("NOVO");
        jbNovoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoCadastroActionPerformed(evt);
            }
        });

        try {
            jtfCadastroCargaHoraria.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfCadastroCargaHoraria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfCadastroCargaHoraria.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtfCadastroCargaHoraria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCadastroCargaHorariaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jbCancelarCadastro))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jbNovoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                                .addComponent(jbSalvarCurso))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jtfCadastroCargaHoraria))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfCadastroValor))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfCadastroModulos)
                            .addComponent(jtfCadastroCurso))))
                .addContainerGap())
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfCadastroCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfCadastroModulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jtfCadastroCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jtfCadastroValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelarCadastro)
                    .addComponent(jbSalvarCurso)
                    .addComponent(jbNovoCadastro))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("NOVO CURSO", jPanel2);

        jPanel5.setBackground(new java.awt.Color(28, 89, 124));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PESQUISA");

        jtfPequisa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtfPequisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPequisaActionPerformed(evt);
            }
        });

        jbPesquisar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jbPesquisar.setText("PESQUISAR");
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CURSO");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CARGA HORÁRIA");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("MÓDULOS");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("VALOR");

        jtfCurso.setEditable(false);
        jtfCurso.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jtfModulos.setEditable(false);
        jtfModulos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jtfValor.setEditable(false);
        jtfValor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jbAlterar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jbAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/actions/atualizar.png"))); // NOI18N
        jbAlterar.setText("ALTERAR");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbCancelar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecci/image/actions/cancelar.png"))); // NOI18N
        jbCancelar.setText("CANCELAR");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jtfCargaHoraria.setEditable(false);
        try {
            jtfCargaHoraria.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfCargaHoraria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfCargaHoraria.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jbCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbAlterar)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfPequisa, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbPesquisar)
                        .addGap(33, 33, 33))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jtfCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(95, 95, 95)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jtfValor)))
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jtfCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfModulos, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(31, Short.MAX_VALUE))))
            .addComponent(jSeparator2)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtfPequisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfModulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel8))
                .addGap(20, 20, 20)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar)
                    .addComponent(jbAlterar))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTabbedPane1.addTab("ALTERAR CURSO", jPanel3);

        jPanel7.setBackground(new java.awt.Color(28, 89, 124));

        jtCurso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CURSO", "MODULOS", "CARGA HORÁRIA", "VALOR"
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
        jtCurso.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtCurso);
        if (jtCurso.getColumnModel().getColumnCount() > 0) {
            jtCurso.getColumnModel().getColumn(2).setResizable(false);
            jtCurso.getColumnModel().getColumn(2).setPreferredWidth(5);
            jtCurso.getColumnModel().getColumn(3).setResizable(false);
            jtCurso.getColumnModel().getColumn(3).setPreferredWidth(7);
        }

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("TODOS OS CURSOS CADASTRADOS");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("VISUALIZAR CURSOS CADASTRADOS", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarCadastroActionPerformed
        limparCadastro();
        habilitaDesabilitaCamposCadastro(false);
    }//GEN-LAST:event_jbCancelarCadastroActionPerformed

    private void jbNovoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoCadastroActionPerformed
        habilitaDesabilitaCamposCadastro(true);
        jtfCadastroCurso.requestFocus();
    }//GEN-LAST:event_jbNovoCadastroActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        limparAlteracao();
        habilitaDesabilitaCamposAlteracao(false);
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jtfPequisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPequisaActionPerformed
        habilitaDesabilitaCamposAlteracao(true);
        jtfCurso.requestFocus();
        preencherDadosAlteracao();
    }//GEN-LAST:event_jtfPequisaActionPerformed

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        habilitaDesabilitaCamposAlteracao(true);
    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        habilitaDesabilitaCamposAlteracao(true);
        alterarCurso();
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbSalvarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarCursoActionPerformed
        salvarCurso();
    }//GEN-LAST:event_jbSalvarCursoActionPerformed

    private void jtfCadastroCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCadastroCursoActionPerformed
        jtfCadastroModulos.requestFocus();
    }//GEN-LAST:event_jtfCadastroCursoActionPerformed

    private void jtfCadastroModulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCadastroModulosActionPerformed
        jtfCadastroCargaHoraria.requestFocus();
    }//GEN-LAST:event_jtfCadastroModulosActionPerformed

    private void jtfCadastroCargaHorariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCadastroCargaHorariaActionPerformed
        jtfCadastroValor.requestFocus();
    }//GEN-LAST:event_jtfCadastroCargaHorariaActionPerformed

    private void jtfCadastroValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCadastroValorActionPerformed
        salvarCurso();
    }//GEN-LAST:event_jtfCadastroValorActionPerformed

    private void limparCadastro() {
        jtfCadastroCargaHoraria.setText("");
        jtfCadastroCurso.setText("");
        jtfCadastroModulos.setText("");
        jtfCadastroValor.setText("");
        jtfCadastroCurso.requestFocus();
    }

    private void habilitaDesabilitaCamposCadastro(boolean condicao) {
        jtfCadastroCargaHoraria.setEnabled(condicao);
        jtfCadastroCurso.setEnabled(condicao);
        jtfCadastroModulos.setEnabled(condicao);
        jtfCadastroValor.setEnabled(condicao);
    }

    private void habilitaDesabilitaCamposAlteracao(boolean condicao) {
        jtfCurso.setEnabled(condicao);
        jtfModulos.setEnabled(condicao);
        jtfCargaHoraria.setEnabled(condicao);
        jtfValor.setEnabled(condicao);
        jtfCurso.setEditable(condicao);
        jtfModulos.setEditable(condicao);
        jtfCargaHoraria.setEditable(condicao);
        jtfValor.setEditable(condicao);
    }

    private void limparAlteracao() {
        jtfCurso.setText("");
        jtfModulos.setText("");
        jtfCargaHoraria.setText("");
        jtfValor.setText("");
        jtfPequisa.setText("");
        jtfPequisa.requestFocus();
    }

    private void preencherDadosAlteracao() {
        cursoModel = cursoController.getInfoCurso(jtfPequisa.getText().toUpperCase());
        jtfCurso.setText(cursoModel.getNomeCurso());
        jtfModulos.setText(cursoModel.getModulos());
        jtfValor.setText(String.valueOf(cursoModel.getValor()));
        jtfCargaHoraria.setText(cursoModel.getCargaHoraria());
    }

    private void salvarCurso() {
        cursoModel.setNomeCurso(jtfCadastroCurso.getText().toUpperCase());
        cursoModel.setModulos(jtfCadastroModulos.getText().toUpperCase());
        cursoModel.setCargaHoraria(jtfCadastroCargaHoraria.getText());
        cursoModel.setValor(Double.parseDouble(mascarasUtil.converterVirgulaParaPonto(jtfCadastroValor.getText())));

        if (cursoController.salvarCurso(cursoModel)) {
            mensagemConfirmação.jlMensagem.setText("O CURSO: " + cursoModel.getNomeCurso().toUpperCase() + " FOI SALVO COM SUCESSO!");
            mensagemConfirmação.jlInfo.setText("MÓDULOS: " + cursoModel.getModulos().toUpperCase());
            mensagemConfirmação.fechar();
            mensagemConfirmação.setVisible(true);
            carregarRegistro();
            limparCadastro();
        } else {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao salvar o curso: " + cursoModel.getNomeCurso().toUpperCase(), "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void alterarCurso() {
        cursoModel = new CursoModel();
        cursoModel.setNomeCurso(jtfCurso.getText().toUpperCase());
        cursoModel.setModulos(jtfModulos.getText().toUpperCase());
        cursoModel.setCargaHoraria(jtfCargaHoraria.getText());
        cursoModel.setValor(Double.parseDouble(mascarasUtil.converterVirgulaParaPonto(jtfValor.getText())));

        if (cursoController.alterarCurso(cursoModel)) {
            mensagemConfirmação.jlMensagem.setText("O CURSO: " + cursoModel.getNomeCurso().toUpperCase() + " FOI ALTERADO COM SUCESSO!");
            mensagemConfirmação.jlInfo.setText("MÓDULOS: " + cursoModel.getModulos().toUpperCase());
            mensagemConfirmação.fechar();
            mensagemConfirmação.setVisible(true);
            carregarRegistro();
            limparAlteracao();
            habilitaDesabilitaCamposAlteracao(false);
        } else {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao salvar o curso: " + cursoModel.getNomeCurso().toUpperCase(), "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void autoCompletar() {
        ac = new TextAutoCompleter(jtfPequisa);
        lista = cursoController.getCursoApenas();
        ac.setItems(lista);
    }

    public void chamarJDialog() {
        telaCarregamento.fechar();
        telaCarregamento.setVisible(true);
    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    private void carregarRegistro() {
        listaCursoModels = cursoController.getListaCursos();
        DefaultTableModel modeloTabela = (DefaultTableModel) jtCurso.getModel();
        modeloTabela.setNumRows(0);
        try {
            int cont = listaCursoModels.size();
            for (int i = 0; i < cont; i++) {
                modeloTabela.addRow(new Object[]{
                    listaCursoModels.get(i).getNomeCurso(),
                    listaCursoModels.get(i).getModulos(),
                    listaCursoModels.get(i).getCargaHoraria(),
                    listaCursoModels.get(i).getValor()
                });
            }
            chamarJDialog();
        } catch (Exception e) {
            e.toString();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbCancelarCadastro;
    private javax.swing.JButton jbNovoCadastro;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbSalvarCurso;
    private javax.swing.JTable jtCurso;
    private javax.swing.JFormattedTextField jtfCadastroCargaHoraria;
    private javax.swing.JTextField jtfCadastroCurso;
    private javax.swing.JTextField jtfCadastroModulos;
    private javax.swing.JTextField jtfCadastroValor;
    private javax.swing.JFormattedTextField jtfCargaHoraria;
    private javax.swing.JTextField jtfCurso;
    private javax.swing.JTextField jtfModulos;
    private javax.swing.JTextField jtfPequisa;
    private javax.swing.JTextField jtfValor;
    // End of variables declaration//GEN-END:variables
}
