package com.controlecci.model.dao;

import com.controlecci.connection.ConnectionMySQL;
import com.controlecci.model.CursoModel;
import java.sql.SQLException;

/**
 *
 * @author Instrutores
 */
public class CursoDao extends ConnectionMySQL {

    /**
     * retorna os dados do curso do aluno
     *
     * @param pAluno
     * @return
     */
    public CursoModel retornaDadosCurso(String pAluno) {
        CursoModel cursoModel = new CursoModel();
        try {
            this.conectar();
            this.executarSQL("select nome_curso, modulo_curso, carga_horaria from curso join aluno on id_curso = id_curso_fk where nome = '" + pAluno + "';");
            while (this.getResultSet().next()) {
                cursoModel = new CursoModel();
                cursoModel.setNomeCurso(this.getResultSet().getString(1));
                cursoModel.setModulos(this.getResultSet().getString(2));
                cursoModel.setCargaHoraria(this.getResultSet().getString(3));
            }
        } catch (SQLException ex) {
            ex.toString();
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
            this.executarSQL("select min(DATE_FORMAT(data_aula, '%d/%m/%Y')) from aula join aluno on id_aluno_fk = id_aluno where nome ='" + pAluno + "';");
            while (this.getResultSet().next()) {
                pAluno = this.getResultSet().getString(1);
            }
        } catch (SQLException ex) {
            ex.toString();
        } finally {
            this.fecharConexao();
        }
        return pAluno;
    }

    public String retornaDataFinalCurso(String pAluno) {

        try {
            this.conectar();
            this.executarSQL("select date_add((select min(data_aula) from aula join aluno on id_aluno_fk = id_aluno where nome ='" + pAluno + "'), interval 90 day);");
            while (this.getResultSet().next()) {
                pAluno = this.getResultSet().getString(1);
            }
        } catch (SQLException ex) {
            ex.toString();
        } finally {
            this.fecharConexao();
        }
        return pAluno;
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
            this.executarSQL("SELECT  SEC_TO_TIME( SUM( TIME_TO_SEC( hora_de_aula ) ) ) AS timeSum  FROM aula join aluno on id_aluno_fk=id_aluno where nome='" + pAluno + "';");
            while (this.getResultSet().next()) {
                pAluno = this.getResultSet().getString(1);
            }
        } catch (SQLException ex) {
            ex.toString();
        } finally {
            this.fecharConexao();
        }
        return pAluno;
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
            return this.executarInsertUpdateSQL("insert into curso (nome_curso, carga_horaria, modulo_curso) values ('" + cursoModel.getNomeCurso() + "','" + cursoModel.getCargaHoraria() + "','" + cursoModel.getModulos() + "')");
        } catch (Exception e) {
            e.toString();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

}
