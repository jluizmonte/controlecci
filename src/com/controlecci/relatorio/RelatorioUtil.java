package com.controlecci.relatorio;

import java.awt.Frame;
import java.awt.HeadlessException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.controlecci.connection.ConnectionMySQL;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;

/**
 * Classe responsável para gerar relatórios simples
 *
 * @author joseluiz
 *
 */
public class RelatorioUtil extends ConnectionMySQL {
    private String tipoLevantamento;
    /**
     * criação de um JFrame
     */
    public JFrame frame = new JFrame("Gerador de relatório");

    /**
     * Metodo especifico gerador de relatório
     *
     * @throws SQLException
     */
    public void gerarLevantamento() throws SQLException {
        Connection conn = this.conectar();

        try {
            InputStream dir = getClass()
                    .getResourceAsStream("/com/controlecci/relatorio/" + this.getTipoLevantamento() + ".jrxml");
            JasperReport jr = JasperCompileManager.compileReport(dir);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, conn);
            JRViewer jrv = new JRViewer(jp);
            frame.getContentPane().add(jrv);
            frame.setExtendedState(Frame.MAXIMIZED_BOTH);
            frame.pack();
            JOptionPane.showMessageDialog(null, "Relatório selecionado " + getTipoLevantamento()
                    + "\nfoi gerado com sucesso!\n" + "Clique em OK para visualizá-lo", "Sucesso!",
                    JOptionPane.WARNING_MESSAGE);
            frame.setVisible(true);

            // JRExporter<?, ?, ?, ?> exporter = new JRPdfExporter();
//			exporter.setParameter(JRExporterParameter.JASPER_PRINT, jp);
//			exporter.setParameter(JRExporterParameter.OUTPUT_STREAM,
//					new FileOutputStream(diretorio + this.getTipoLevantamento() + ".pdf"));
//			exporter.exportReport();
        } catch (HeadlessException | JRException ex) {
            System.out.println(ex);
//            LocalUtil.logClass = this.getClass().getName();
//            new LogCatUtil().writeFile(String.valueOf(ex));
        }
    }

    /**
     *
     * @return return
     */
    public String getTipoLevantamento() {
        return tipoLevantamento;
    }

    /**
     *
     * @param tipoLevantamento tipoLevantamento
     */
    public void setTipoLevantamento(String tipoLevantamento) {
        this.tipoLevantamento = tipoLevantamento;
    }

}
