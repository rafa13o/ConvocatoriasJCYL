/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dam114
 */
public class PersonaConjuntos extends Persona{
    
    float totalC;
    
    public PersonaConjuntos(PersonaAprobados pA, PersonaMeritos pM){
        super(pA.getNumeroOposicion(), pA.getNif(), pA.getNombre());
        if (pA== null) {
            totalC = pM.getTotalM() * 0.15f;
        }
        else {
            totalC= pA.getTotal()*0.85f + pM.getTotalM()*0.15f;
        }
    }
    
    public float getTotalC(){
        return totalC;
    }
}
