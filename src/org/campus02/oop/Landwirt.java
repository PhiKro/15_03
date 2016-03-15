package org.campus02.oop;

public class Landwirt extends Einwohner {

	private int grundfläche;
	
	public int getGrundfläche() {
		return grundfläche;
	}

	public Landwirt(int grundfläche,String bundesland) {
		super(grundfläche*100, bundesland);
		this.grundfläche = grundfläche;
	}

	@Override
	public double steuer() {
			return getEinkommen()*.225;
	}

}
