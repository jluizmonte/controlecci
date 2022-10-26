package com.controlecci.model;

/**
 *
 * @author Instrutores
 */
public class AulaModel {

    private int idAula;
    private int idAlunoFk;
    private String dataAula;
    private String chegada;
    private String saida;
    private String totalHoraAula;

    public int getIdAula() {
        return idAula;
    }

    public void setIdAula(int idAula) {
        this.idAula = idAula;
    }

    public int getIdAlunoFk() {
        return idAlunoFk;
    }

    public void setIdAlunoFk(int idAlunoFk) {
        this.idAlunoFk = idAlunoFk;
    }

    public String getDataAula() {
        return dataAula;
    }

    public void setDataAula(String dataAula) {
        this.dataAula = dataAula;
    }

    public String getChegada() {
        return chegada;
    }

    public void setChegada(String chegada) {
        this.chegada = chegada;
    }

    public String getSaida() {
        return saida;
    }

    public void setSaida(String saida) {
        this.saida = saida;
    }

    public String getTotalHoraAula() {
        return totalHoraAula;
    }

    public void setTotalHoraAula(String totalHoraAula) {
        this.totalHoraAula = totalHoraAula;
    }

}
