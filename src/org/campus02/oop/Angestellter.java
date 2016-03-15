package org.campus02.oop;

public class Angestellter extends Einwohner {

	int kinder;
	
	public Angestellter(int einkommen, int kinder, String bundesland) {
		super(einkommen, bundesland);
		this.kinder = kinder;
	}



	@Override
	public double steuer() {
		double steuersatz;
		switch (kinder) {
		case 0:
			steuersatz=.50;
			break;
		case 1:
			steuersatz=.40;
			break;
		case 2:
			steuersatz=.30;
			break;	
		case 3:
			steuersatz=.15;
			break;

		default:
			steuersatz=.05;
			break;
		}
		
		return getEinkommen()*steuersatz;
	}

}
