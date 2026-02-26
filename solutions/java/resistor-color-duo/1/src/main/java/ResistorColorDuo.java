import java.util.*;

class ResistorColorDuo {
    private final String[] resistance = new String[]{
"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
    
    int value(String[] colors) {
        if(colors.length == 0){
            throw new RuntimeException("Array is empty");
        }else if(colors.length == 1){
            int firstNumber = 
            Arrays.asList(resistance).indexOf(colors[0]);
            return firstNumber;    
        }else{
            int firstNumber = 
            Arrays.asList(resistance).indexOf(colors[0]);
            int secondNumber =
            Arrays.asList(resistance).indexOf(colors[1]);

            String firstNumberText = 
            String.valueOf(firstNumber);
            String secondNumberText =
            String.valueOf(secondNumber);    
            
            int result = 
            Integer.valueOf(firstNumberText + 
                            secondNumberText);
            return result;
        }
    }
}
