package org.campus02.rec;

import java.util.ArrayList;

public class Folder extends FSEntry
	{

		private ArrayList<FSEntry> files = new ArrayList<>();
		private ArrayList<FSEntry> folders = new ArrayList<>();

		public Folder(String name)
			{
				super(name);
			}

		public void putEntry(File entry)
			{
				files.add(entry);
			}

		public void putEntry(Folder entry)
			{
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
				for (FSEntry fsEntry : files)
					{
						fsEntry.print();
					}
			}

		public void listAllContent(String prefixPath)
			{
				for (FSEntry fsEntry : files)
					{
						System.out.print(prefixPath);
						fsEntry.print();
					}
				for (FSEntry fsEntry : folders)
					{
						Folder temp = (Folder) fsEntry;
						temp.listAllContent(prefixPath+temp.getName()+"/");
					}

			}

		public void printTree(String indent){
		System.out.println(indent + "+"+getName() +"/");
				for (FSEntry fsEntry : files)
					{
						System.out.print(indent+"  -");
						fsEntry.print();
					}
				for (FSEntry fsEntry : folders)
					{
						Folder temp = (Folder) fsEntry;
						temp.printTree(indent+"  ");
					}
			}

	}
