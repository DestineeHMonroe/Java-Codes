
public class Song {
	public static void main(String[] args) {
		verse("download", "downloading");
		verse("virus", "running");
		verse("firewall", "reacting");
		middle();
		verse2("full recovery", "executing");
		verse3();
	}

	public static void verse(String item, String verb) {
		System.out.println("There's a " + item + " " + verb + " on your pc,");
		System.out.println("There's a " + item + " " + verb + " on your pc,");
		System.out.println( item + ", " + item + "," );
		System.out.println("There's a " + item + " " + verb + " on your pc.");
		System.out.println("");
	}
	
	public static void middle() {
		System.out.println("Error Error Error");
		System.out.println("");
		System.out.println("Buffering...");
		System.out.println("");
	}
	
	public static void verse2(String item, String verb) {
		System.out.println("There's a " + item + " " + verb + " on your pc,");
		System.out.println("There's a " + item + " " + verb + " on your pc,");
		System.out.println( item + ", " + item + "," );
		System.out.println("There's a " + item + " " + verb + " on your pc.");
		System.out.println("");
	}
	
	public static void verse3() {
		System.out.println("There's a virus running on your pc,");
		System.out.println("There's a virus running on your pc,");
		System.out.println("virus, virus,");
		System.out.println("There's a...");
		System.out.println("");
		System.out.println("CRASH!");
	}
}
