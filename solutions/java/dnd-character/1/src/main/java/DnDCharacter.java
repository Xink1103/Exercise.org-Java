import java.util.*;

class DnDCharacter {

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    
    public int ability(List<Integer> scores) {
        List<Integer> copyRollDice = new ArrayList<>(scores);
        copyRollDice.sort(Comparator.naturalOrder());
        copyRollDice.remove(0);
        int abilityPoint = 0;
        for(Integer diceScore : copyRollDice){
            abilityPoint += diceScore;
        }
        return abilityPoint;
    }

    public List<Integer> rollDice() {
        Random ability = new Random();
        Integer dice1 = ability.nextInt(6)+1;
        Integer dice2 = ability.nextInt(6)+1;
        Integer dice3 = ability.nextInt(6)+1;
        Integer dice4 = ability.nextInt(6)+1;
        List<Integer> diceSelector = new ArrayList<>();
        diceSelector.add(dice1);
        diceSelector.add(dice2);
        diceSelector.add(dice3);
        diceSelector.add(dice4);
        return diceSelector;
    }

    public DnDCharacter(){
        strength = ability(rollDice());
        dexterity = ability(rollDice());
        constitution = ability(rollDice());
        intelligence = ability(rollDice());
        wisdom = ability(rollDice());
        charisma = ability(rollDice());
    }
    
    public int modifier(int input) {
        return (int)Math.floor((input - 10) / 2.0); 
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public int getHitpoints() {
        return 10 + (int)Math.floor((constitution - 10) / 2.0);
    }
}
