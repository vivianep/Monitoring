package br.com.contexttoolkit.GUI;

import javax.swing.table.AbstractTableModel;

public class ModifiedModel extends AbstractTableModel {
	private String[] columnNames={"", "Via 1","Via 2","Via 3","Via 4 ","Via 5 "}; 
	private Object[][] data={{"Quantidade de Carros",0, 0, 0, 0, 0 }};
			
	
	
	public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return data.length;
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        return data[row][col];
    }
	
	public void setAt(int rowIndex,int columnIndex, Object object){
		data[rowIndex][columnIndex]=object;
	}

}
