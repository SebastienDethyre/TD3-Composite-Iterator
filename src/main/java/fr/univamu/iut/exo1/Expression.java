package fr.univamu.iut.exo1;
import java.util.*;



/**
 * 
 */
public abstract class Expression {
	public static int NODE_MAX_ARITY = 2;
	protected Object data;
	private Expression[] mother;
	private Expression[] daughter;

	/* Overridden methods */
	@Override
	public String toString() {
		return data.toString();
	}
	
	public Expression getMother() {	
		return mother[0];
	}
	
	public void setMother(Expression mother) {

		this.mother[0]= mother;		

	}
		
	public Expression getDaughter() {		
		return daughter[0];
	}

	public void setDaughter(Expression daughter) {
		this.daughter[0]= daughter;		

	}
	
	public Object getData() {
		return this.data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	
	public boolean hasDaughter() {
		if(daughter == null)return false;
		return true;
	}

	public boolean hasMother() {
		if(mother == null)return false;
		return true;
	}

	
	public Expression() {
		super(); /* appel au constructeur parent */
		data = new Object();
		this.daughter = new Expression [NODE_MAX_ARITY];
	}

	public Expression(Object data) {
		this();
		this.data = data;
		//daughters = new NodeMultiple [NODE_MAX_ARITY];
		
	}

    public abstract double calculerValeur();

}