package com.controlecci.model.dao;

import com.controlecci.connection.ConnectionMySQL;
import com.controlecci.model.UsuarioModel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Instrutores
 */
public class UsuarioDao extends ConnectionMySQL {

    /**
     * salva Usuario
     *
     * @param pUsuarioModel
     * @return
     */
    public boolean salvarUsuarioDAO(UsuarioModel pUsuarioModel) {
        try {
            this.conectar();
            return this.executarInsertUpdateSQL("INSERT INTO usuario (" + "usu_nome," + "usu_login," + "usu_senha ," + "usu_tipo"
                    + ") VALUES (" + "'" + pUsuarioModel.getNomeUsuario() + "'," + "'" + pUsuarioModel.getLoginUsuario() + "',"
                    + "'" + pUsuarioModel.getSenhaUsuario() + "'," + "'" + pUsuarioModel.getNivelAcessoUsuario() + "'" + ");");
        } catch (Exception e) {
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * recupera Usuario pelo login
     *
     * @param pLogin return ModelUsuario
     * @return
     */
    public UsuarioModel getUsuarioDAO(String pLogin) {
        UsuarioModel usuarioModel = new UsuarioModel();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM" + " usuario" + " WHERE" + " usu_login = '" + pLogin + "'" + ";");

            while (this.getResultSet().next()) {
                usuarioModel.setIdUsuario(this.getResultSet().getInt(1));
                usuarioModel.setNomeUsuario(this.getResultSet().getString(2));
                usuarioModel.setLoginUsuario(this.getResultSet().getString(3));
                usuarioModel.setSenhaUsuario(this.getResultSet().getString(4));
                usuarioModel.setNivelAcessoUsuario(this.getResultSet().getString(5));
            }
        } catch (SQLException e) {
        } finally {
            this.fecharConexao();
        }
        return usuarioModel;
    }

    /**
     * recupera uma lista de Usuario return ArrayList
     *
     * @return
     */
    public ArrayList<UsuarioModel> getListaUsuarioDAO() {
        ArrayList<UsuarioModel> listaUsuarioModel = new ArrayList<>();
        UsuarioModel usuarioModel = new UsuarioModel();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM usuario;");

            while (this.getResultSet().next()) {
                usuarioModel = new UsuarioModel();
                usuarioModel.setIdUsuario(this.getResultSet().getInt(1));
                usuarioModel.setNomeUsuario(this.getResultSet().getString(2));
                usuarioModel.setLoginUsuario(this.getResultSet().getString(3));
                usuarioModel.setSenhaUsuario(this.getResultSet().getString(4));
                usuarioModel.setNivelAcessoUsuario(this.getResultSet().getString(5));
                listaUsuarioModel.add(usuarioModel);
            }
        } catch (SQLException e) {
        } finally {
            this.fecharConexao();
        }
        return listaUsuarioModel;
    }

    /**
     * atualiza Usuario
     *
     * @param pUsuarioModel return boolean
     * @return
     */
    public boolean atualizarUsuarioDAO(UsuarioModel pUsuarioModel) {
        try {
            this.conectar();
            return this.executarInsertUpdateSQL("UPDATE usuario SET " + "pk_id_usuario = '"
                    + pUsuarioModel.getIdUsuario() + "'," + "usu_nome = '" + pUsuarioModel.getNomeUsuario() + "',"
                    + "usu_login = '" + pUsuarioModel.getLoginUsuario() + "'," + "usu_senha = '"
                    + pUsuarioModel.getSenhaUsuario() + "," + "usu_tipo = '" + pUsuarioModel.getNivelAcessoUsuario() + "'" + " WHERE "
                    + "pk_id_usuario = '" + pUsuarioModel.getIdUsuario() + "'" + ";");
        } catch (Exception e) {
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * exclui Usuario
     *
     * @param pALuno
     * @return
     */
    public boolean excluirUsuarioDAO(String pALuno) {
        try {
            this.conectar();
            return this.executarInsertUpdateSQL("DELETE FROM usuario " + " WHERE " + "usu_login = '" + pALuno + "'" + ";");
        } catch (Exception e) {
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * Validar login e senha do usuário
     *
     * @param pUsuarioModel
     * @return
     */
    public boolean getValidarUsuarioDAO(UsuarioModel pUsuarioModel) {
        try {
            this.conectar();
            this.executarSQL("SELECT *" + " FROM" + " usuario" + " WHERE" + " usu_login = '"
                    + pUsuarioModel.getLoginUsuario() + "' AND usu_senha = '" + pUsuarioModel.getSenhaUsuario() + "'" + ";");

            if (getResultSet().next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
