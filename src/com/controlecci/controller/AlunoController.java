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
     * retorna uma lista com o nome e curso do aluno
     *
     * @param pAluno
     * @return
     */
    public ArrayList<AlunoModel> getListaPorAluno(String pAluno) {
        return alunoDao.getListaPorAluno(pAluno);
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
     * @return
     */
    public String retornaQtdeAluno() {
        return alunoDao.retornaQtdeAluno();
    }

    /**
     * retorna status do certificado pelo nome do aluno
     *
     * @param pAluno
     * @return
     */
    public String retornaStatusCertificado(String pAluno) {
        return alunoDao.retornaStatusCertificado(pAluno);
    }

    /**
     * retorna status do certificado pelo nome e curso do aluno
     *
     * @param pAluno
     * @param pCurso
     * @return
     */
    public String retornaStatusCertificadoAlunoCurso(String pAluno, String pCurso) {
        return alunoDao.retornaStatusCertificadoAlunoCurso(pAluno, pCurso);
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
     * retorna a quantidade de cadastros que o aluno tem
     *
     * @param pAluno
     * @return
     */
    public int retornaQtdePorAluno(String pAluno) {
        return alunoDao.retornaQtdePorAluno(pAluno);
    }

    /**
     * atualiza os dados de um aluno selecionado
     *
     * @param alunoModel
     * @param pAlunoPesquisa
     * @return
     */
    public boolean atualizarAluno(AlunoModel alunoModel, String pAlunoPesquisa) {
        return alunoDao.atualizarAluno(alunoModel, pAlunoPesquisa);
    }
}
