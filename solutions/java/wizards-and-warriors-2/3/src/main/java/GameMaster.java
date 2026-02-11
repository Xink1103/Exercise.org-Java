public class GameMaster {

    public String describe(Character character){
        return "You're a level "+character.getLevel()+" "+
            character.getCharacterClass()+" with "+
            character.getHitPoints()+" hit points.";
    }

    public String describe(Destination destination){
        return "You've arrived at "+destination.getName()+
                ", which has "+destination.getInhabitants()+
                " inhabitants.";
    }

    public String describe(TravelMethod travelMethod){
        return travelMethod == TravelMethod.HORSEBACK 
            ? "You're traveling to your destination on horseback."
            : "You're traveling to your destination by walking.";
    }

    public String describe(Character character,Destination destination,TravelMethod travelMethod){
        return describe(character)+" "+describe(travelMethod)+" "+describe(destination);
    }
    
    public String describe(Character character,Destination destination){
        TravelMethod travelMethod = TravelMethod.WALKING;
        return describe(character)+" "+describe(travelMethod)+" "+describe(destination);
    } 
}
