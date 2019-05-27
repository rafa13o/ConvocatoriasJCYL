
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dam114
 */
public class ModeloTablaConjunto extends AbstractTableModel{
    private String [] nColumnas = {"N OPOSICIÓN", "NIF/NIE", "APELLIDOS Y NOMBRE", "TOTAL"};
    private Class[] tipoColumna={Integer.class, String.class, String.class, Float.class};
    public ArrayList<PersonaConjuntos> listaPersonas= new ArrayList();
    
    public ModeloTablaConjunto(ArrayList<PersonaConjuntos> p){
        this.listaPersonas= p;
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        switch(column){
            case 0: 
                return this.listaPersonas.get(row).getNumeroOposicion();
            case 1: 
                return this.listaPersonas.get(row).getNif();
            case 2: 
                return this.listaPersonas.get(row).getNombre();
            case 3: 
                return this.listaPersonas.get(row).getTotalC();
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

    @Override
    public String getColumnName(int column) {
        return nColumnas[column];
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public int getRowCount() {
        return listaPersonas.size();
    }
    
    @Override
    public Class getColumnClass(int column){
        return tipoColumna[column];
    }
}
