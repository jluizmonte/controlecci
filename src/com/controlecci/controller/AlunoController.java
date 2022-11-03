package com.controlecci.controller;

import com.controlecci.model.AlunoModel;
import com.controlecci.model.dao.AlunoDao;
import java.util.ArrayList;

/**
 *
 * @author Instrutores
 */
public class AlunoController {

    AlunoDao alunoDao = new AlunoDao();

    /**
     * retorna lista com dados da aula do aluno pelo nome dele
     *
     * @param pAluno
     * @return
     */
    public AlunoModel getAlunoDao(String pAluno) {
        return alunoDao.getAluno(pAluno);
    }

    /**
     *
     * @return
     */
    public ArrayList<AlunoModel> getListaAlunoDao() {
        return alunoDao.getListaAlunoDao();
    }

    /**
     *
     * @return
     */
    public ArrayList<AlunoModel> getListaAlunoCursoDao() {
        return alunoDao.getListaAlunoCursoDao();
    }

    /**
     *
     * @return
     */
    public ArrayList<AlunoModel> getListaAlunoCadastro() {
        return alunoDao.getListaAlunoCadastro();
    }

    /**
     *
     * @return
     */
    public ArrayList retornaAlunos() {
        return alunoDao.retornaAlunos();
    }

    /**
     *
     * @return
     */
    public ArrayList retornaAlunoCadastro() {
        return alunoDao.retornaAlunoCadastro();
    }

    /**
     *
     * @param pAluno
     * @return
     */
    public String retornarCursoPeloAluno(String pAluno) {
        return alunoDao.retornarCursoPeloAluno(pAluno);
    }

    /**
     *
     * @param pAluno
     * @param pCurso
     * @param pStatus
     * @return
     */
    public boolean salvarAluno(String pAluno, String pCurso, String pStatus) {
        return alunoDao.salvarAluno(pAluno, pCurso, pStatus);
    }

    /**
     * insere aluno com dados iguais a ficha
     *
     * @param alunoModel
     * @return
     */
    public boolean inserirAluno(AlunoModel alunoModel) {
        return alunoDao.inserirAluno(alunoModel);
    }

    /**
     * atualiza os dados de um aluno selecionado
     *
     * @param alunoModel
     * @return
     */
    public boolean atualizarAluno(AlunoModel alunoModel) {
        return alunoDao.atualizarAluno(alunoModel);
    }
}
