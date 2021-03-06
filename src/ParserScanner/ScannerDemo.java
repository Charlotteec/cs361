package ParserScanner;

/**
 * @author Christelle
 * and Charlotte Coffin and Christina Annechino
 * 
 */
public class ScannerDemo {

	private static String file1 = "prog2.jay";
	private static String file2 = "test.jay";
	private static String file3 = "prog.jay";
	private static int counter = 1;

	public static void main(String args[]) {

		TokenStream ts = new TokenStream(file3);

		System.out.println(file3);

		while (!ts.isEndofFile()) {
			System.out.print("Token " + counter + " : ");
			Token t = ts.nextToken();
			if(t == null) {
				System.out.println("Null");
			}
			System.out.println(t.toString());
			counter++;
		}
	}
}
