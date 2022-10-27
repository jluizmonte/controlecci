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

    public boolean salvarCurso(CursoModel cursoModel) {
        return cursoDao.salvarCurso(cursoModel);
    }

    public ArrayList<CursoModel> getListaCursos() {
        return cursoDao.getListaCursos();
    }
}
