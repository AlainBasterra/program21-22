package pkg1;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author basterra.alain
 */

public class TerminoakTableModel extends AbstractTableModel{
    private final String[] hr = {"id", "euskeraz", "gazteleraz"};
    ArrayList<Terminoa> terminoak = new ArrayList<Terminoa>();
    
    public TerminoakTableModel(ArrayList<Terminoa> terminoenArraylista){
        this.terminoak = terminoenArraylista;
    }
    @Override
    public int getRowCount() {
        return terminoak.size();
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return hr[columnIndex];
    }

    @Override
    public int getColumnCount() {
        return hr.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(columnIndex == 0){
            return terminoak.get(rowIndex).getId();
        }else if (columnIndex == 1){
            return terminoak.get(rowIndex).getEuskaraz();
        }else if (columnIndex == 2){
            return terminoak.get(rowIndex).getGazteleraz();
        }
        return null;
    }
}