package fr.univamu.iut.exo2;

public class Velo {
	
	private int numero;
	private double prix;
	private String description;	// attribut optionnel
	private Batterie batterie; // attribut optionnel
	
	/*
	public Velo(int nr, double p){
		numero = nr;
		prix = p;
	}
	
	public Velo(int numero, double prix, String description){
		this(numero,prix);
		this.description = description;
	}
	
	public Velo(int numero, double prix, String description, Batterie batterie){
		this(numero, prix, description);
		this.batterie = batterie;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setBatterie(Batterie batterie) {
		this.batterie = batterie;
	}
	*/
	
	public Velo(Builder builder) {
		numero = builder.numero;
		prix = builder.prix;
		description = builder.description;
		batterie = builder.batterie;
	}
	
	public static class Builder{
		private int numero;
		private double prix;
		private String description;	// attribut optionnel
		private Batterie batterie;
		
		public Builder(int numero, double prix) {
			this.numero = numero;
			this.prix = prix;
		}
		public Builder addDescription(String description) {
			this.description =description; return this; 
		}
		public Builder addBatterie(Batterie batterie) {
			this.batterie = batterie; return this; 
		}
		public Velo build() {
			return new Velo(this);
		}
	}

}

