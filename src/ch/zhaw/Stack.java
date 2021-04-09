package ch.zhaw;

public class Stack {

    private String[] stackArray;
    private static final int arraySize = 1000000;
    private static final String emptyIndicator = "$";
    private int stackPointer;

    public Stack(){
        stackArray = new String[arraySize];
        stackArray[0] = emptyIndicator;
        stackPointer = -1;
    }

    public String readSymbol(){
        String symbol = "";
        try{
            symbol = stackArray[stackPointer];
            stackArray[stackPointer] = "";
            stackPointer--;
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }

        return symbol;
    }

    public void writeSymbol(String symbol){
        try{
            stackPointer++;
            stackArray[stackPointer] = symbol;
        } catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }

}
