package org.campus02.oop;

import java.util.ArrayList;
import java.util.HashMap;

public class Bundesstaat 
{
	private ArrayList<Einwohner> staat;

	public Bundesstaat() 
	{
		staat=new ArrayList<>();
	}

	public void add(Einwohner e)
	{
		staat.add(e);
	}

	public double gesamtSteuer()
	{
		double steuerlast=0;
		for (Einwohner einwohner : staat) 
		{
		steuerlast+=einwohner.steuer();	
		}	
		return steuerlast;
	}

	public HashMap<String, Double> steuerNachBundesland()
	{
		HashMap<String, Double> nachBL = new HashMap<>();
		for (Einwohner einwohner : staat) {
			if(nachBL.containsKey(einwohner.bundesland))
			{
				nachBL.put(einwohner.bundesland, nachBL.get(einwohner.bundesland)+einwohner.steuer());
			}
			else 
			{
				nachBL.put(einwohner.bundesland,einwohner.steuer());
			}
		}
		return nachBL;
	}
	}
