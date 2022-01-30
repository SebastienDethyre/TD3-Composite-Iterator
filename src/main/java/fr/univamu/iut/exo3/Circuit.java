package fr.univamu.iut.exo3;

import java.util.*;

public class Circuit extends Composant {
	public static int NODE_MAX = 10;
    private Composant[] membres;
    public Circuit() {
    }

    public void executer() {
    	for (int i=0;i<membres.length;++i)
    	{
    		System.out.println(membres[i]);
    	}	
    	
    }

    public void ajouter(Composant c) {
    	//if (membres == null) return;
		int i=0;
		while(i < NODE_MAX )
		{++i;}
		if (i>NODE_MAX)return;
		membres[i]= c;
		System.out.println(membres[i]);
    }
    
    public void supprimer(Composant c) {
    	for (int i=0;i<membres.length;++i)
    	{
    		if (membres[i]==c)
    			membres[i]=null;
    	}	
    }

    public Composant accederMembre(int index) {     
        return membres[index];
    }

}