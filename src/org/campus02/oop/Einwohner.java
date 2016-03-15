package org.campus02.oop;

public abstract class Einwohner 
{
	private int einkommen;
	public String bundesland;
	public Einwohner(int einkommen, String bundesland) {
		super();
		this.einkommen = einkommen;
		this.bundesland = bundesland;
	}
	public int getEinkommen() {
		return einkommen;
	}
	public void setEinkommen(int einkommen) {
		this.einkommen = einkommen;
	}
	
	public abstract double steuer();


}
