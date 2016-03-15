package org.campus02.oop;

public class Landwirt extends Einwohner {

	private int grundfl�che;
	
	public int getGrundfl�che() {
		return grundfl�che;
	}

	public Landwirt(int grundfl�che,String bundesland) {
		super(grundfl�che*100, bundesland);
		this.grundfl�che = grundfl�che;
	}

	@Override
	public double steuer() {
			return getEinkommen()*.225;
	}

}
