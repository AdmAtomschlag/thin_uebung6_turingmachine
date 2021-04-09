package ch.zhaw;

public class Main {

    public static void main(String[] args) {
	    Parser parser = new Parser();

	    String testExpression = "34+62+*";

	    boolean result = parser.validateWord(testExpression);

        //System.out.println(result);
    }
}
