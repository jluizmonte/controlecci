package com.controlecci.main;

import com.controlecci.view.CadastroCurso;
import com.controlecci.view.FichaAluno;
import com.controlecci.view.Login;
import com.controlecci.view.RegistroAluno;
import com.controlecci.view.SCCI.SCCI;
import com.controlecci.view.TelaPrincipal;
import com.controlecci.view.VerAlunosFicha;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
//            new Login().setVisible(true);
////            FichaAluno aluno = new FichaAluno();
////
////            try {
////                aluno.selecionarTipoCliente();
////            } catch (ParseException ex) {
////                Logger.getLogger(ControleCCI.class.getName()).log(Level.SEVERE, null, ex);
////            }
//            //  aluno.setVisible(true);

            //      new VerAlunosFicha().setVisible(true);
//new RegistroAluno().setVisible(true);
//            new TelaPrincipal().setVisible(true);
            //         new CadastroCurso().setVisible(true);
            new SCCI().setVisible(true);
            //          new VerAlunosFicha().setVisible(true);
        });
    }
}
