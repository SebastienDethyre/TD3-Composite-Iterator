package fr.univamu.iut.exo1;

public class Client {
    public static void main(String[] args) {
       Expression e = new NoeudInterne(new NoeudInterne(new Nombre(2), new Nombre (3), '+'),new Nombre(7), '*');
       System.out.println(e.evaluer());
    }
}
