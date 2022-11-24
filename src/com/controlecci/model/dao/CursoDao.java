package com.controlecci.model.dao;

import com.controlecci.connection.ConnectionMySQL;
import com.controlecci.model.CursoModel;
import com.controlecci.util.LocalUtil;
import com.controlecci.util.LogCatUtil;
import com.controlecci.util.TemplateAlerts;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Instrutores
 */
public class CursoDao extends ConnectionMySQL {

    TemplateAlerts templateAlerts = new TemplateAlerts();

    /**
     * retorna os dados do curso do aluno pelo nome e curso
     *
     * @param pAluno
     * @param pCurso
     * @return
     */
    public CursoModel retornaDadosAlunoCurso(String pAluno, String pCurso) {
        CursoModel cursoModel = new CursoModel();
        try {
            this.conectar();
            this.executarSQL("select nome_curso, modulo_curso, carga_horaria, valor from curso join aluno_cadastro on id_curso = curso_fk_cadastro where nome = '" + pAluno + "' and nome_curso='" + pCurso + "' and situacao='ATIVO';");
            while (this.getResultSet().next()) {
                cursoModel = new CursoModel();
                cursoModel.setNomeCurso(this.getResultSet().getString(1));
                cursoModel.setModulos(this.getResultSet().getString(2));
                cursoModel.setCargaHoraria(this.getResultSet().getString(3));
                cursoModel.setValor(this.getResultSet().getDouble(4));
            }
        } catch (SQLException ex) {
            LocalUtil.logClass = this.getClass().getName();
            LocalUtil.logType = templateAlerts.mensagemRegsitroErro();
            new LogCatUtil().writeFile(String.valueOf(templateAlerts.erroBuscarDados("dados do curso\n") + ex.toString()));
        } finally {
            this.fecharConexao();
        }
        return cursoModel;
    }

    /**
     * retorna dados do curso pelo nome do aluno
     *
     * @param pAluno
     * @return
     */
    public CursoModel retornaDadosCurso(String pAluno) {
        CursoModel cursoModel = new CursoModel();
        try {
            this.conectar();
            this.executarSQL("select nome_curso, modulo_curso, carga_horaria, valor from curso join aluno_cadastro on id_curso = curso_fk_cadastro where nome = '" + pAluno + "' and situacao='ATIVO';");
            while (this.getResultSet().next()) {
                cursoModel = new CursoModel();
                cursoModel.setNomeCurso(this.getResultSet().getString(1));
                cursoModel.setModulos(this.getResultSet().getString(2));
                cursoModel.setCargaHoraria(this.getResultSet().getString(3));
                cursoModel.setValor(this.getResultSet().getDouble(4));
            }
        } catch (SQLException ex) {
            LocalUtil.logClass = this.getClass().getName();
            LocalUtil.logType = templateAlerts.mensagemRegsitroErro();
            new LogCatUtil().writeFile(String.valueOf(templateAlerts.erroBuscarDados("dados do curso\n") + ex.toString()));
        } finally {
            this.fecharConexao();
        }
        return cursoModel;
    }

    /**
     * retorna as informações do curso
     *
     * @param pCurso
     * @return
     */
    public CursoModel getInformacoesCurso(String pCurso) {
        CursoModel cursoModel = new CursoModel();
        try {
            this.conectar();
            this.executarSQL("select nome_curso, modulo_curso, carga_horaria, valor from curso where nome_curso='" + pCurso + "';");
            while (this.getResultSet().next()) {
                cursoModel = new CursoModel();
                cursoModel.setNomeCurso(this.getResultSet().getString(1));
                cursoModel.setModulos(this.getResultSet().getString(2));
                cursoModel.setCargaHoraria(this.getResultSet().getString(3));
                cursoModel.setValor(this.getResultSet().getDouble(4));
            }
        } catch (SQLException ex) {
            LocalUtil.logClass = this.getClass().getName();
            LocalUtil.logType = templateAlerts.mensagemRegsitroErro();
            new LogCatUtil().writeFile(String.valueOf(templateAlerts.erroBuscarDados("informações do curso\n") + ex.toString()));
        } finally {
            this.fecharConexao();
        }
        return cursoModel;
    }

