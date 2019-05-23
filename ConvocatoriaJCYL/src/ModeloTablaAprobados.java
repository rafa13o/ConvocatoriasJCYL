

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dam114
 */
public class ModeloTablaAprobados extends DefaultTableModel{
    
    private String[] nombreColumnas= new String[]{"NºOp", "NIF/NIE", "Apellidos y Nombre", "EJER PARTE 1", "EJER PARTE 2", "Total"};
    private Class[] tipoColumna= new Class[]{int.class, String.class, String.class, float.class, float.class, float.class};
    public ArrayList<Persona> listaPersonas= new ArrayList<Persona>();
    
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
                return this.listaPersonas.get(row).getNota1();
            case 4: 
                return this.listaPersonas.get(row).getNota2();
            case 5: 
                return this.listaPersonas.get(row).getTotal();
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

    @Override
    public String getColumnName(int column) {
        return nombreColumnas[column];
    }

    @Override
    public int getColumnCount() {
        return 6;
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
