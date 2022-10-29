package com.controlecci.model.dao;

import com.controlecci.connection.ConnectionMySQL;
import com.controlecci.model.AlunoModel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Instrutores
 */
public class AlunoDao extends ConnectionMySQL {

    /**
     *
     * @param pNome
     * @return
     */
    public AlunoModel getAluno(String pNome) {
        AlunoModel alunoModel = new AlunoModel();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM" + " aluno" + " WHERE" + " nome = '" + pNome + "'" + ";");

            while (this.getResultSet().next()) {
                alunoModel.setIdAluno(this.getResultSet().getInt(1));
                alunoModel.setNome(this.getResultSet().getString(2));
                alunoModel.setIdCursoFk(this.getResultSet().getInt(3));

            }
        } catch (SQLException e) {
        } finally {
            this.fecharConexao();
        }
        return alunoModel;
    }

    /**
     *
     * @return
     */
    public ArrayList retornaAlunos() {
        ArrayList lista = new ArrayList();

        try {
            this.conectar();
            this.executarSQL("SELECT nome FROM aluno where status_aluno='ATIVO';");
            while (this.getResultSet().next()) {
                lista.add(this.getResultSet().getString(1));
            }
        } catch (SQLException e) {
        } finally {
            this.fecharConexao();
        }
        return lista;
    }

    /**
     *
     * @return
     */
    public ArrayList<AlunoModel> getListaAlunoDao() {
        ArrayList<AlunoModel> listaAlunoModel = new ArrayList<>();
        AlunoModel alunoModel = new AlunoModel();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM aluno order by nome asc;");
            while (this.getResultSet().next()) {
                alunoModel = new AlunoModel();
                alunoModel.setIdAluno(this.getResultSet().getInt(1));
                alunoModel.setNome(this.getResultSet().getString(2));
                listaAlunoModel.add(alunoModel);
            }
        } catch (SQLException e) {
            e.toString();
        } finally {
            this.fecharConexao();
        }
        return listaAlunoModel;
    }

    public ArrayList<AlunoModel> getListaAlunoCursoDao() {
        ArrayList<AlunoModel> listaModel = new ArrayList<>();
        AlunoModel alunoModel = new AlunoModel();
        try {
            this.conectar();
            this.executarSQL("SELECT nome,nome_curso,status_aluno from aluno join curso on id_curso_fk=id_curso order by nome asc;");
            while (this.getResultSet().next()) {
                alunoModel = new AlunoModel();
                alunoModel.setNome(this.getResultSet().getString(1));
                alunoModel.setCurso(this.getResultSet().getString(2));
                alunoModel.setStatus(this.getResultSet().getString(3));
                listaModel.add(alunoModel);
            }
        } catch (NumberFormatException | SQLException e) {
            e.toString();
        } finally {
            this.fecharConexao();
        }
        return listaModel;
    }

    /**
     *
     * @param pAluno
     * @return
     */
    public String retornarCursoPeloAluno(String pAluno) {
        try {
            this.conectar();
            this.executarSQL("select nome_curso from curso join aluno on id_curso_fk = id_curso where nome= '" + pAluno + "'" + ";");

            while (this.getResultSet().next()) {
                pAluno = this.getResultSet().getString(1);
            }
        } catch (SQLException e) {
        } finally {
            this.fecharConexao();
        }
        return pAluno;
    }

    public boolean salvarAluno(String pAluno, String pCurso, String pStatus) {
        try {
            this.conectar();
            return this.executarInsertUpdateSQL("insert into aluno(nome, id_curso_fk,status_aluno) values ('" + pAluno + "',(select id_curso from curso where nome_curso='" + pCurso + "'),'" + pStatus + "');");
        } catch (Exception e) {
            e.toString();
            return false;
        } finally {
            this.fecharConexao();
        }

    }
}