    /**
     * retorna a primeira data cadastrada, como sendo a data de inicio do aluno
     * pelo nome
     *
     * @param pAluno
     * @return
     */
    public String retornaPrimeiraData(String pAluno) {
        try {
            this.conectar();
            this.executarSQL("select min(DATE_FORMAT(data_aula, '%d/%m/%Y')) from aula join aluno_cadastro on id_aluno_fk = id_cadastro where nome ='" + pAluno + "';");
            while (this.getResultSet().next()) {
                pAluno = this.getResultSet().getString(1);
            }
        } catch (SQLException ex) {
            LocalUtil.logClass = this.getClass().getName();
            LocalUtil.logType = templateAlerts.mensagemRegsitroErro();
            new LogCatUtil().writeFile(String.valueOf(templateAlerts.erroBuscarDados("primeira data do aluno\n") + ex.toString()));
        } finally {
            this.fecharConexao();
        }
        return pAluno;
    }

    /**
     * retorna a primeira data como sendo a de inicio do curso pleo nome do
     * aluno e curso
     *
     * @param pAluno
     * @param pCurso
     * @return
     */
    public String retornaPrimeiraDataAlunoCurso(String pAluno, String pCurso) {
        try {
            this.conectar();
            this.executarSQL("select min(DATE_FORMAT(data_aula, '%d/%m/%Y')) from aula join aluno_cadastro on id_aluno_fk = id_cadastro join curso on id_curso=curso_fk_cadastro where nome ='" + pAluno + "' and nome_curso='" + pCurso + "';");
            while (this.getResultSet().next()) {
                pAluno = this.getResultSet().getString(1);
            }
        } catch (SQLException ex) {
            LocalUtil.logClass = this.getClass().getName();
            LocalUtil.logType = templateAlerts.mensagemRegsitroErro();
            new LogCatUtil().writeFile(String.valueOf(templateAlerts.erroBuscarDados("primeira data do aluno\n") + ex.toString()));
        } finally {
            this.fecharConexao();
        }
        return pAluno;
    }

    /**
     *
     * @param pAluno
     * @return
     */
    public String retornaDataFinalCurso(String pAluno) {
        try {
            this.conectar();
            this.executarSQL("select date_add((select min(data_aula) from aula join aluno_cadastro on id_aluno_fk = id_cadastro where nome ='" + pAluno + "'), interval 90 day);");
            while (this.getResultSet().next()) {
                pAluno = this.getResultSet().getString(1);
            }
        } catch (SQLException ex) {
            LocalUtil.logClass = this.getClass().getName();
            LocalUtil.logType = templateAlerts.mensagemRegsitroErro();
            new LogCatUtil().writeFile(String.valueOf(templateAlerts.erroBuscarDados("data final do aluno\n") + ex.toString()));
        } finally {
            this.fecharConexao();
        }
        return pAluno;
    }

    /**
     *
     * @param pAluno
     * @param pCurso
     * @return
     */
    public String retornaDataFinalAlunoCurso(String pAluno, String pCurso) {
        try {
            this.conectar();
            this.executarSQL("select date_add((select min(data_aula) from aula join aluno_cadastro on id_aluno_fk = id_cadastro join curso on id_curso=curso_fk_cadastro where nome ='" + pAluno + "' and nome_curso='" + pCurso + "'), interval 90 day);");
            while (this.getResultSet().next()) {
                pAluno = this.getResultSet().getString(1);
            }
        } catch (SQLException ex) {
            LocalUtil.logClass = this.getClass().getName();
            LocalUtil.logType = templateAlerts.mensagemRegsitroErro();
            new LogCatUtil().writeFile(String.valueOf(templateAlerts.erroBuscarDados("data final do aluno\n") + ex.toString()));
        } finally {
            this.fecharConexao();
        }
        return pAluno;
    }

    /**
     *
     * @return
     */
    public String retornaQtdeCurso() {
        String pQuantidade = "";
        try {
            this.conectar();
            this.executarSQL("select count(nome_curso) from curso;");

            while (this.getResultSet().next()) {
                pQuantidade = this.getResultSet().getString(1);
            }
        } catch (SQLException ex) {
            LocalUtil.logClass = this.getClass().getName();
            LocalUtil.logType = templateAlerts.mensagemRegsitroErro();
            new LogCatUtil().writeFile(String.valueOf(templateAlerts.erroBuscarDados("quantidade total dos cursos\n") + ex.toString()));
        } finally {
            this.fecharConexao();
        }
        return pQuantidade;
    }

