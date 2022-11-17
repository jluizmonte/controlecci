package com.controlecci.controller;

import com.controlecci.model.UsuarioModel;
import com.controlecci.model.dao.UsuarioDao;
import java.util.ArrayList;

/**
 *
 * @author Instrutores
 */
public class UsuarioController {

    UsuarioDao usuarioDao = new UsuarioDao();

    public boolean salvarUsuarioDAO(UsuarioModel pUsuarioModel) {
        return usuarioDao.salvarUsuarioDAO(pUsuarioModel);
    }

    public UsuarioModel getUsuarioDAO(String pLogin) {
        return usuarioDao.getUsuarioDAO(pLogin);
    }

    /**
     * retorna o usuario pelo nome inserido
     *
     * @param pNome
     * @return
     */
    public UsuarioModel getUsuarioNomeDAO(String pNome) {
        return usuarioDao.getUsuarioNomeDAO(pNome);
    }

    public ArrayList<UsuarioModel> getListaUsuarioDAO() {
        return usuarioDao.getListaUsuarioDAO();
    }

    public ArrayList getNomeApenas() {
        return usuarioDao.getNomeApenas();
    }

    public boolean atualizarUsuarioDAO(UsuarioModel pUsuarioModel) {
        return usuarioDao.atualizarUsuarioDAO(pUsuarioModel);
    }

    public boolean excluirUsuarioDAO(String pUsuario) {
        return usuarioDao.excluirUsuarioDAO(pUsuario);
    }

    public boolean getValidarUsuarioDAO(UsuarioModel pUsuarioModel) {
        return usuarioDao.getValidarUsuarioDAO(pUsuarioModel);
    }
}
