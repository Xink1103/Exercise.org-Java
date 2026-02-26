import java.util.*;

class ResistorColor {

    private String[] resistance;
    
    public ResistorColor(){
        resistance = new String[]{"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
    }
    
    int colorCode(String color) {
        return Arrays.asList(resistance).indexOf(color);
    }

    String[] colors() {
        return resistance;
    }
}
