package Hase;

public class Hasenbuch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		lesen(4, " ");
	}


	public static void lesen(int tiefe, String indent)
	{

		if (tiefe ==0)
			{
				System.out.println("Ein Hase ... ");
				return;
			}

		System.out.println(indent+"Ein Hase der gern Bücher las ");
		System.out.println(indent+"Fand ein Buch und las:");

		lesen(--tiefe,indent+"-");
	}
}
