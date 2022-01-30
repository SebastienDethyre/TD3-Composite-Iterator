package fr.univamu.iut.exo1;

import java.util.*;

/**
 * 
 */
public class Nombre extends Expression {
    private int valeur;

    public Nombre(int nombre) {
    	this.valeur = nombre;
    }
    
    public double evaluer() {
        // TODO implement here
        return valeur;
    }

}