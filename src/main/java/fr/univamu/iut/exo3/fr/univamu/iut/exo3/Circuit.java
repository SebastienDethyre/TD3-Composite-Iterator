package fr.univamu.iut.exo3;

import java.util.*;

public class Circuit extends Composant {
	public static int NODE_MAX = 10;
    private List<Composant> membres = new ArrayList<>();
    public Circuit() {
    }

    public void executer() {
    	for (Composant c:membres)
    	{
    		c.executer();;
    	}	
    	
    }

    public void ajouter(Composant c) {
    	this.membres.add(c);
    }
    
    public void supprimer(Composant c) {
    	this.membres.remove(c);
    }

    public Composant accederMembre(int index) {     
        return membres.get(index);
    }

}