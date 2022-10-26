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

    public String retornaTempoRestante(String pAluno) {
        return aulaDao.retornaTempoRestante(pAluno);
    }
}
