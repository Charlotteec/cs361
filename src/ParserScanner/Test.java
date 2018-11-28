package ParserScanner;


public class Test {

	//x=5
	public Test() {
		Assignment a = new Assignment();
		a.target = new Variable();
		a.target.id = "x";
		a.source = new Value(5);		
		
	}

}
