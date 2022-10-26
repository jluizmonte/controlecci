package com.controlecci.controller;

import com.controlecci.model.CursoModel;
import com.controlecci.model.dao.CursoDao;

/**
 *
 * @author Instrutores
 */
public class CursoController {

    CursoDao cursoDao = new CursoDao();

    public CursoModel retornaDadosCurso(String pAluno) {
        return cursoDao.retornaDadosCurso(pAluno);
    }

    public String retornaPrimeiraData(String pAluno) {
        return cursoDao.retornaPrimeiraData(pAluno);
    }

    public String retornaTotalCursado(String pAluno) {
        return cursoDao.retornaTotalCursado(pAluno);
    }

    public String retornaDataFinalCurso(String pAluno) {
        return cursoDao.retornaDataFinalCurso(pAluno);
    }
}
