import java.util.*;

class ResistorColor {

    private Map<String,Integer> resistance;
    
    public ResistorColor(){
        resistance = new LinkedHashMap<>();
        resistance.put("black",0);
        resistance.put("brown",1);
        resistance.put("red",2);
        resistance.put("orange",3);
        resistance.put("yellow",4);
        resistance.put("green",5);
        resistance.put("blue",6);
        resistance.put("violet",7);
        resistance.put("grey",8);
        resistance.put("white",9);
    }
    
    int colorCode(String color) {
        return resistance.get(color);
    }

    String[] colors() {
        String[] allColor = new String[]{};
        Set<String> allColorSet = new HashSet<>();
        allColorSet = resistance.keySet();
        allColor = allColorSet.toArray(new String[0]);
        return allColor;
    }
}
