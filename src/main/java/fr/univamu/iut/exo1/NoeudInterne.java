package fr.univamu.iut.exo1;

import java.util.*;

/**
 * 
 */
public class NoeudInterne extends Expression {
	private int premierOperande;
	private int deuxiemeOperande;
	private char operateurBinaire;
    /**
     * Default constructor
     */
    public NoeudInterne(int premierOperande, char operateurBinaire, int deuxiemeOperande) {
    	this.premierOperande=premierOperande;
    	this.deuxiemeOperande=deuxiemeOperande;
    	this.operateurBinaire=operateurBinaire;
    }
    
    /**
     * @return
     */
    public double calculerValeur() {
    	switch(operateurBinaire) {
    	case '+':
    		return premierOperande + deuxiemeOperande;
    	case '-':
    		return premierOperande - deuxiemeOperande;
    	case '*':
    		return premierOperande * deuxiemeOperande;
    	case '/':
    		return premierOperande / deuxiemeOperande;
    	default:
    		 return 0.0d;	
        }      
    }
}