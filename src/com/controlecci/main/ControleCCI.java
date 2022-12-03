package com.controlecci.main;

import com.controlecci.model.SessaoUsuarioModel;
import com.controlecci.util.FolderCreatorUtil;
import com.controlecci.util.LogCatUtil;
import com.controlecci.view.SCCI.LoginView;
import com.controlecci.view.SCCI.SCCI;

/**
 *
 * @author Instrutores
 */
public class ControleCCI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            new FolderCreatorUtil().createFolder();
            new LogCatUtil().createFile();
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            //           new LoginView(null, true).setVisible(true);
            SessaoUsuarioModel.codigoUsuario = 10;
            SessaoUsuarioModel.loginUsuario = "luiz";
            SessaoUsuarioModel.nivelAcesso = "DESENVOLVEDOR";
            SessaoUsuarioModel.nomeUsuario = "José Luiz";
            new SCCI().setVisible(true);
        });
    }
}
