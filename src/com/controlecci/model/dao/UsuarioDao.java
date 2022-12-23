package com.controlecci.model.dao;

import com.controlecci.connection.ConnectionMySQL;
import com.controlecci.model.UsuarioModel;
import com.controlecci.util.LocalUtil;
import com.controlecci.util.LogCatUtil;
import com.controlecci.util.TemplateAlerts;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Instrutores
 */
public class UsuarioDao extends ConnectionMySQL {

    TemplateAlerts templateAlerts = new TemplateAlerts();

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
     * @param pLogin
     * @return
     */
    public UsuarioModel getUsuarioDAO(String pLogin) {
        UsuarioModel usuarioModel = new UsuarioModel();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM usuario WHERE usu_login = '" + pLogin + "'" + ";");

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
     * retorna o usuário pelo nome
     *
     * @param pNome
     * @return
     */
    public UsuarioModel getUsuarioNomeDAO(String pNome) {
        UsuarioModel usuarioModel = new UsuarioModel();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM usuario WHERE usu_nome = '" + pNome + "';");

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
     * retorna lista com os nomes dos usuarios
     *
     * @return
     */
    public ArrayList getNomeApenas() {
        ArrayList listaAlunoModel = new ArrayList<>();
        try {
            this.conectar();
            this.executarSQL("select usu_nome from usuario;");
            while (this.getResultSet().next()) {
                listaAlunoModel.add(this.getResultSet().getString(1).toUpperCase());
            }
        } catch (SQLException ex) {
            LocalUtil.logClass = this.getClass().getName();
            LocalUtil.logType = templateAlerts.mensagemRegsitroErro();
            new LogCatUtil().writeFile(String.valueOf(templateAlerts.erroBuscarDados("alunos ") + ex.toString()));
        } finally {
            this.fecharConexao();
        }
        return listaAlunoModel;
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
     * @param pUsuario
     * @return
     */
    public boolean excluirUsuarioDAO(String pUsuario) {
        try {
            this.conectar();
            return this.executarInsertUpdateSQL("DELETE FROM usuario WHERE usu_login = '" + pUsuario + "';");
        } catch (Exception ex) {
            LocalUtil.logClass = this.getClass().getName();
            LocalUtil.logType = templateAlerts.mensagemRegsitroErro();
            new LogCatUtil().writeFile(String.valueOf(templateAlerts.erroExclusao("usuário\n") + ex.toString()));
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
            this.executarSQL("SELECT * FROM tbl_usuario WHERE" + " usu_login = '"
                    + pUsuarioModel.getLoginUsuario() + "' AND usu_senha = '" + pUsuarioModel.getSenhaUsuario() + "'" + ";");

            if (getResultSet().next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            LocalUtil.logClass = this.getClass().getName();
            new LogCatUtil().writeFile(String.valueOf(ex));
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
