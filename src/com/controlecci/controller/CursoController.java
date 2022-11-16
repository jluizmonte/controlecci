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
     *
     * @param pAluno
     * @return
     */
    public CursoModel retornaDadosCurso(String pAluno) {
        return cursoDao.retornaDadosCurso(pAluno);
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
     *
     * @param pAluno
     * @return
     */
    public String retornaPrimeiraData(String pAluno) {
        return cursoDao.retornaPrimeiraData(pAluno);
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
     *
     * @param pAluno
     * @return
     */
    public String retornaDataFinalCurso(String pAluno) {
        return cursoDao.retornaDataFinalCurso(pAluno);
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
        return cursoDao.excluirLivro(curso);
    }
}
