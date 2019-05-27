
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dam114
 */
public class GestoraInformacion {

    ArrayList<PersonaAprobados> listaPA = new ArrayList();
    ArrayList<PersonaMeritos> listaPM = new ArrayList();
    ArrayList<PersonaConjuntos> listaPC = new ArrayList();

    public ArrayList<PersonaAprobados> getPersonaA() {
        return listaPA;
    }

    public ArrayList<PersonaMeritos> getPersonaM() {
        return listaPM;
    }

    public ArrayList<PersonaConjuntos> getPersonaC() {
        return listaPC;
    }

    public void cargarDatosAprobados() {
        try (FileReader f = new FileReader("ficheroAprobados.dat")) {
            BufferedReader o = new BufferedReader(f);
            String linea = o.readLine();
            while (linea != null && linea.length() > 0) {
                PersonaAprobados p= new PersonaAprobados(linea);
                listaPA.add(p);
                linea = o.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestoraInformacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GestoraInformacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cargarDatosMeritos() {
        try (FileReader f = new FileReader("ficheroMeritos.dat")) {
            BufferedReader o = new BufferedReader(f);
            String linea = o.readLine();
            while (linea != null && linea.length() > 0) {
                PersonaMeritos p= new PersonaMeritos(linea);
                listaPM.add(p);
                linea = o.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestoraInformacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GestoraInformacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cargarDatosConjunto(){
        for(PersonaMeritos m : this.listaPM){
            int pos = getPosicionAprobado(m);
            if (pos != -1) {
                PersonaConjuntos c = new PersonaConjuntos(this.listaPA.get(pos), m);
                this.listaPC.add(c);
            }
        }
    }
    
    public int getPosicionAprobado(Persona p){
        int pos = 0;
        while(pos< this.listaPA.size() && p.NumeroOposicion != listaPA.get(pos).NumeroOposicion){
            pos++;
        }
        if(this.listaPA.size() == pos){
            return -1;
        }
        return pos;
    }
}