    /**
     * retorna o tempo total cursado pelo aluno pelo nome dele
     *
     * @param pAluno
     * @return
     */
    public String retornaTotalCursado(String pAluno) {
        try {
            this.conectar();
            this.executarSQL("SELECT  SEC_TO_TIME( SUM( TIME_TO_SEC( hora_de_aula ) ) ) AS timeSum  FROM aula join aluno_cadastro on id_aluno_fk=id_cadastro where nome='" + pAluno + "';");
            while (this.getResultSet().next()) {
                pAluno = this.getResultSet().getString(1);
            }
        } catch (SQLException ex) {
            LocalUtil.logClass = this.getClass().getName();
            LocalUtil.logType = templateAlerts.mensagemRegsitroErro();
            new LogCatUtil().writeFile(String.valueOf(templateAlerts.erroBuscarDados("total do curso do aluno\n") + ex.toString()));
        } finally {
            this.fecharConexao();
        }
        return pAluno;
    }

    /**
     * retorna o tempo cursado do aluno pelo nome e curso dele
     *
     * @param pAluno
     * @param pCurso
     * @return
     */
    public String retornaTotalCursadoAlunoCurso(String pAluno, String pCurso) {
        try {
            this.conectar();
            this.executarSQL("SELECT  SEC_TO_TIME( SUM( TIME_TO_SEC( hora_de_aula ) ) ) AS timeSum  FROM aula join aluno_cadastro on id_aluno_fk=id_cadastro join curso on id_curso=curso_fk_cadastro where nome='" + pAluno + "' and nome_curso='" + pCurso + "';");
            while (this.getResultSet().next()) {
                pAluno = this.getResultSet().getString(1);
            }
        } catch (SQLException ex) {
            LocalUtil.logClass = this.getClass().getName();
            LocalUtil.logType = templateAlerts.mensagemRegsitroErro();
            new LogCatUtil().writeFile(String.valueOf(templateAlerts.erroBuscarDados("total do curso do aluno\n") + ex.toString()));
        } finally {
            this.fecharConexao();
        }
        return pAluno;
    }

    /**
     *
     * @param pAluno
     * @return
     */
    public String retornaStatusAluno(String pAluno) {
        try {
            this.conectar();
            this.executarSQL("select situacao from aluno_cadastro where nome='" + pAluno + "';");
            while (this.getResultSet().next()) {
                pAluno = this.getResultSet().getString(1);
            }
        } catch (SQLException ex) {
            LocalUtil.logClass = this.getClass().getName();
            LocalUtil.logType = templateAlerts.mensagemRegsitroErro();
            new LogCatUtil().writeFile(String.valueOf(templateAlerts.erroBuscarDados("situação do aluno\n") + ex.toString()));
        } finally {
            this.fecharConexao();
        }
        return pAluno;
    }

    /**
     * retorna o status do aluno pelo nome e curso
     *
     * @param pAluno
     * @param pCurso
     * @return
     */
    public String retornaStatusAlunoCurso(String pAluno, String pCurso) {
        try {
            this.conectar();
            this.executarSQL("select situacao from aluno_cadastro join curso on id_curso=curso_fk_cadastro where nome='" + pAluno + "' and nome_curso='" + pCurso + "';");
            while (this.getResultSet().next()) {
                pAluno = this.getResultSet().getString(1);
            }
        } catch (SQLException ex) {
            LocalUtil.logClass = this.getClass().getName();
            LocalUtil.logType = templateAlerts.mensagemRegsitroErro();
            new LogCatUtil().writeFile(String.valueOf(templateAlerts.erroBuscarDados("situação do aluno\n") + ex.toString()));
        } finally {
            this.fecharConexao();
        }
        return pAluno;
    }

    /**
     * retorna apenas a CH pelo curso inserido
     *
     * @param pCurso
     * @return
     */
    public String retornaCargaHoraria(String pCurso) {
        try {
            this.conectar();
            this.executarSQL("select carga_horaria from curso where nome_curso='" + pCurso + "';");
            while (this.getResultSet().next()) {
                pCurso = this.getResultSet().getString(1);
            }
        } catch (SQLException ex) {
            LocalUtil.logClass = this.getClass().getName();
            LocalUtil.logType = templateAlerts.mensagemRegsitroErro();
            new LogCatUtil().writeFile(String.valueOf(templateAlerts.erroBuscarDados("carga horaria do curso\n") + ex.toString()));
        } finally {
            this.fecharConexao();
        }
        return pCurso;
    }

