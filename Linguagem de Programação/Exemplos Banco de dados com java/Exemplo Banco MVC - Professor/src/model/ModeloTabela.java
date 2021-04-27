package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeloTabela extends AbstractTableModel {

    ArrayList linhas;
    String[] colunas;
    
    public ModeloTabela(ArrayList linhas, String[] colunas) {
        this.colunas = colunas;
        this.linhas = linhas;
    }
    
    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        Object[] o = (Object[]) linhas.get(linha);
        return o[coluna];
    }
    
    @Override
    public String getColumnName(int i) {
        return colunas[i];
    }
    
}

