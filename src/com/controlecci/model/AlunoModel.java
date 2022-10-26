package com.controlecci.model;

/**
 *
 * @author Instrutores
 */
public class AlunoModel {

    private int idAluno;
    private String nome;
    private int idCursoFk;
    public static String sessaoAluno;

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdCursoFk() {
        return idCursoFk;
    }

    public void setIdCursoFk(int idCursoFk) {
        this.idCursoFk = idCursoFk;
    }
}
