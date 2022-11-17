package com.controlecci.model.dao;

import com.controlecci.connection.ConnectionMySQL;
import com.controlecci.model.LogModel;

/**
 *
 * @author joseluiz
 */
public class LogDao extends ConnectionMySQL {

    public boolean salvarLog(LogModel logModel) {
        try {
            this.conectar();
            return this.executarInsertUpdateSQL("INSERT INTO log (usuario, tipo_log, classe_log, data_log, descricao_log) VALUES('" + logModel.getUsuario() + "', '" + logModel.getTipoLog() + "'" + logModel.getClasseLog() + "', '" + logModel.getDataLog() + "','" + logModel.getDescricaoLog() + "');");
        } catch (Exception e) {
            e.toString();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

}
