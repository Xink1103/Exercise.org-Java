import java.util.*;

class ResistorColorTrio {
    private static final String[] resistance =
    new String[] {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
    
    String label(String[] colors) {
        long totalOhms = 0l;
        if(colors.length == 0){
            throw new RuntimeException("Array is empty");
        }else if(colors.length == 1){
            long firstNumber =
            Arrays.asList(resistance).indexOf(colors[0]);
            
            totalOhms = firstNumber;
        }else if(colors.length == 2){
            long firstNumber = 
            Arrays.asList(resistance).indexOf(colors[0]);
            long secondNumber =
            Arrays.asList(resistance).indexOf(colors[1]);

            totalOhms = firstNumber*10 + secondNumber;
        }else{
            int firstNumber  =
            Arrays.asList(resistance).indexOf(colors[0]);
            int secondNumber =
            Arrays.asList(resistance).indexOf(colors[1]);
            int thirdNumber =
            Arrays.asList(resistance).indexOf(colors[2]);

            long unit =(long) Math.pow(10,thirdNumber);
            
            totalOhms = 
            (firstNumber*10 + secondNumber)*unit;
        }
        String label = "";
        if(totalOhms == 0){
            label = String.valueOf(totalOhms)+" ohms";
        }else{
            if(totalOhms % 1000000000 == 0){
                label = 
                String.valueOf(totalOhms/1000000000)+
                " gigaohms";
            }else if(totalOhms % 1000000 == 0){
                label =
                String.valueOf(totalOhms/1000000)+
                " megaohms";
            }else if(totalOhms % 1000 == 0){
                label = 
                String.valueOf(totalOhms/1000) +
                " kiloohms";
            }else{
                label = String.valueOf(totalOhms)+" ohms";
            }
        }
        return label;
    }
}
