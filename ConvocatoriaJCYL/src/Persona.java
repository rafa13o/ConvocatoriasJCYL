/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dam114
 */
public class Persona {
    public int NumeroOposicion;
    public String nif;
    public String nombre;
    
    public Persona(String s){
        String[] a = s.split(" ");
        this.NumeroOposicion = Integer.parseInt(a[0]);
        this.nif = a[1];
        int i = 2;
        this.nombre = "";
        while (!isNumeric(a[i])) {
            this.nombre += a[i] + " ";
            i++;
        }
        this.nombre = this.nombre.trim();
    }
    
     public static boolean isNumeric(String str) {
        str = str.replace(",", ".");
        return str.matches("-?\\d+(\\.\\d+)?");
        
    }
    
    public Persona(int nOp, String nif, String n){
        this.NumeroOposicion= nOp;
        this.nif= nif;
        this.nombre= n;
    }

    public int getNumeroOposicion() {
        return NumeroOposicion;
    }

    public String getNif() {
        return nif;
    }

    public String getNombre() {
        return nombre;
    }
    
}
