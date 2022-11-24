package com.controlecci.controller;

import com.controlecci.model.AlunoModel;
import com.controlecci.model.AulaModel;
import com.controlecci.model.dao.AulaDao;
import java.util.ArrayList;

/**
 *
 * @author joseluiz
 */
public class AulaController {

    AulaDao aulaDao = new AulaDao();

    public String retornaTotalCursadoDia(String pAluno) {
        return aulaDao.retornaTotalCursadoDia(pAluno);
    }

    public boolean registrarHoraAula(AlunoModel alunoModel, AulaModel aulaModel) {
        return aulaDao.registrarHoraAula(alunoModel, aulaModel);
    }

    public ArrayList getRegistroAula(String pAluno) {
        return aulaDao.getRegistroAula(pAluno);
    }

    /**
     * retorna o registro pelo nome e curso do aluno
     *
     * @param pAluno
     * @param pCurso
     * @return
     */
    public ArrayList getRegistroAulaCurso(String pAluno, String pCurso) {
        return aulaDao.getRegistroAulaCurso(pAluno, pCurso);
    }

    public ArrayList getRegistroAulaId(int pId) {
        return aulaDao.getRegistroAulaId(pId);
    }

    /**
     * retorna tempo restante pelo nome do aluno
     *
     * @param pAluno
     * @return
     */
    public String retornaTempoRestante(String pAluno) {
        return aulaDao.retornaTempoRestante(pAluno);
    }

    /**
     * retorna tempo restante pelo nome e curso do aluno
     *
     * @param pAluno
     * @param pCurso
     * @return
     */
    public String retornaTempoRestanteAlunoCurso(String pAluno, String pCurso) {
        return aulaDao.retornaTempoRestanteAlunoCurso(pAluno, pCurso);
    }
}
