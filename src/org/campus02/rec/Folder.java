package org.campus02.rec;

import java.util.ArrayList;

public class Folder extends FSEntry {

	private ArrayList<FSEntry> files = new ArrayList<>();
	private ArrayList<FSEntry> folders = new ArrayList<>();
	
	public Folder(String name) {
		super(name);
	}
	
	public void putEntry(File entry) {
		files.add(entry);
	}
	
	public void putEntry(Folder entry) {
		folders.add(entry);
	}
			
	@Override
	public void print() 
	{
	System.out.println(getName() + " : Folder");
	}
	
	public void printAll() 
	{
		for (FSEntry fsEntry : folders) 
		{
			fsEntry.print();
		}
		for (FSEntry fsEntry : files) {
			fsEntry.print();
		}
	}
	
	public void listAllContent(String prefixPath) 
	{

		for (FSEntry fsEntry : files) 
		{
				fsEntry.print();
		}		
		for (FSEntry fsEntry : folders) {
		Folder check = (Folder)fsEntry;
		if(check.folders.isEmpty())
		{
			System.out.print(fsEntry.getName() + "/"  );
			check.listAllContent(fsEntry.getName());
		}
		else
		{
			System.out.print(prefixPath + "/"  );
			check.listAllContent(fsEntry.getName());
		}
		}	
	}
	
	public void printTree(String indent) 
	{
		// TODO implement the recursive(!) method here...
	}

}
