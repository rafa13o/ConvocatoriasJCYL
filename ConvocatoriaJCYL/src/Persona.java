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
    public float totalM;
    public float total;
    public float totalMeritos;
    public float experiencia;
    public float cursos;
    public float titulos;
    
    public Persona(int nOp, String nif, String n, float n1, float n2, float t){
        this.NumeroOposicion= nOp;
        this.nif= nif;
        this.nombre= n;
        this.nota1= n1;
        this.nota2= n2;
        this.totalM= t;
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

    public float getTotal(){
        total = this.nota1+this.nota2;
        return total;
    }
    
    public float getTotalM() {
        totalM= ((this.nota1 + this.nota2)*0.85f);
        if(totalMeritos>0.0f){
            totalM = totalM +(totalMeritos*0.15f);
        }
        return totalM;
    }

    public float getExperiencia() {
        return experiencia;
    }

    public float getCursos() {
        return cursos;
    }

    public float getTitulos() {
        return titulos;
    }
}
