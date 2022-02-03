package fr.univamu.iut.exo3;

public class Client {
	public static void main(String[] args) {
    	Circuit c = new Circuit();
    	Diode d = new Diode();
    	Condensateur co = new Condensateur();
    	Resistance r = new Resistance();
    	c.ajouter(d);
    	c.ajouter(co);
    	c.ajouter(r);
    	c.executer();
    }
}
