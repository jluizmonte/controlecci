package com.controlecci.main;

import com.controlecci.model.SessaoUsuarioModel;
import com.controlecci.util.FolderCreatorUtil;
import com.controlecci.util.LogCatUtil;
import com.controlecci.view.SCCI.FrmAluno;
import com.controlecci.view.SCCI.Login;
import com.controlecci.view.SCCI.obsoletos.PrincipalSCCI;
import com.controlecci.view.SCCI.obsoletos.LoginView;
import com.controlecci.view.SCCI.SCCI;
import java.awt.SplashScreen;

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            SessaoUsuarioModel.codigoUsuario = 1;
            SessaoUsuarioModel.loginUsuario = "luiz";
            SessaoUsuarioModel.nivelAcesso = "DESENVOLVEDOR";
            SessaoUsuarioModel.nomeUsuario = "José Luiz";
            new SCCI().setVisible(true);
//            new FrmAluno().setVisible(true);
//            new PrincipalSCCI().setVisible(true);
//            new SplashScreen().setVisible(true);
//            new Login(null, true).setVisible(true);
        });
    }
}
