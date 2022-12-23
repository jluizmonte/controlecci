package com.controlecci.controller;

import com.controlecci.model.CursoModel;
import com.controlecci.model.dao.CursoDao;
import java.util.ArrayList;

/**
 *
 * @author Instrutores
 */
public class CursoController {

    CursoDao cursoDao = new CursoDao();

    /**
     * retorna dados do curso pelo nome do aluno
     *
     * @param pAluno
     * @return
     */
    public CursoModel retornaDadosCurso(String pAluno) {
        return cursoDao.retornaDadosCurso(pAluno);
    }

    /**
     * retorna dados do curso pelo nome e curso do aluno
     *
     * @param pAluno
     * @param pCurso
     * @return
     */
    public CursoModel retornaDadosAluno(String pAluno, String pCurso) {
        return cursoDao.retornaDadosAlunoCurso(pAluno, pCurso);
    }

    /**
     *
     * @param pCurso
     * @return
     */
    public CursoModel getInfoCurso(String pCurso) {
        return cursoDao.getInformacoesCurso(pCurso);
    }

    /**
     * retorna a primeira data do aluno pelo nome dele
     *
     * @param pAluno
     * @return
     */
    public String retornaPrimeiraData(String pAluno) {
        return cursoDao.retornaPrimeiraData(pAluno);
    }

    /**
     * retorna a primeira data do aluno pelo nome e curso dele
     *
     * @param pAluno
     * @param pCurso
     * @return
     */
    public String retornaPrimeiraDataAlunoCurso(String pAluno, String pCurso) {
        return cursoDao.retornaPrimeiraDataAlunoCurso(pAluno, pCurso);
    }

    /**
     *
     * @param pAluno
     * @return
     */
    public String retornaTotalCursado(String pAluno) {
        return cursoDao.retornaTotalCursado(pAluno);
    }

    /**
     * retorna tempo total pelo nome e curso do aluno
     *
     * @param pAluno
     * @param pCurso
     * @return
     */
    public String retornaTotalCursadoAlunoCurso(String pAluno, String pCurso) {
        return cursoDao.retornaTotalCursadoAlunoCurso(pAluno, pCurso);
    }

    /**
     *
     * @param pAluno
     * @return
     */
    public String retornaDataFinalCurso(String pAluno) {
        return cursoDao.retornaDataFinalCurso(pAluno);
    }

    /**
     * retorna a data final do curso pelo nome do aluno e seu curso
     *
     * @param pAluno
     * @param pCurso
     * @return
     */
    public String retornaDataFinalAlunoCurso(String pAluno, String pCurso) {
        return cursoDao.retornaDataFinalAlunoCurso(pAluno, pCurso);
    }

    /**
     *
     * @param cursoModel
     * @return
     */
    public boolean salvarCurso(CursoModel cursoModel) {
        return cursoDao.salvarCurso(cursoModel);
    }

    /**
     * altera um curso pelo nome
     *
     * @param cursoModel
     * @param pCursoPesquisa
     * @return
     */
    public boolean alterarCurso(CursoModel cursoModel, String pCursoPesquisa) {
        return cursoDao.alterarCurso(cursoModel, pCursoPesquisa);
    }

    /**
     *
     * @return
     */
    public ArrayList<CursoModel> getListaCursos() {
        return cursoDao.getListaCursos();
    }

    /**
     *
     * @return
     */
    public ArrayList getCursoApenas() {
        return cursoDao.getCursoApenas();
    }

    /**
     *
     * @param pCurso
     * @return
     */
    public String retornaCargaHoraria(String pCurso) {
        return cursoDao.retornaCargaHoraria(pCurso);
    }

    /**
     *
     * @param pAluno
     * @return
     */
    public String retornaStatusAluno(String pAluno) {
        return cursoDao.retornaStatusAluno(pAluno);
    }

    /**
     * retorna o status do aluno pelo nome e curso dele
     *
     * @param pAluno
     * @param pCurso
     * @return
     */
    public String retornaStatusAlunoCurso(String pAluno, String pCurso) {
        return cursoDao.retornaStatusAlunoCurso(pAluno, pCurso);
    }

    /**
     *
     * @return
     */
    public String retornaQtdeCurso() {
        return cursoDao.retornaQtdeCurso();
    }

    /**
     *
     * @param curso
     * @return
     */
    public boolean excluirLivro(String curso) {
        return cursoDao.excluirCurso(curso);
    }
}
