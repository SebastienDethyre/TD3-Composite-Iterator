package fr.univamu.iut.exo2;

public class Client {
    public static void main(String[] args) {
    	Batterie b = new Batterie();
        Velo v = new Velo.Builder(5343, 450)
        		.addDescription("tous terrains")
        		.addBatterie(b)
        		.build();
    }
}
