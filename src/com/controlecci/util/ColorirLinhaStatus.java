package com.controlecci.util;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author joseluiz
 */
public class ColorirLinhaStatus extends DefaultTableCellRenderer {

    private final int colunaLivro;

    /**
     *
     * @param colunaTabela colunaTabela
     */
    public ColorirLinhaStatus(int colunaTabela) {
        this.colunaLivro = colunaTabela;
    }

    @Override
    /**
     * renderiza a tabela quando for chamada nos parametros configurados pelo
     * metodo
     */
    public Component getTableCellRendererComponent(JTable table, Object value, boolean Selected, boolean hasFocus,
            int row, int col) {
        Font font = new Font("Dialog", 1, 18);
        switch (table.getValueAt(row, colunaLivro).toString()) {

            case "ATIVO":
                setForeground(Color.white);
                setBackground(new java.awt.Color(0, 102, 51));
                setFont(font);
                setHorizontalAlignment(CENTER);
                break;

            case "SUSPENSO":
                setForeground(Color.white);
                setBackground(Color.red);
                setFont(font);
                setHorizontalAlignment(CENTER);
                break;

            default:
                setForeground(Color.white);
                setBackground(new java.awt.Color(0, 47, 79));
                setHorizontalAlignment(CENTER);
                break;
        }
        super.getTableCellRendererComponent(table, value, Selected, hasFocus, row, col);
        return this;
    }
}
