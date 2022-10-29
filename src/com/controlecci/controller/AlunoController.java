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

    public AlunoModel getAlunoDao(String pNome) {
        return alunoDao.getAluno(pNome);
    }

    public ArrayList<AlunoModel> getListaAlunoDao() {
        return alunoDao.getListaAlunoDao();
    }

    public ArrayList<AlunoModel> getListaAlunoCursoDao() {
        return alunoDao.getListaAlunoCursoDao();
    }

    public ArrayList retornaAlunos() {
        return alunoDao.retornaAlunos();
    }

    public String retornarCursoPeloAluno(String pAluno) {
        return alunoDao.retornarCursoPeloAluno(pAluno);
    }

    public boolean salvarAluno(String pAluno, String pCurso, String pStatus) {
        return alunoDao.salvarAluno(pAluno, pCurso, pStatus);
    }

}
