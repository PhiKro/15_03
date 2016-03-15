package org.campus02.oop;

public class Kuenstler extends Einwohner {

	private int einmalerloese;
	
	
	
	public int getEinmalerloese() {
		return einmalerloese;
	}



	public Kuenstler(int einkommen, int einmalerloese, String bundesland) {
		super(einkommen, bundesland);
		this.einmalerloese = einmalerloese;
	}



	@Override
	public double steuer() {
		double steuereinmal = einmalerloese*0.02;
		double steuerlaufend = getEinkommen()*0.25;
		return steuereinmal+steuerlaufend;
	}

}
