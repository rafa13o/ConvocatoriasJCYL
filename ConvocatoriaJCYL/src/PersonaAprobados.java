/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dam114
 */
public class PersonaAprobados extends Persona{
    public float nota1;
    public float nota2;
    public float total;
    
    public PersonaAprobados(String s){
        super(s);
        String[] a= s.split(" ");
        int i= 2;
        while(!isNumeric(a[i])){
            i++;
        }
        nota1= Float.parseFloat(a[i].replace(",", "."));
        nota2= Float.parseFloat(a[i+1].replace(",", "."));
        total= Float.parseFloat(a[i+2].replace(",", "."));
    }
    
    public PersonaAprobados(int no, String n, String nm, float n1, float n2, float t){
        super(no, n, nm);
        this.nota1= n1;
        this.nota2= n2;
        this.total= t;
    }
    
    public float getNota1() {
        return nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public float getTotal(){
        return total;
    }
    
}
