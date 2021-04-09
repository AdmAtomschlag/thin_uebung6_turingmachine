package ch.zhaw;

/**
 * Parses a given word
 */
public class Parser {

    private String[] digits;
    private String[] operators;
    private static final String digitSymbol = "D";
    private static final String operatorSymbol = "O";
    private Stack stack;

    public Parser (){
        digits = new String[10];
        operators = new String[2];
        stack = new Stack();
        setupLanguage();
    }

    /**
     * Fills the language
     */
    private void setupLanguage(){
        for (int i = 0; i < 10 ; i++){
            digits[i] = i + "";
        }

        operators[0] = "+";
        operators[1] = "*";
    }

    public String replaceSymbols(String word){
        for (int i = 0; i < digits.length; i++){
            word = word.replaceAll(digits[i], digitSymbol);
        }

        for (int i = 0; i < operators.length; i++){
            word = word.replaceAll("\\" + operators[i], operatorSymbol);
        }

        return word;
    }


    public boolean validateWord(String word){
        word = replaceSymbols(word);
        String[] wordArray = word.split("");


        return false;
    }


}
