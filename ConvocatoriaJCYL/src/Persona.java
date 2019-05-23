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
    public float nota1;
    public float nota2;
    public float total;
//    public boolean meritos;
    public float totalMeritos;
    
    public Persona(int nOp, String nif, String n, float n1, float n2, float t){
        this.NumeroOposicion= nOp;
        this.nif= nif;
        this.nombre= n;
        this.nota1= n1;
        this.nota2= n2;
        this.total= t;
    }

    Persona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public float getNota1() {
        return nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public float getTotal() {
        total= ((this.nota1 + this.nota2)*0.85f);
        if(totalMeritos>0.0f){
            total = total +(totalMeritos*0.15f);
        }
        return total;
    }
    
//    public boolean getMeritos(){
//        if(totalMeritos!= 0){
//            return true;
//        }
//        return false;
//    }
//    
//    public float getTotalMeritos(){
//       if(this.meritos== true){
//           float nota= 
//       } 
//    }
    
}
