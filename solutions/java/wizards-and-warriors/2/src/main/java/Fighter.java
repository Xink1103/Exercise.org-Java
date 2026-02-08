class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {

    @Override
    boolean isVulnerable(){
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter){
        return fighter.isVulnerable() ? 10 : 6;
    }

    @Override
    public String toString(){
        return "Fighter is a Warrior";
    }
    
}

class Wizard extends Fighter{

    private boolean spellIsReady;
    
    @Override
    public String toString(){
        return "Fighter is a Wizard";
    }

    public void prepareSpell(){
       spellIsReady = true; 
    }

    @Override
    boolean isVulnerable(){
        return spellIsReady ? false : true;
    }

    @Override
    int getDamagePoints(Fighter fighter){
        return isVulnerable() ? 3 : 12;
    }
    
}