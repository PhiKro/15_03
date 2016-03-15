package org.campus02.oop;

public class Demo 
{
	public static void main (String args[])
	{
		
		Bundesstaat Oesterreich = new Bundesstaat();
		
		Kuenstler David = new Kuenstler(1000, 200, "STMK");
		Angestellter Steve = new Angestellter(1500, 2, "STMK");
		Landwirt Dominik = new Landwirt(50, "Wien");
		Angestellter Philipp = new Angestellter(1500, 0, "KNT");
		Angestellter Didi = new Angestellter(1500, 1, "SLZ");
		Oesterreich.add(Steve);
		Oesterreich.add(David);
		Oesterreich.add(Dominik);
		Oesterreich.add(Philipp);
		Oesterreich.add(Didi);
		
		System.out.println(Philipp.steuer());
		System.out.println(Didi.steuer());
		System.out.println(Steve.steuer());
		
		
		System.out.println(Oesterreich.gesamtSteuer());
		System.out.println(Oesterreich.steuerNachBundesland());
	}

}
