/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dam114
 */
public class PersonaMeritos extends Persona{
    public float experiencia;
    public float cursos;
    public float titulos;
    public float totalMeritos;
    public float totalM;
    
    public PersonaMeritos(String s){
        super(s);
        String[] a= s.split(" ");
        int i= 2;
        while(!isNumeric(a[i])){
            i++;
        }
        experiencia= Float.parseFloat(a[i].replace(",", "."));
        titulos= Float.parseFloat(a[i+1].replace(",", "."));
        cursos= Float.parseFloat(a[i+2].replace(",", "."));
        totalM= Float.parseFloat(a[i+3].replace(",", "."));
    }
    
    public PersonaMeritos(PersonaAprobados pA, float e, float c, float ti){
        super(pA.getNumeroOposicion(), pA.getNif(), pA.nombre);
        this.experiencia= e;
        this.cursos= c;
        this.titulos= ti;
        totalM= ((pA.getNota1() + pA.nota2)*0.85f);
        if(totalMeritos>0.0f){
            totalM = totalM +(totalMeritos*0.15f);
        }
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
        
    public float getTotalM() {
        return totalM;
    }
}
