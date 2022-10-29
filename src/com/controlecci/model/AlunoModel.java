package com.controlecci.model;

/**
 *
 * @author Instrutores
 */
public class AlunoModel {

    private int idAluno;
    private String nome;
    private int idCursoFk;
    private String curso;
    private String status;

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

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
