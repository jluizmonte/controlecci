package com.controlecci.model.dao;

import com.controlecci.connection.ConnectionMySQL;
import com.controlecci.model.AlunoModel;
import com.controlecci.model.AulaModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Instrutores
 */
public class AulaDao extends ConnectionMySQL {

    /**
     *
     * @param pAluno
     * @return
     */
    public String retornaTotalCursadoDia(String pAluno) {
        try {
            this.conectar();
            this.executarSQL("select hora_de_aula from curso join aluno_cadastro on id_curso=curso_fk_cadastro join aula on id_aluno_fk = id_cadastro  where nome= '" + pAluno + "' and id_aula = (select max(id_aula) from aula join aluno_cadastro on id_aluno_fk = id_cadastro  where nome= '" + pAluno + "');");
            while (this.getResultSet().next()) {
                pAluno = this.getResultSet().getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            this.fecharConexao();
        }
        return pAluno;
    }

    /**
     *
     * @param alunoModel
     * @param aulaModel
     * @return
     */
    public boolean registrarHoraAula(AlunoModel alunoModel, AulaModel aulaModel) {
        try {
            this.conectar();
            return this.executarInsertUpdateSQL("insert into aula (id_aluno_fk,data_aula,hora_chegada,hora_saida,hora_de_aula) values((select id_cadastro from aluno_cadastro where nome ='" + alunoModel.getNome() + "' and situacao='ATIVO'),STR_TO_DATE('" + aulaModel.getDataAula() + "','%d-%m-%Y'),'" + aulaModel.getChegada() + "','" + aulaModel.getSaida() + "',timediff(hora_saida,hora_chegada));");
        } catch (Exception e) {
            e.toString();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * retorna lista com dados da aula do aluno pelo nome dele
     *
     * @param pAluno
     * @return
     */
    public ArrayList<AulaModel> getRegistroAula(String pAluno) {
        ArrayList<AulaModel> listaAulaModels = new ArrayList<>();
        AulaModel aulaModel = new AulaModel();

        try {
            this.conectar();
            this.executarSQL("select DATE_FORMAT(data_aula, '%d/%m/%Y'), hora_chegada, hora_saida, hora_de_aula from aula join aluno_cadastro on id_aluno_fk=id_cadastro where nome ='" + pAluno + "';");
            while (this.getResultSet().next()) {
                aulaModel = new AulaModel();
                aulaModel.setDataAula(this.getResultSet().getString(1));
                aulaModel.setChegada(this.getResultSet().getString(2));
                aulaModel.setSaida(this.getResultSet().getString(3));
                aulaModel.setTotalHoraAula(this.getResultSet().getString(4));
                listaAulaModels.add(aulaModel);
            }
        } catch (SQLException e) {
            e.toString();
        } finally {
            this.fecharConexao();
        }
        return listaAulaModels;
    }

    /**
     * retorna lista da aula do aluno pelo nome e curso dele
     *
     * @param pAluno
     * @param pCurso
     * @return
     */
    public ArrayList<AulaModel> getRegistroAulaCurso(String pAluno, String pCurso) {
        ArrayList<AulaModel> listaAulaModels = new ArrayList<>();
        AulaModel aulaModel = new AulaModel();
        try {
            this.conectar();
            this.executarSQL("select DATE_FORMAT(data_aula, '%d/%m/%Y'), hora_chegada, hora_saida, hora_de_aula from aula join aluno_cadastro on id_aluno_fk=id_cadastro join curso on id_curso=curso_fk_cadastro where nome ='" + pAluno + "' and nome_curso='" + pCurso + "';");
            while (this.getResultSet().next()) {
                aulaModel = new AulaModel();
                aulaModel.setDataAula(this.getResultSet().getString(1));
                aulaModel.setChegada(this.getResultSet().getString(2));
                aulaModel.setSaida(this.getResultSet().getString(3));
                aulaModel.setTotalHoraAula(this.getResultSet().getString(4));
                listaAulaModels.add(aulaModel);
            }
        } catch (SQLException e) {
            e.toString();
        } finally {
            this.fecharConexao();
        }
        return listaAulaModels;
    }

    public ArrayList<AulaModel> getRegistroAulaId(int pId) {
        ArrayList<AulaModel> listaAulaModels = new ArrayList<>();
        AulaModel aulaModel = new AulaModel();

        try {
            this.conectar();
            this.executarSQL("select DATE_FORMAT(data_aula, '%d/%m/%Y'), hora_chegada, hora_saida, hora_de_aula from aula join aluno_cadastro on id_aluno_fk = id_cadastro where id_cadastro='" + pId + "';");
            while (this.getResultSet().next()) {
                aulaModel = new AulaModel();
                aulaModel.setDataAula(this.getResultSet().getString(1));
                aulaModel.setChegada(this.getResultSet().getString(2));
                aulaModel.setSaida(this.getResultSet().getString(3));
                aulaModel.setTotalHoraAula(this.getResultSet().getString(4));
                listaAulaModels.add(aulaModel);
            }
        } catch (SQLException e) {
            e.toString();
        } finally {
            this.fecharConexao();
        }
        return listaAulaModels;
    }

    /**
     * retorna o tempo restante do aluno, pelo nome
     *
     * @param pAluno
     * @return
     */
    public String retornaTempoRestante(String pAluno) {
        try {
            this.conectar();
            this.executarSQL("select distinct timediff((SELECT time_format( SEC_TO_TIME( min( TIME_TO_SEC( carga_horaria ) ) ),'%H:%i:%s')  from aula join aluno_cadastro on id_aluno_fk = id_cadastro join curso on curso_fk_cadastro = id_curso where nome ='" + pAluno + "'),(SELECT time_format( SEC_TO_TIME( SUM( TIME_TO_SEC( hora_de_aula ) ) ),'%H:%i:%s')  from aula join aluno_cadastro on id_aluno_fk = id_cadastro where nome ='" + pAluno + "')) from aula join aluno_cadastro on id_aluno_fk = id_cadastro join curso on curso_fk_cadastro = id_curso;");
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

}
