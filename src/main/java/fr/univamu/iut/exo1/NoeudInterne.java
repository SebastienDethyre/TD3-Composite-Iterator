package fr.univamu.iut.exo1;

import java.util.*;

/**
 * 
 */
public class NoeudInterne extends Expression {
	private Expression filsG;
	private Expression filsD;
	private char operateurBinaire;
    /**
     * Default constructor
     */
    public NoeudInterne(Expression filsG, Expression filsD, char operateurBinaire) {
    	this.filsG=filsG;
    	this.filsD=filsD;
    	this.operateurBinaire=operateurBinaire;
    }
    
    /**
     * @return
     */
    public double evaluer() {
    	switch(operateurBinaire) {
    	case '+':
    		return filsG.evaluer() + filsD.evaluer();
    	case '-':
    		return filsG.evaluer() - filsD.evaluer();
    	case '*':
    		return filsG.evaluer() * filsD.evaluer();
    	default:
    		return filsG.evaluer() / filsD.evaluer();	
        }      
    }
}