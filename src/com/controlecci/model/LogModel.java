package com.controlecci.model;

/**
 *
 * @author joseluiz
 */
public class LogModel {

    private int idLog;
    private String usuario;
    private String tipoLog;
    private String classeLog;
    private String dataLog;
    private String descricaoLog;

    public int getIdLog() {
        return idLog;
    }

    public void setIdLog(int idLog) {
        this.idLog = idLog;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getTipoLog() {
        return tipoLog;
    }

    public void setTipoLog(String tipoLog) {
        this.tipoLog = tipoLog;
    }

    public String getClasseLog() {
        return classeLog;
    }

    public void setClasseLog(String classeLog) {
        this.classeLog = classeLog;
    }

    public String getDataLog() {
        return dataLog;
    }

    public void setDataLog(String dataLog) {
        this.dataLog = dataLog;
    }

    public String getDescricaoLog() {
        return descricaoLog;
    }

    public void setDescricaoLog(String descricaoLog) {
        this.descricaoLog = descricaoLog;
    }

}