    /**
     * salva um novo curso no banco de dados
     *
     * @param cursoModel
     * @return
     */
    public boolean salvarCurso(CursoModel cursoModel) {
        try {
            this.conectar();
            return this.executarInsertUpdateSQL("insert into curso (nome_curso, carga_horaria, modulo_curso, valor) values ('" + cursoModel.getNomeCurso() + "','" + cursoModel.getCargaHoraria() + "','" + cursoModel.getModulos() + "','" + cursoModel.getValor() + "')");
        } catch (Exception ex) {
            LocalUtil.logClass = this.getClass().getName();
            LocalUtil.logType = templateAlerts.mensagemRegsitroErro();
            new LogCatUtil().writeFile(String.valueOf(templateAlerts.erroCadastro("curso\n") + ex.toString()));
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * altera um curso existente pelo nome dele
     *
     * @param cursoModel
     * @param pCursoPesquisa
     * @return
     */
    public boolean alterarCurso(CursoModel cursoModel, String pCursoPesquisa) {
        try {
            this.conectar();
            return this.executarInsertUpdateSQL("UPDATE curso SET nome_curso='" + cursoModel.getNomeCurso() + "',carga_horaria='" + cursoModel.getCargaHoraria() + "',modulo_curso='" + cursoModel.getModulos() + "',valor='" + cursoModel.getValor() + "' WHERE nome_curso='" + pCursoPesquisa + "';");
        } catch (Exception ex) {
            LocalUtil.logClass = this.getClass().getName();
            LocalUtil.logType = templateAlerts.mensagemRegsitroErro();
            new LogCatUtil().writeFile(String.valueOf(templateAlerts.erroAlterar("curso\n") + ex.toString()));
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     *
     * @param pCurso
     * @return
     */
    public boolean excluirCurso(String pCurso) {
        try {
            this.conectar();
            return this.executarInsertUpdateSQL("DELETE FROM curso WHERE nome_curso='" + pCurso + "';");
        } catch (Exception ex) {
            LocalUtil.logClass = this.getClass().getName();
            LocalUtil.logType = templateAlerts.mensagemRegsitroErro();
            new LogCatUtil().writeFile(String.valueOf(templateAlerts.erroExclusao("curso\n") + ex.toString()));
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     *
     * @return
     */
    public ArrayList<CursoModel> getListaCursos() {
        ArrayList<CursoModel> listaCursoModels = new ArrayList<>();
        CursoModel cursoModel = new CursoModel();
        try {
            this.conectar();
            this.executarSQL("select nome_curso, carga_horaria, modulo_curso, valor from curso order by nome_curso;");
            while (this.getResultSet().next()) {
                cursoModel = new CursoModel();
                cursoModel.setNomeCurso(this.getResultSet().getString(1));
                cursoModel.setCargaHoraria(this.getResultSet().getString(2));
                cursoModel.setModulos(this.getResultSet().getString(3));
                cursoModel.setValor(this.getResultSet().getDouble(4));
                listaCursoModels.add(cursoModel);
            }
        } catch (SQLException ex) {
            LocalUtil.logClass = this.getClass().getName();
            LocalUtil.logType = templateAlerts.mensagemRegsitroErro();
            new LogCatUtil().writeFile(String.valueOf(templateAlerts.erroBuscarDados("informações dos cursos\n") + ex.toString()));
        } finally {
            this.fecharConexao();
        }
        return listaCursoModels;
    }

    /**
     *
     * @return
     */
    public ArrayList getCursoApenas() {
        ArrayList listaCursoModels = new ArrayList<>();
        try {
            this.conectar();
            this.executarSQL("select nome_curso from curso;");
            while (this.getResultSet().next()) {
                listaCursoModels.add(this.getResultSet().getString(1).toUpperCase());
            }
        } catch (SQLException ex) {
            LocalUtil.logClass = this.getClass().getName();
            LocalUtil.logType = templateAlerts.mensagemRegsitroErro();
            new LogCatUtil().writeFile(String.valueOf(templateAlerts.erroBuscarDados("curso especifico\n") + ex.toString()));
        } finally {
            this.fecharConexao();
        }
        return listaCursoModels;
    }

}
