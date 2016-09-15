public class PokemonDriver{
	
	public static void main(String[] args){

		Pokemon p1 = new Pokemon("Eevee", 500, true);
		System.out.println(p1.toString());

		Pokemon p2 = new Pokemon("Dragonite", 1500, false);
		System.out.println(p2.toString());

		Pokemon p3 = new Pokemon("Dratini", 100, false);
		System.out.println(p3.toString());

	}
}
